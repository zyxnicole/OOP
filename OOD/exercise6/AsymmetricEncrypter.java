package exercise6;

import javax.crypto.Cipher;
import java.security.*;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/21/2020
 **/

public class AsymmetricEncrypter {
    Cipher cipher;

    public AsymmetricEncrypter() throws Exception {
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    byte[] encrypt(String msg, PublicKey publicKey) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] input = msg.getBytes();
        cipher.update(input);
        return cipher.doFinal();
    }

    String decrypt(byte[] cipherText, PrivateKey privateKey) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decipherText = cipher.doFinal(cipherText);
        return new String(decipherText);
    }



}
