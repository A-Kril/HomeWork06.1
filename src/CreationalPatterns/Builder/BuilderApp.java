package CreationalPatterns.Builder;

public class BuilderApp {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new MitsubishiLancer());

        Car car = director.buildCar();
        System.out.println(car);
    }
}
