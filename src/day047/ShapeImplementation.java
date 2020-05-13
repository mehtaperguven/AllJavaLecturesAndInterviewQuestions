package day047;

public class ShapeImplementation {
    public static void main(String[] args) {
        Triangle t1=new Triangle("triangleABC",10,18);
        t1.calculateArea();
        System.out.println(t1);

        Rectangle r1=new Rectangle("rectangleABCD",20,10);
        r1.calculateArea();
        System.out.println(r1);

    }

}
