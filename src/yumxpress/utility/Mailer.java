/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.utility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import yumexpress.pojo.CustomerPojo;
import yumexpress.pojo.OrderPojo;
import yumexpress.pojo.StaffPojo;
/**
 *
 * @author hp
 */
class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}
public class Mailer {
    private static Properties prop;

    static {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

    }

    public static void sendMail(Map<String, String> emailCredentials, StaffPojo staff) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(staff.getEmailId())
        );
        String emailSubject = "Staff Details";

        String emailBody = "Dear " + staff.getStaffName() + ",\n"
                + "\n"
                + "I hope this email finds you well. I am writing to provide you with the necessary staff details as requested. Please find the information below:\n"
                + "\n"
                + "Staff ID: " + staff.getStaffId() + "\n"
                + "Company Name: " + OwnerProfile.getCompanyName() + "\n"
                + "Email ID: " + staff.getEmailId() + "\n"
                + "Staff password: " + PasswordEncryption.getDecryptedPassword(staff.getPassword()) + "\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n"
                + "\n"
                + OwnerProfile.getOwnerName();

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
    public static void sendMail(Map<String, String> emailCredentials, CustomerPojo customer) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(customer.getEmailId())
        );
        String emailSubject = "Welcome to YumXpress App - Your Ultimate Food Ordering Companion!";

        String emailBody = "Dear " + customer.getCustomerName() + ",\n"
                
                + "\n"
                + "We are happy to have as our esteemed customer. Please find your account info:\n"
                + "\n"
                + "Customer ID: " + customer.getCustomerId() + "\n"
                + "Your Name: " + customer.getCustomerName() + "\n"
                + "Email ID(logind): " + customer.getEmailId() + "\n"
                + "Iniitial password: " + PasswordEncryption.getDecryptedPassword(customer.getPassword()) + "\n"
                + "\n"
                + "Happy Hunger!!!\n"
                + "Best regards,\n"
                + "\n"
                + "YumXpress!";

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }

    public static void sendMail(Map<String, String> emailCredentials, OrderPojo order) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(UserProfile.getEmailId())
        );
        double taxRate=0.075;
        double taxAmt=order.getProductPrice()*taxRate;
        double billAmount=order.getProductPrice()+taxAmt;
        
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        String orderDate= sdf.format(today);
        String emailSubject = "Order Confirmation Mail!";

        String emailBody = "Dear " + order.getCustomerName() + ",\n"
                
                + "\nFollowing are your order details:\n"
                + "\nOrder Id:"+order.getOrderId()+"\n"
                + "\nProduct Name:"+order.getProductName()+"\n"
                + "\nCompany:"+order.getCompanyName()+"\n"
                + "\nComapny email:"+order.getCompanyEmailId()+"\n"
                + "\nProduct Price:"+order.getProductPrice()+"\n"
                + "\nTax Amt:"+taxAmt+"\n"
                + "\nBill Amt:"+billAmount+"\n"
                + "\nDelivery Staff Name:"+order.getDeliveryStaffName()+"\n"
                + "\nOTP:"+order.getOtp()+"\n"
                + "\nPlease share this OTP with the delivery staff\n"
                + "\nOrder Date:"+orderDate+"\n"
                + "\nThank You for Ordering!!\n\nHappy Hunger!";
              
        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
    
}
