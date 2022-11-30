package org.task2;

public interface MailCode {
    String generateTitle(Client client);
    String generate(Client client);

    String getFrom();
    String getFromEmail();
}
