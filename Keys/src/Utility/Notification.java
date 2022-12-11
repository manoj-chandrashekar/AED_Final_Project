/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author nagarjunmallesh
 */
public class Notification {
    private Session mailSession;
    private String fromEmail;
    private String subject;
    private String password;
    private String body;
    
    
//    public Notification(String emailto,String subject,String body) throws MessagingException {
//        this.emailto=emailto;
//        this.subject=subject;
//        this.body=body;
//        setMailServerProperties();
//        sendFromGMail(from, pass, to, subject, body);
//    }
//    
    public Notification(){
        this.fromEmail="manuc2012@gmail.com";
        this.password="rxdgvxkohesxzimc";
    }
    
    public void sendMail(String toEmail, String subject, String emailMessage){
        Properties emailProperties = System.getProperties();
        String host = "smtp.gmail.com";
        emailProperties.put("mail.smtp.starttls.enable", "true");
        emailProperties.put("mail.smtp.host", host);
        emailProperties.put("mail.smtp.user", fromEmail);
        emailProperties.put("mail.smtp.password", password);
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(emailProperties);
        MimeMessage message = new MimeMessage(session);
        
        try{
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(emailMessage);
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
    }
    
//    private void setMailServerProperties()
//    {
//        Properties emailProperties = System.getProperties();
//        emailProperties.put("mail.smtp.starttls.enable", "true");
//        emailProperties.put("mail.smtp.port", "587");
//        emailProperties.put("mail.smtp.auth", "true");
//        
//        mailSession = Session.getDefaultInstance(emailProperties, null);
//    }
//    private void sendMail(){
//        String from = "manuc2012@gmail.com";
//        String pass = "rxdgvxkohesxzimc";
//        String[] to = { "manuc2012@gmail.com" }; // list of recipient email addresses
//        String subject = "Keys - Student Accomodation Application";
//        String body = " Hi,\nHope you are having a good day! ";
//
//
//
//       sendFromGMail(from, pass, to, subject, body);
//    }
//    
//    
//    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
//        Properties props = System.getProperties();
//        String host = "smtp.gmail.com";
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.user", from);
//        props.put("mail.smtp.password", pass);
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.auth", "true");
//
//
//
//       Session session = Session.getDefaultInstance(props);
//        MimeMessage message = new MimeMessage(session);
//
//
//
//       try {
//            message.setFrom(new InternetAddress(from));
//            InternetAddress[] toAddress = new InternetAddress[to.length];
//
//
//
//           // To get the array of addresses
//            for( int i = 0; i < to.length; i++ ) {
//                toAddress[i] = new InternetAddress(to[i]);
//            }
//
//
//
//           for( int i = 0; i < toAddress.length; i++) {
//                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
//            }
//
//           message.setSubject(subject);
//            message.setText(body);
//            Transport transport = session.getTransport("smtp");
//            transport.connect(host, from, pass);
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();
//        }
//        catch (AddressException ae) {
//            ae.printStackTrace();
//        }
//        catch (MessagingException me) {
//            me.printStackTrace();
//        }
//    }
//    
}
