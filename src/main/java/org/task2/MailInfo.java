package org.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generateMail() {
        return mailCode.generate(client);
    }

    public String generateTitle() {
        return mailCode.generateTitle(client);
    }

    public String getFrom() {
        return mailCode.getFrom();
    }

    public String getFromEmail() {
        return mailCode.getFromEmail();
    }
}
