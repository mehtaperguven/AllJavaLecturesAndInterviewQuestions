package day052.polymorphism;

public class Rectangle extends Shape {
    int width;
    int length;
    public Rectangle(String name,int width,int length) {
        super(name);
        this.width=width;
        this.length=length;
    }

    @Override
    public void calculateArea() {
this.area=width*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
