package exercise6;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/23/2020
 **/

public class PersonSym {
    private static final String ALGORITHM = "AES";
    private final String name;
    private final SymmetricEncrypter encrypter;
    private final Queue<EncodedMsgWithKey> msgQueue;
    private final byte[] IV;
    private final SecretKey key;

    public PersonSym(String name) throws Exception {
        encrypter = new SymmetricEncrypter();
        msgQueue = new LinkedList<>();
        this.name = name;
        IV = new byte[12];
        KeyGenerator gen = KeyGenerator.getInstance(ALGORITHM);
        gen.init(256);
        key = gen.generateKey();
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);
    }
    public void setMsg(String msg, PersonSym to) throws Exception{
        msg = this.name + " -> " + to.name + ": " + msg;
        byte[] encodedMsg = encrypter.encrypt(msg, key, IV);
        System.out.println(new String(encodedMsg, "UTF8"));
        to.receiveMsg(new EncodedMsgWithKey(encodedMsg, this.key, this.IV));
    }
    private void receiveMsg(EncodedMsgWithKey encodedMsgWithKey) {
        msgQueue.add(encodedMsgWithKey);
    }
    public boolean haveMsg() {
        return !msgQueue.isEmpty();
    }
    public String readMsg() throws Exception {
        if (!haveMsg()) {
            return null;
        }
        EncodedMsgWithKey encodedMsgWithKey = msgQueue.poll();
       return encrypter.decrypt(encodedMsgWithKey.encodedMsg, encodedMsgWithKey.key, encodedMsgWithKey.IV);
    }

    private static class EncodedMsgWithKey {
        byte[] encodedMsg;
        SecretKey key;
        byte[] IV;

        private EncodedMsgWithKey(byte[] encodedMsg, SecretKey key, byte[] IV) {
            this.encodedMsg = encodedMsg;
            this.key = key;
            this.IV = IV;
        }
    }
}
