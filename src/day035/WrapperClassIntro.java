package day035;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x=10;
        //primitive data types are pure value, has no attribute or behavior
        //each primitive type has wrapper class that turn it into object

        //old way of performing Integer object:
        Integer xObj1=new Integer(12);

        //new way using WRAPPER CLASS:
        //valueOf method of Integer class
        //return an integer object by wrapping up the value you passed
        //it has two overloaded version,one accept int, another accept String
        Integer xObj2=Integer.valueOf(10);
        Integer xObj3=Integer.valueOf("10");
        

        System.out.println(xObj2+xObj3);
        byte  bValue=xObj2.byteValue();//it is not casting
        System.out.println("byte value = "+bValue);
        //we call method doubleValue() to convert xObj2 integer object into double
        double dValue=xObj2.doubleValue();
        System.out.println("dValue = " + dValue);
        
    }
}
