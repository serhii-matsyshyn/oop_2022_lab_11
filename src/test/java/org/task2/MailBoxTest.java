package org.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import junit.framework.TestCase;

public class MailBoxTest extends TestCase {

    public void testSendAllMail() throws MailjetSocketTimeoutException, MailjetException {
        MailBox mailBox = new MailBox();
        MailInfo mailInfo = new MailInfo(
                new Client("ClientABC", 99, Gender.MALE, "<example_email>@ucu.edu.ua"),
                new GiftMail());
        mailBox.addMailInfo(mailInfo);
        mailInfo = new MailInfo(new Client("ClientCAB", 10, Gender.FEMALE, "<example_email>@ucu.edu.ua"),
                new CongratulationMail());
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAllMail();
    }
}