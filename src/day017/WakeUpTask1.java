package day017;

public class WakeUpTask1 {
    public static void main(String[] args) {
//given your name
        //get the first character uppercase
        //reminder part should be lowercase then print it

        String name="MehTap";
String name2;

       // System.out.println(name2);
        name=name.toUpperCase();
        System.out.println(name);
        char char1=name.charAt(0);
        name2=char1+name.substring(1).toLowerCase();
        System.out.println(name2);
        //it makes same thing in the below code in one step
       String name3= name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        System.out.println(name3);
        String nameFixed= (name.charAt(0)+"").toUpperCase();
        // by "" we converted char to string to use toUpperCase method
        nameFixed=nameFixed+name.substring(1).toLowerCase();
        //nameFixed+=name.substring(1).toLowerCase();
        //is same as the previous code
        System.out.println(nameFixed);


    }
}
