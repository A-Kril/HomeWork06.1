package BehavioralPatterns.Command;

//Concrete command
class StopCommand implements Command{
    Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
