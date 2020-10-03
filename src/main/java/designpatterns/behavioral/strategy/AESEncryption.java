package designpatterns.behavioral.strategy;

public class AESEncryption implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting using AES algorithm");
        return "AES";
    }

}
