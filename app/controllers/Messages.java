package controllers;

import helpers.Authenticator;
import helpers.Constants;
import helpers.UserAccessLevel;
import models.AppUser;
import models.Item;
import models.Message;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Collections;
import java.util.List;

/**
 * Created by User on 4/13/2016.
 */
public class Messages extends Controller {

        /* ------------------- send  message by from item view  ------------------ */

    public Result sendMessage (Integer itemId) {
        Item item = Item.findItemById(itemId);
        DynamicForm form = Form.form().bindFromRequest();
        String customerEmail = form.field("email").value();
        String subject = form.field("subject").value();
        String messageText = form.field("message").value();

        Boolean sent = Message.saveMessage(customerEmail,subject, messageText, item.user.id);
        if(sent) {
            flash("success", "Poruka uspješno poslana. Potrudit ćemo se da odgovorimo u najkraćem roku. Hvala!");
            return redirect(routes.Items.itemRender(itemId));
        } else {
            flash("error", "Došlo je do greške. Poruka nije poslana.Molimo pokušajte ponovo. Hvala!");
            return redirect(routes.Items.itemRender(itemId));
        }
    }

    /* ------------------- send  message by from user view  ------------------ */

    public Result sendMessage2 (Integer userId) {
        DynamicForm form = Form.form().bindFromRequest();
        String customerEmail = form.field("email").value();
        String subject = form.field("subject").value();
        String messageText = form.field("message").value();

        Boolean sent = Message.saveMessage(customerEmail,subject, messageText, userId);
        if(sent) {
            flash("success", "Poruka uspješno poslana. Potrudit ćemo se da odgovorimo u najkraćem roku. Hvala!");
            return redirect(routes.Partners.partnerPageRender(userId));
        } else {
            flash("error", "Došlo je do greške. Poruka nije poslana.Molimo pokušajte ponovo. Hvala!");
            return redirect(routes.Partners.partnerPageRender(userId));
        }
    }
        /* ------------------- list of  messages  ------------------ */
        @Security.Authenticated(Authenticator.AdminUserFilter.class)
    public Result listOfMessages(Integer userId) {
        List<Message> messages = Message.userMessages(userId);
            Collections.reverse(messages);
        return ok(views.html.messages.listOfMessages.render(messages));
    }

        /* ------------------- single  message  ------------------ */
        @Security.Authenticated(Authenticator.AdminUserFilter.class)
    public Result message(Integer messageId) {
        Message message = Message.findMessageById(messageId);
            if(UserAccessLevel.getCurrentUser(ctx()).userAccessLevel.equals(UserAccessLevel.USER)) {
                message.status = Constants.READ_MESSAGE;
            }
        message.update();
        return ok(views.html.messages.message.render(message));
    }

        /* ------------------- delete  message  ------------------ */
        @Security.Authenticated(Authenticator.AdminUserFilter.class)
    public Result deleteMessage(Integer messageId) {
        Integer userId = Message.deleteMessage(messageId);
        return redirect(routes.Messages.listOfMessages(userId));
    }


        /* ------------------- notifications ajax  ------------------ */

    public Result notifications() {
        Integer userId = Integer.parseInt(session("userId"));
        Integer number = Message.numberOfNewMessages(userId);
        return ok(String.valueOf(number));
    }


        /* ------------------- list of messages for admin  ------------------ */
        @Security.Authenticated(Authenticator.AdminFilter.class)
    public Result listOfMessagesForAdmin(Integer userId) {
        List<Message> messages = Message.userMessages(userId);
            Collections.reverse(messages);
            return ok(views.html.messages.listOfMessagesForAdmin.render(messages));
    }

}
