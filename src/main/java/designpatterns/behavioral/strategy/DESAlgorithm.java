package designpatterns.behavioral.strategy;

public class DESAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
            System.out.println("Encrypting using DES algorithm");
            return "DES";
    }
}
