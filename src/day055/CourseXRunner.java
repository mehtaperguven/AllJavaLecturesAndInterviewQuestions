package day055;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {
    public static void main(String[] args) {
        List<Student> myList=new ArrayList<>();
        myList.add(new Student("Feyza",101));
        myList.add(new Student("Ayjeren",102));
        myList.add(new Student("Erva",103));
        myList.add(new Student("Emray",104));


        CourseX java= new CourseX("HAS-A",myList);
       java.addStudent("Mehtap",105);
       java.addStudent("Gail",106);
       java.addStudent(new Student("Didem",107));
        System.out.println(myList);

    }

}
