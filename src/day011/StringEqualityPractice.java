package day011;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //checking string equality
        //you should always use equals method
        // oneString.equals(anotherString)
//equals method coming from String class
        System.out.println("Java".equals("java"));
        String myStr="Java";
        System.out.println(myStr.equals("Java"));
        String yourString=new String("Java");
        System.out.println("Is my string same as your string ? ");
        System.out.println(myStr.equals(yourString));

        //task:
        //check myStr value is Java
        //if true ...>> CORRECT WORD
        // if false ...>> SAY JAVA

        if (myStr.equals("Java")){

            System.out.println("CORRECT WORD!!!!");
        }else {
            System.out.println("SAY JAVA!!");
        }

       if (myStr.equals(yourString)){

           System.out.println("CORRECT WORD!!!!");

} else {
           System.out.println("SAY JAVA!!");
       }

    }
}
