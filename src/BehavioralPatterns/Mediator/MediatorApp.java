package BehavioralPatterns.Mediator;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Ivan");
        User user1 = new SimpleUser(chat, "Vova");
        User user2 = new SimpleUser(chat, "Alina");
        User user3 = new SimpleUser(chat, "Petr");
        User user4 = new SimpleUser(chat, "Egor");
        user3.setEnable(false); // если пользователь не в сети - сообщение не получает (получает только от админа)

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        chat.addUser(user4);

        user1.sendMessage("Hello!");
        System.out.println("===============");
        admin.sendMessage("End chat!");
    }
}
