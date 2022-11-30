package org.task2;

public class GiftMail implements MailCode {
    private static String FROM = "!EDUCATIONAL PROJECT! Gift";
    private static String FromEmail = "gift@example.com";
    private static String TEMPLATE = "%NAME congratulations! You've got a gift! !EDUCATIONAL PROJECT!";
    private static String TITLE = "!EDUCATIONAL PROJECT! Congratulations %NAME!";
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }

    public String generateTitle(Client client) {
        return TITLE.replaceAll("%NAME", client.getName());
    }

    public String getFrom() {
        return FROM;
    }

    public String getFromEmail() {
        return FromEmail;
    }
}
