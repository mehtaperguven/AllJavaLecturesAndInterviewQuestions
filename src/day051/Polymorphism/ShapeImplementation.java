package day051.Polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeImplementation {
    public static void main(String[] args) {
        Shape s1=new Triangle();
        Shape s2=new Rectangle();
        Shape s3=new Circle();
Shape s4=new Triangle();


        s1.drawShape();

        Shape[] array={s1,s2,s3,s4,new Triangle()};
        for (Shape each:array){
            each.drawShape();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
for (int i=0;i<array.length;i++){
    array[i].drawShape();
}
        // please create Array of shape to store
// 5 concrete Shape Object
// and call the draw the method on each of them
// Also try to create ArrayList of Shape
// and store 4 concrete Shape objects
// and call the draw method on each of them

        System.out.println("***************************");
        List<Shape> lst=Arrays.asList(s1,s2,s3,s2,s1);
        for (Shape each: lst ) {
            each.drawShape();
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
for (int i=0;i<lst.size();i++){
    lst.get(i).drawShape();
}

List<Shape> shapeList=new ArrayList<>();
shapeList.add(s1);
shapeList.add(s3);
shapeList.add(new Rectangle());
shapeList.add(s1);
shapeList.add(new Triangle());

        for (Shape each: shapeList){
            each.drawShape();
        }

    }



}
