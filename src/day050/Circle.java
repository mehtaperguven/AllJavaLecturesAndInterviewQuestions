package day050;

public class Circle extends Shape {

    double radius;


    public Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle using radius"+radius);
    }

    @Override
    public void calculateArea() {
        area=3.24*radius*radius;
        System.out.println("area of circle is "+area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Square s1=new Square("square1",15);
       s1.calculateArea();
       s1.draw();
        System.out.println(s1);
Circle c1=new Circle("Circle1",20);
c1.calculateArea();
c1.draw();
        System.out.println(c1);
    }
}
