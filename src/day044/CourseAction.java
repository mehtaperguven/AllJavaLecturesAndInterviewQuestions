package day044;

public class CourseAction {
    public static void main(String[] args) {
        System.out.println("Course counter "+Course.counter);
        Course c1=new Course("Java","foundation");
        Course c2=new Course("Selenium","Automatic");
        Course c3=new Course("SQL","DataBase");
        Course c4=new Course("API","Webservices");
        Course c5=new Course("Agile","Soft Skills");
        System.out.println("Course counter "+Course.counter);

    }
}
