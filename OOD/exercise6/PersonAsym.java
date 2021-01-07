package exercise6;

import java.security.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/21/2020
 **/

public class PersonAsym {

    private final String name;
    private final AsymmetricEncrypter encrypter;
    private final PublicKey publicKey;
    private final PrivateKey privateKey;
    private final Queue<EncodedMsgWithSignature> msgQueue;

    public PersonAsym(String name) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair pair = keyPairGenerator.generateKeyPair();
        publicKey = pair.getPublic();
        privateKey = pair.getPrivate();
        encrypter = new AsymmetricEncrypter();
        msgQueue = new LinkedList<>();
        this.name = name;
    }

    public void sendMsg(String msg, PersonAsym to) throws Exception {
        msg = this.name + " -> " + to.name + ": " + msg;
        byte[] encodedMsg = encrypter.encrypt(msg, to.publicKey);
        System.out.println(new String(encodedMsg, "UTF8"));
        to.receiveMsg(
                new EncodedMsgWithSignature(
                        encodedMsg,
                        this,
                        signEncodeMsg(encodedMsg)));
    }

    public String readMsg() throws Exception {
        if (!haveMsg()) {
            return null;
        }
        EncodedMsgWithSignature msg = msgQueue.poll();
        verifySignature(msg);
        return encrypter.decrypt(msg.encodedMsg, privateKey);
    }

    public boolean haveMsg() {
        return !msgQueue.isEmpty();
    }

    private void receiveMsg(EncodedMsgWithSignature msg) {
        msgQueue.add(msg);
    }

    private byte[] signEncodeMsg(byte[] encodedMsg) throws Exception {
        Signature sign = Signature.getInstance("SHA256withRSA");
        sign.initSign(privateKey);
        sign.update(encodedMsg);
        return sign.sign();
    }

    private void verifySignature(EncodedMsgWithSignature msg) throws Exception {
        Signature sign = Signature.getInstance("SHA256withRSA");
        sign.initVerify(msg.sender.publicKey);
        sign.update(msg.encodedMsg);
        if (sign.verify(msg.signature)) {
            System.out.println("Signature verified");
            return;
        }
        throw new SecurityException("Signature not verified for msg from" + msg.sender.name);
    }

    private static class EncodedMsgWithSignature {
        byte[] encodedMsg;
        PersonAsym sender;
        byte[] signature;

        private EncodedMsgWithSignature(byte[] encodedMsg, PersonAsym sender, byte[] signature) {
            this.encodedMsg = encodedMsg;
            this.sender = sender;
            this.signature = signature;
        }
    }

}
