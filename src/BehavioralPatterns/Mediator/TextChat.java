package BehavioralPatterns.Mediator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin){
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough rights");
        }
    }

    public void addUser(User u){
        if (admin == null) {
            throw new RuntimeException("In the chat there is no admin!");
        }
        if (u instanceof SimpleUser){
            users.add(u);
        }
        else {
            throw new RuntimeException("Admin can not enter another chat room!");
        }
    }

    @Override
    public void sendMesssage(String message, User user) {
        if (user instanceof Admin){
            for (User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnable())         // пользователь не отправляет сообщение себе и тем кто не в сети
                    u.getMessage(user.getName() + ": " + message);
            }
            if (admin.isEnable()){
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
