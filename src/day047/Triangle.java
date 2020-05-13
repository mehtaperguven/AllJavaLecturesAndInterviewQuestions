package day047;

public class Triangle extends Shape {
   int height;
   int base;
   //int area;

    public Triangle(String name, int height, int base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea() {
      area=height*base/2;
        //System.out.println("Area is "+area);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
