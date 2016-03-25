package models;

import com.avaje.ebean.Model;
import helpers.ConfigProvider;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by User on 3/18/2016.
 */
public class Email extends Model {

    public static void createAccountMail(String userEmail, String password){

        SimpleEmail email = new SimpleEmail();
        email.setHostName(ConfigProvider.SMTP_HOST);
        email.setSmtpPort(Integer.parseInt(ConfigProvider.SMTP_PORT));
        try {
                /*Configuring mail*/
            email.setAuthentication(ConfigProvider.MAIL_FROM, ConfigProvider.MAIL_FROM_PASS);
            email.setFrom(ConfigProvider.MAIL_FROM);
            email.setStartTLSEnabled(true);
            email.addTo(userEmail);
            email.setSubject("Namještaj.ba - Profil kreiran");
            email.setMsg("Poštovani, " + "\n" +
                    "Želimo Vas obavijestiti da je Vaš profil kreiran." + "\n" +
                    "Profilu mozete pristupiti uz sljedeće podatke:" + "\n" +
                    "Username: " + userEmail + "\n" +
                    "Password: " + password + "\n" +
                    "Molimo Vas da dopunite informacije koje nedostaju na Vašem profilu, kako bi Vas kupci mogli lakše pronaći i kontaktirati." + "\n"+
                    "Želimo Vam puno uspjeha." + "\n" +
                    "Vaš," + "\n" +
                    "Namještaj.ba");


            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }


    public static void contactFormEmail(String name, String userEmail, String phone, String messsage){


        SimpleEmail email = new SimpleEmail();
        email.setHostName(ConfigProvider.SMTP_HOST);
        email.setSmtpPort(Integer.parseInt(ConfigProvider.SMTP_PORT));
        try {
                /*Configuring mail*/
            email.setAuthentication(ConfigProvider.MAIL_FROM, ConfigProvider.MAIL_FROM_PASS);
            email.setFrom(ConfigProvider.MAIL_FROM);
            email.setStartTLSEnabled(true);
            email.addTo(ConfigProvider.MAIL_FROM);
            email.setSubject("Poruka");
            email.setMsg("Ime i prezime:  " + name + "\n" +
                    "Email:  " + userEmail + "\n" +
                    "Telefon:  " + phone + "\n" +
                    "Poruka :  "  + "\n" + messsage);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }
}
