package interviewQuestionJava.Topics;

public class OnlyString {

    public static void main(String[] args) {
//== vs equals() and equalsIgnoreCase() methods

       String str="Hello Batch15";
        String str1= "Hope we will do perfect!";

        String str2=str1;
        String str3=new String("HOPE WE will do perfect!");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));



//length()

                  // 01234567890123456789012345
        String s1="You are very good friends!";
        int length=s1.length();
        System.out.println(length);//26

//charAt()
            String s2="Everything will be good";
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(4));
        System.out.println(s2.charAt(0)+s2.charAt(1)+s2.charAt(2));//Eve not //288
        System.out.println(""+s2.charAt(0)+s2.charAt(1)+s2.charAt(2));



//toUpperCase()

        String s5="Muge";
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());

//toLowerCase()

//contains()

        String s6="We are finishing soon!";

        System.out.println(s6.contains("ARE"));

//indexOf()            01234567
        String str7 = "All wE neED is friendship!";


        System.out.println(str7.indexOf("d"));
        System.out.println(">>>>>>>>>>>"+str7.indexOf("e",11));

        System.out.println(str7.indexOf("neED"));
        System.out.println(str7.indexOf("what"));

//lastIndexOf()
// it starts looking backwards from the specified index “fromIndex”.

        String s8="It is not easy being infront of you!";

        System.out.println(s8.lastIndexOf("y"));
        System.out.println(s8.lastIndexOf("e",20));


//subString()
        //         0123456789
        String s9="It is not easy being infront of you!";
        System.out.println(s9.substring(5));
        System.out.println(s9.substring(1,5));



//startsWith()
        System.out.println(s9.startsWith("I"));
        System.out.println(s9.startsWith("It"));
        System.out.println(s9.startsWith("any"));


//endsWith()
        System.out.println(s9.endsWith("!"));

//trim()
        String s11="      We are finishing today's class  ";
        System.out.println(s11.trim());


//concat()
        String s12="Say Hello";
        String s13="  Say Goodbye";

        System.out.println(s12.concat(s13));

//replace()

        System.out.println(s12.replace("Say","Hello"));
    }
}
