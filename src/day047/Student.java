package day047;

public class Student {
   int studentId;
   //to not change student id
    //final int getStudentId;


    //If it is asked how do I define CONSTANT in Java???
    //public static final field helps to make constant
    public static final String SCHOOL="Cybertek";//to FIX CONSTANT, TO FIX VALUE
    //We initialize the SCHOOL value as Cybertek and can not change it
    //public static final byte MAX_VALUE=127;
    //public static final byte MIN_VALUE=-128
    //only constant name is uppercase

    public Student(int studentId){
    this.studentId=studentId;
    }

    //@Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}
