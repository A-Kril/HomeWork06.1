package BehavioralPatterns.TemplateMethod;

class ClassB extends ClassC {

    @Override
    void differ() {
        System.out.print("4 ");
    }

    void differ2() {
        System.out.print("7 \n");
    }
}
