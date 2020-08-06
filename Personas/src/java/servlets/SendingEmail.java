/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Dinamo
 */
class SendingEmail {
    private String userEmail;
    private String myHash;
    
    public SendingEmail(String userEmail, String myHash){
    this.userEmail = userEmail;
    this.myHash = myHash;
    }
    public void sendEmail(){
            String email  ="alex.paunescu89@gamil.com";
            String pword = "XXxxas";
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            
            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(email, pword);
                }
    });
            try{
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(email));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
                message.setSubject("Personas Email Verification Link");
                
            }catch(Exception ex){
                System.out.println("Sending email..."+ex);
            }
    }
}
