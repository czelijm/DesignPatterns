package designpatterns.structural.facade;

import java.util.List;

public class TweetsReceiver {
    public static List<Tweet> getRecentTweets(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
        return tweets;
    }
}
