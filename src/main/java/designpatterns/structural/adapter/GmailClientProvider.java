package designpatterns.structural.adapter;

import designpatterns.structural.adapter.Gmail.GmailClient;

public class GmailClientProvider implements EmailProvider {
    GmailClient gmailClient;

    public GmailClientProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    public void connect() {
        gmailClient.connect();
    }

    public void getEmails() { gmailClient.getEmails(); }

    public void disconnect() {
        gmailClient.disconnect();
    }

    @Override
    public void downloadEmails() { System.out.println("Downloading emails"); }
}
