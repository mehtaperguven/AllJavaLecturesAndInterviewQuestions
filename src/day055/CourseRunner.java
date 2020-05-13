package day055;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        List<String> lst=new ArrayList<>(Arrays.asList("Muge","Sumeyye","Karima","Selen","Firdevs","Muharramjon"));
        Course java=new Course("Java",lst);
        System.out.println(java);
        java.studentNames.add("Gail");
        java.studentNames.add("Ayjeren");
        System.out.println(java.studentNames);
        System.out.println(lst);
        java.studentNames.addAll(Arrays.asList("Evra","Feyza"));
        System.out.println(lst);

        java.addStudent("Zehra");
        java.addManyStudents(Arrays.asList("Aygul","Ozlem","Dilara"));
        System.out.println("last list= "+lst);


    }
}
