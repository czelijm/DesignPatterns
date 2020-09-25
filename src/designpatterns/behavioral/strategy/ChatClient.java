package designpatterns.behavioral.strategy;

public class ChatClient {
//    private String encryptionAlgorithm;
//    private EnctyptionAlgoritm;

    public ChatClient(){
    }

    public void send(String message, EncryptionAlgorithm algorithm) throws Exception {

        if (algorithm == null) throw new Exception("Algorithm not supported");

        algorithm.encrypt(message);

        System.out.println("Message send");
    }
}
