package com.tunisianwatch.Util;

import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

    public void send(/*String to, String from, String sujet, String msg*/) throws UnsupportedEncodingException {

        /*String host = "localhost";
        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("smtp.gmail.com", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(sujet);

            // Now set the actual message
            message.setText(msg);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }*/
        
        
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = "...";

        try {
            Message msg = new MimeMessage(session);
            System.out.println("1");
            msg.setFrom(new InternetAddress("youssef.farouk91@gmail.com", "Example.com Admin"));
            System.out.println("2");
            msg.addRecipient(Message.RecipientType.TO,new InternetAddress("farouk.youssef@esprit.tn", "Mr. User"));
            System.out.println("3");
            msg.setSubject("Your Example.com account has been activated");
            System.out.println("4");
            msg.setText(msgBody);
            System.out.println("5");
            
            Transport.send(msg);
            System.out.println("6");

        } catch (AddressException e) {
            System.out.println(e.getMessage()+" addrexc");
        } catch (MessagingException e) {
            System.out.println(e.getMessage()+" msgexc");
        }
    }
}