package day050;

public class Square extends Shape{
    int length;

    public Square(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area=length*length;
        System.out.println("area of square is "+area);
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal edges with 90 degree, length"+length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
