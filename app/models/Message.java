package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import helpers.Constants;
import helpers.Constants.*;
/**
 * Created by User on 4/13/2016.
 */
@Entity
public class Message extends Model {

    @Id
    public Integer id;
    public String customerEmail;
    public String subject;
    @Column(columnDefinition = "TEXT")
    public String messageText;
    public Date createDate;
    public Boolean status;
    public Boolean deleteStatus;

    @ManyToOne
    public AppUser user;

    public Message () {}
    public Message(String customerEmail,String subject, String messageText, Date createDate, Boolean status, Boolean deleteStatus) {
        this.customerEmail = customerEmail;
        this.subject = subject;
        this.messageText = messageText;
        this.createDate = createDate;
        this.status = status;
        this.deleteStatus = deleteStatus;
    }

    public static Finder<String, Message> finder = new Finder<>(Message.class);


    public static Boolean saveMessage (String customerEmail, String subject, String messageText, Integer userId) {
        try {
            AppUser user = AppUser.findUserById(userId);
            Message message = new Message();
            message.customerEmail = customerEmail;
            message.subject = subject;
            message.messageText = messageText;
            message.createDate = new Date();
            message.status = Constants.NEW_MESSAGE;
            message.deleteStatus = Constants.ACTIVE_MESSAGE;
            message.user = user;

            message.save();
            return true;
        }catch (PersistenceException e ) {
            return false;
        }
    }

    /* ------------------- get all users messages ------------------ */

    public static List<Message> userMessages(Integer userId) {
        return  finder.where().eq("user_id", userId).findList();
    }

    /* ------------------- get message by id ------------------ */

    public static Message findMessageById(Integer messageId) {
        return finder.where().eq("id", messageId).findUnique();
    }


    /* ------------------- format date message  ------------------ */

    public String getSentDate() {
        if (createDate == null) {
            return "NO DATE RECORDED";
        }
        return new SimpleDateFormat("HH:mm EEE, dd MMM yyyy").format(createDate);
    }

    /* ------------------- delete  message  ------------------ */

    public static Integer deleteMessage(Integer messageId) {
        Message message = findMessageById(messageId);
        message.deleteStatus = Constants.DELETED_MESSAGE;
        message.update();
        return message.user.id;
    }

    /* ------------------- finds number of new  messages  ------------------ */

    public static Integer numberOfNewMessages(Integer userId) {
        return finder.where().eq("user_id", userId).eq("status", Constants.NEW_MESSAGE).findRowCount();
    }
}
