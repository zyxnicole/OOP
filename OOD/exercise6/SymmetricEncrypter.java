package exercise6;

import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/23/2020
 **/

public class SymmetricEncrypter {
    private static final String ALGORITHM = "AES";
//    private final byte[] IV;
//    private final SecretKey key;
    private Cipher cipher;

    public SymmetricEncrypter() throws Exception{
//        IV = new byte[12];
//        KeyGenerator gen = KeyGenerator.getInstance(ALGORITHM);
//        gen.init(256);
//        key = gen.generateKey();
//        SecureRandom random = new SecureRandom();
//        random.nextBytes(IV);
        cipher = Cipher.getInstance("AES/GCM/NoPadding");
    }

    public byte[] encrypt(String msg, SecretKey key, byte[] IV) throws Exception{
        byte[] plainBytes = msg.getBytes();
        cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), ALGORITHM);
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(16 * 8, IV);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);
        byte[] cipherBytes = cipher.doFinal(plainBytes);
        return cipherBytes;
    }

    public String decrypt(byte[] cipherText, SecretKey key, byte[] IV) throws Exception{
        cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), ALGORITHM);
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(16 * 8, IV);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);
        byte[] plainBytes = cipher.doFinal(cipherText);
        return new String(plainBytes);
    }
}
