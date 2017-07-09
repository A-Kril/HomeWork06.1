package BehavioralPatterns.TemplateMethod;

class ClassA extends ClassC {

    @Override
    void differ() {
        System.out.print("2 ");
    }

    void differ2() {
        System.out.print("4 \n");
    }
}
