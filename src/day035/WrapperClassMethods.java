package day035;

public class WrapperClassMethods {
    public static void main(String[] args) {
        //*
        // package java.lang//under java.lang
        //
        // public static class integer .....//there is class integer*/
//we can turn a string into a primitives

   String strNum="100";
   int num=Integer.parseInt(strNum);//we turned string into a number
        System.out.println(num);

   String empId="FB-457" ;
   //int id=Integer.parseInt(empId);//it can not help to give number!!
        /*Integer class is coming from java.lang package
        It's primarily used for wrapping up primitive value and treat it as as object
        parsInt is a static method of Integer class
        it will turn a String that has only numbers and return integer result
        if we have any non numerical character it will give NumberFormatException

         */
        int iddd=Integer.parseInt(empId.split("-")[1]);
        System.out.println(iddd);
        String[] empIdSplit=empId.split("-");
        String idStr=empIdSplit[1];
        int idd=Integer.parseInt(idStr);
        System.out.println(idd);

//let us find the sum of the following
        String twoNumbers="100,600";
        String[] numbers=twoNumbers.split(",");
        int num1=Integer.parseInt(numbers[0]);
        int num2=Integer.parseInt(numbers[1]);
        System.out.println("sum is = "+(num1+num2));
        //num1+num2 gives 100600//does not give 700!!!
//(num1+num2) gives 700!!!!!!!
//PRIMITIVE WRAPPER CLASSES
        //Each primitive types have one corresponding class
        //PRIMITIVE TYPES..........PRIMITIVE WRAPPER CLASSES
//       boolean......................Boolean
        //char.......................Character
        //byte.......................Byte
        //short......................Short
        //int........................Integer
        //long.......................Long
        //float......................Float
        //double.....................Double

        //Boolean b=new Boolean(true);
        // Boolean b=new Boolean("true");
        //

        //Character c=new Character('c');
        //
        //Byte bt1=new Byte((byte)123);
        //Byte bt2=new Byte("123");
        //Short s1=ne Short((short)1200);
        //Short s2=new Short("1200")

//WRAPPER GROUP OF DIFFERENT CLASSES, TURNS THE PRIMITIVE TYPES TO DIFFERENT OBJECTS
        // //Boolean b=Boolean.valueOf(true);
        // Boolean b=Boolean.valueOf("true");
        //Character c=Character.valueOf('c');

        //Byte bt1=Byte.valueOf((byte)123);//we prepare byte object
        //Byte bt2=Byte.valueOf("123");

        //Short s1=Short.valueOf((short)1200);//we prepare short object
        //Short s2=Short.valueOf("1200");//
        //
        //DIFFERENT WAYS OF PRODUCING OBJECT
        //Float f1=new Float(3.24f);//old way not recommended
        //Float f2=new Float("3.24");//old way not recommended

        //We can use overloaded valueOf method to make an object
        //valueOf() will return float OBJECT
        //Float f3=Float.valueOf(3.24f);
        //Float f3=Float.valueOf("3.24");

        //or we can just
        //let java autobox our float value into float object
        //Float f5=3.24f;
        //

        //f1,f2,f3,f4,f5 are float OBJECTS

        //How can we turn String VALUE into float VALUE
        //"3,14"---->>>>3.14f
        //float f6=Float.parseFloat("3,14f");

        float f6=Float.parseFloat("3.14f");
        System.out.println(2*f6);

String sentence="I bought 3 tomatoes and the price was 3,14 each";
String array[]=sentence.split(" ");
String s1=array[2];
int count=Integer.parseInt(s1);//turns an int number
//int count=Integer.valueOf(s1);//gives value of object//above and this code gives same result!!!!

String s2=array[array.length-2];
double price =Double.parseDouble(s2.replace(",","."));//we do 3,14 a 3.14!!
        System.out.println(price);
        System.out.println("Total price is "+(price*count));
        System.out.println("Total price in one step is "+ Double.parseDouble(array[array.length-2].replace(",","."))*Integer.parseInt(array[2]));
        }
}
