package day051.Polymorphism;

public abstract class Shape {
    public abstract void drawShape();
}
class Triangle extends Shape{
    @Override
    public void drawShape() {
        System.out.println("Draw Triangle");
    }
}

class Rectangle extends Shape{

    @Override
    public void drawShape(){
        System.out.println("Draw Rectangle");

    }
}
class Circle extends Shape{
    @Override
    public void drawShape(){
        System.out.println("Draw Circle");
    }
}