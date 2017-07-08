package BehavioralPatterns.Mediator;

class Admin extends User{

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Administrator " + getName() + " receives a message '" + message + "'");

    }
}
