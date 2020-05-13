package day012;

public class WHatIsClassAndObject {
    public static void main(String[] args) {
        //Class is blueprint
        //class is cookie Cup
        //Object is cookie
        //String is special Class
        //How primitives and objects are stored  in memory
        //Reference type to control an object

        String str1="Hello";
        String str2="Hello";
        //str1 is container and it has inside address of  first Hello
        //str2 is container and it has   address of second  Hello
        //PRIMITIVES STAY IN STACK
        //STRING VALUES STAY IN HEAP
        //int x=10; int y=10;
        //x==y is TRUE
        //String st1= new String("HELLO");
        //String st2=new String("HELLO");
        //str1==str2 is not right
        //str1.equals(str2) is correct checking way
        //  in STACK                                             in HEAP

       //    str1..>> container of str1 in stack  x=10 ...>>it's primitives value               HELLO ....>>it is string's value
       //    str2                                 y=10                                         HELLO
    }
}

//in the HEAP there is special area STRING POOL
//IF str1="hello" and st2="hello" first str1 as a container placed in stack
//str2 as a container placed in stack too.
//but JAVA produce in STRING POOL one word hello after that st2 in the HEAP
//WILL have same area as hello in string pool in heap.
// if we have third string with word hello it will be in the same place as well
//str1, str2, str3 will point same hello value in the string pool  which is in the heap