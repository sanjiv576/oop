


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String message = "Hello Boss";
        String subject = "User verification";
        String to = "shresthasanjiv576@gmail.com";
        String from = "shresthasanjiv576@gmail.com";

        sendEmail(message, subject, to, from);
    }

    // creating a method to send email
    private static void sendEmail(String message, String subject, String to, String from){

        // variable for email host
        String host = "smtp.gmail.com";  // smtp = simple mail transfer protocol

        // getting the system properties
        Properties properties = System.getProperties();
        System.out.println("Properties msg: " + properties);

        // setting important information to properties object

        // host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");  // 465 is a Google port
        properties.put("mail.smtp.ssl.enable", "true");  //
        properties.put("mail.smtp.auth", "true");


        // Step 1: to get session object --> checking whether provided username and password are true or not

        Session session = Session.getInstance(properties, new Authenticator(){

            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("shresthasanjiv576@gmail.com", "ramechhap1102");
            }
        });

        // debugging if in case we are missing or doing something mistake

        session.setDebug(true);

        // Step: 2 compose the email (email,attachment or multi media)
        MimeMessage mimeMessage = new MimeMessage(session);

        try {
            // from email
            mimeMessage.setFrom(from);   // from which account to send email

            // adding recipient to the email
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));


            // adding subject to the email
            mimeMessage.setSubject(subject);

            // adding text to the email
            mimeMessage.setText(message);

            // sending the email

            // Step: 3 send the message/email using Transport Class
            Transport.send(mimeMessage);

            System.out.println("Email has been sent");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
