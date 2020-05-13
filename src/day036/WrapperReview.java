package day036;

public class WrapperReview {

    public static void main(String[] args) {
/*Practice topic: Wrapper class
primitives: byte, short, int, long, float, double, char, boolean
        default value:
                byte, short, int, long ==> 0
                float, double ==> 0.0
                boolean ==> false
                char ==> empty
Wrapper classes:
    every primitives in java has a class that's dedicated to it
        Byte, Short, Integer, Long, Float, Double, Character, Boolean
        all those wrapper classes are presented in "java.lang"
        default value of all wrapper class: null
    Auto-boxing: assigning primitive value to wrapper class
    un-boxing: assign wrapper class value to primitive values
Useful methods of wrapper class:
            Max_Value: returns the maximum value
            Min_Value: returns the minimum value
            parse methods: converting String values to primitives, not case sensitive, returns primitive
            ValueOf methods: converting String to Wrapper class, not case sensitive ,returns wrapper class
*/
        Integer i1=new Integer(100000000);
        Integer i2=Integer.valueOf(123);
        //Auto boxing:primitive to wrapper type conversion

        Integer i3=45;
        //
        int i4=54;


        //AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        //OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS
    }
}
