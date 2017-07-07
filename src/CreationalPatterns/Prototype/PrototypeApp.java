package CreationalPatterns.Prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human(18, "Ivan"); //человек
        System.out.println(original);

        Human copy = (Human)original.copy(); //копия человека
        System.out.println(copy);

        HumanFactory humanFactory = new HumanFactory(copy); //копия человека с помощью фабрики
        Human human = humanFactory.makeCopy();
        System.out.println(human);

        humanFactory.setPrototype(new Human(30, "Lena")); //новый человек с помощью фабрики
        Human human1 = humanFactory.makeCopy();
        System.out.println(human1);
    }
}
