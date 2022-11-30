package org.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> mailInfoList = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        mailInfoList.add(mailInfo);
    }

    public void sendAllMail() throws MailjetSocketTimeoutException, MailjetException {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : mailInfoList) {
            mailSender.sendMail(mailInfo);
        }
    }
}
