package org.task2;

public class CongratulationMail implements MailCode {
    private static String FROM = "!EDUCATIONAL PROJECT! Congratulation";
    private static String FromEmail = "congratulation@example.com";
    private static String TEMPLATE = "%NAME congratulations with birthday! You are %AGE now! !EDUCATIONAL PROJECT!";
    private static String TITLE = "!EDUCATIONAL PROJECT! Congratulations %NAME with birthday!";
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName()).replaceAll("%AGE", String.valueOf(client.getAge()));
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
