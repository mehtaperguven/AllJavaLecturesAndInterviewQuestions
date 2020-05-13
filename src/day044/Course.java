package day044;

public class Course {
    String name;
    String type;
    static int counter;//static is not belong to any object

    public Course(String name,String type){
        this.name=name;
        this.type=type;
        ++counter;
    }
}
