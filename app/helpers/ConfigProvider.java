package helpers;

import play.Play;

/**
 * Created by User on 2/12/2016.
 */

public class ConfigProvider {

    // Configurations for email
    public static final String SMTP_HOST = Play.application().configuration().getString("smtp.host");
    public static final String SMTP_PORT = Play.application().configuration().getString("smtp.port");
    public static final String SMTP_USER = Play.application().configuration().getString("mail.smtp.user");
    public static final String MAIL_FROM = Play.application().configuration().getString("mailFrom");
    public static final String MAIL_FROM_PASS = Play.application().configuration().getString("mailFromPass");

}