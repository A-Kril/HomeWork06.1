package BehavioralPatterns.ChainOfResponsibility;

class NoteModule200 extends NoteModule{

    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R200;
        int remind = money.getAmt()%Note.R200;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.R200);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
