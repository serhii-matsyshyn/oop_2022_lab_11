package org.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Main {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MailBox mailBox = new MailBox();
        MailInfo mailInfo = new MailInfo(
                new Client("ClientABC", 99, Gender.MALE, "<example_email>@ucu.edu.ua"),
                new GiftMail());
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAllMail();
    }
}