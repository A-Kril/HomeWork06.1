package StructuralPatterns.Flyweight;

class Square implements Shape{
    int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): draw a square with a side " + a);
    }
}
