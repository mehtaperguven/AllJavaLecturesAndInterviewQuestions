package day013;


public class StringMethods {
    public static void main(String[] args) {
        //string actions which we know are
        //equals method
        String s1="GOOD";
        System.out.println(s1.equals("abc"));

        //equalsIgnoreCase   method
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method


        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        //toLowerCase one more method of String

        System.out.println(s1.toLowerCase());
        String name="didem";
        System.out.println(name.toUpperCase());
        String yourName=name.toUpperCase();
        System.out.println("MY NAME IS : "+ yourName);
        String myName=name;
        System.out.println("my name is "+name);
        System.out.println("MAY NAME IS "+name.toUpperCase());

        //length method to count each character in the string
        System.out.println(s1.length());
        int lengthOfStr= s1.length();
        System.out.println(lengthOfStr);

        if (lengthOfStr>4){
            System.out.println("more than four characters");
        }else{
            System.out.println("not more than four");
        }
    }
}
