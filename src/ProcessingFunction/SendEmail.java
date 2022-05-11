/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessingFunction;

/**
 *
 * @author MTHUAN
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class SendEmail implements Runnable{
    private String recepient = null;
    private String titleEmail = null;
    private String contentEmail = null;
    
    public SendEmail(String recepient,String titleEmail,String contentEmail) {
        this.recepient = recepient;
        this.titleEmail = titleEmail;
        this.contentEmail = contentEmail;
    }
    
    
    
    public static boolean sendMail(String recepient,String titleEmail,String contentEmail) throws Exception{
        System.out.println("Prepare send email");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "gasieuviet1234@gmail.com";
        String myPassword = "gacuanam123";
        
        JOptionPane pane = new JOptionPane("Đang gửi mã xác nhận đến Email...", JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = pane.createDialog(null, "Vui lòng chờ ...");
        dialog.setModal(false);
        dialog.setVisible(true);
        
        Session session = Session.getInstance(properties,new Authenticator() {
            @Override
            protected  PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail, myPassword);
            }
        });
        
        Message message = null;
        message = prepareMessage(session,myAccountEmail,recepient,titleEmail,contentEmail);
        if(message == null){
            return false;        
        }
        try {
            Transport.send(message);
        } catch (Exception e) {
            return false;
        }
        
        JOptionPane.showMessageDialog(null, "Gửi email thành công");
        //Tự dộng mất khung thông báo
        new javax.swing.Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        }).start();
        return true;
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, String titleEmail, String htmlCode) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(titleEmail);
            message.setContent(htmlCode,"text/html");
            return message;
        } catch (Exception e) {
            System.out.println("Can't send Email !!! Error : " + e);
        }
        return null;
    }

    @Override
    public void run() {
        try {
            SendEmail.sendMail(recepient, titleEmail, contentEmail);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lấy mã xác nhận không thành công .Vui lòng kiểm tra lại kết nối");
        }
    }   
}
