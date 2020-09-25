package designpatterns.behavioral.strategy;

public class StrategyDemo {
    public static void runDemo() throws Exception {
        System.out.println("-------------------------Strategy demo------------------------------");
        ChatClient chatClient = new ChatClient();
        chatClient.send("XD",new AESEncryption());
        chatClient.send("XD",new DESAlgorithm());
    }
}
