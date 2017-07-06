package BehavioralPatterns.ChainOfResponsibility;

class NoteModule50 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R50;
        int remind = money.getAmt()%Note.R50;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R50);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
