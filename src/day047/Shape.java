package day047;

public abstract class Shape {
    String name;
    int area;

    public Shape(String name) {
        this.name = name;
        //this.area = area;
    }

    public abstract void calculateArea();
}
