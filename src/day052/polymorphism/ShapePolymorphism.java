package day052.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {
/*Shape class has instance variables name and area .
Shape has abstract calculateArea() method and
Shape implements interface Drawable which contains draw() method only.
 Therefore any Shape object can access all the given method and variables*/
   //Circle s3=new Circle("Disk",5);
       Shape s2=new Circle("Disk",5);
       Circle c1=new Circle("Penny",8);
       c1.calculateArea();
      // Object s2=new Circle("Disk",5);
        // Object does not have draw()method;
        // we can not call s2.draw();
        Drawable s1=new Square("Disk",5);
       s1.draw();
        //reference type decide what you can access with that variable
        //Drawable is interface and has only draw() inside.
        //s1 is defined as Drawable type and it can access only draw()

    Object o1=new Circle("Disk",5);
    o1.toString();
        System.out.println(o1.toString());
        System.out.println(o1.getClass().getSimpleName());//gives Circle
        //we can learn the name of object type by above code
        printShapeArea(s2);
 Shape ss1=new Rectangle("window",4,8);
 printShapeArea(ss1);
 printShapeArea(new Square("Table",8));//without storing object into container


        drawShape3Times(ss1);
    }
    public static void printShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name+"'s area is = "+anyShape.area);

    }
    public static void drawShape3Times(Shape s){
        s.draw();
        s.draw();
        s.draw();
    }

}
