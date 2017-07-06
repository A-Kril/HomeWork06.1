package BehavioralPatterns.ChainOfResponsibility;

public class BankomatApp {
    public static void main(String[] args) {

        System.out.println("Сумма к выдаче: 2 350");
        NoteModule note500 = new NoteModule500();
        NoteModule note200 = new NoteModule200();
        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();

        note500.setNextMoneyModule(note200);
        note200.setNextMoneyModule(note100);
        note100.setNextMoneyModule(note50);

        note500.takeMoney(new Money(2_350));
    }
}
