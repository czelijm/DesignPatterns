package designpatterns.structural.adapter;

import designpatterns.structural.adapter.Gmail.GmailClient;

public class AdapterDemo {
    public static void runDemo() {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailClientProvider(new GmailClient()));
        emailClient.downloadEmails();
    }
}
