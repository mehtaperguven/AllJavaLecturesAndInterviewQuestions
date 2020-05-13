package day047;

public class Rectangle extends Shape {

    int width;
    int height;
    //int area;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        area=width*height;
        //System.out.println(area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
