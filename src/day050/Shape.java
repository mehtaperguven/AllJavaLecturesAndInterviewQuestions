package day050;

public abstract class Shape implements Drawable{

    //Shape and Drawable ca not be object
    String name;
    double area;//area would be calculated
    // we do not need to show it in constructor
    public Shape(String name){
        this.name=name;
    }

    public abstract void calculateArea();
    //public abstract void draw();//not visible here,however comes from interface Drawable
}
