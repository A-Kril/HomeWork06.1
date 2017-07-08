package StructuralPatterns.Flyweight;

class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + "): draw a point ");
    }
}
