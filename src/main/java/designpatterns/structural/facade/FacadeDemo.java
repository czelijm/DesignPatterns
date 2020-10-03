package designpatterns.structural.facade;

public class FacadeDemo {
  public static void runDemo() {
    var tweets = TweetsReceiver.getRecentTweets();
  }
}
