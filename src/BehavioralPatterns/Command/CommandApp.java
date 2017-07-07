package BehavioralPatterns.Command;

public class CommandApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

        user.startComputer();
        user.storComputer();
        user.resetComputer();

    }
}
