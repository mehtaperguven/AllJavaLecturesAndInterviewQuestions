package day04.src.day03;

public class StringDataType {
    public static void main(String[] args) {
        //string is a sequence of characters
        String name = " Mehtap";
        String surname = "Erguven";
        int age= 43;
        double height= 5.00;
        char myLastNameFirstChar = 'E';
        boolean isMarried = true;
        byte kids= 3;
        String city = "Forth Worth";

        System.out.println( name );
        System.out.println( "My name and Surname is  : "   +   name + surname);
        System.out.println( "My age is : "   + age);
        System.out.println( "My last Name First Character is :  "+ myLastNameFirstChar  );
        System.out.println( "Am I married  ?"+ isMarried );
        System.out.println( "I have "   + kids  +  "   kids" );
        System.out.println( "I live in  " +  city);
    }
}
