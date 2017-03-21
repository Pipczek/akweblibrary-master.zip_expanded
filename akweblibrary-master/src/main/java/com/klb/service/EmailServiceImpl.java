package com.klb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//klasa wo wysylania emaili
@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String fromAddress, String toAddress, String subject, String body) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(toAddress);
        mailMessage.setFrom(fromAddress);
        mailMessage.setSubject("[SzkolenieSpring] " + subject);
        mailMessage.setText(body);

        mailSender.send(mailMessage);
    }
}
