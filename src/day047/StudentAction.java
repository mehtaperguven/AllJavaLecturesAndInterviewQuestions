package day047;

public class StudentAction {

    public static void main(String[] args) {

       final Student s1=new Student(101);
       //to not change address we used final key-word

        System.out.println(s1);

       // s1=new Student(200);//it will not work
        //Because we said that s1 points 101 and we fixed it
        //we can not reassign new value ,science we have final key-word

        s1.studentId=400;//if we do student id final in the Student class will not change
        //s1 is permanent address it is locked, which points student object
        // however object attribute can change, like student id
        System.out.println(s1);

        //we used PUBLIC STATIC FINAL in Student class to make constant
        //below constants are all public static final.....
        System.out.println(Student.SCHOOL);//SCHOOL IS CONSTANT

        System.out.println(Byte.MAX_VALUE);//127//constant comes from Byte Class
        System.out.println(Byte.MIN_VALUE);//-128

        System.out.println(Math.PI);//3.141592..//constant comes from Math Class

            printDoubleNUmber(12);


    }
    public static void printDoubleNUmber(double x){//if we write (final double x)
        //we will not be able to re-assign x value to x*2!!!!
        x=x*2;//reassign value
        System.out.println("x*2 = " + x);//by final x*2 would be 12 again!!!!
    }
}
