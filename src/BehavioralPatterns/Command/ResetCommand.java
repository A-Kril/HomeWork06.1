package BehavioralPatterns.Command;

//Concrete command
class ResetCommand implements Command{
    Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
