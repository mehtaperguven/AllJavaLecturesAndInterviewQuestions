package day014;

public class MethodActionBehavior {
    public static void main(String[] args) {
        // 3 questions to ask about method
        //1..What does the method do?
        //2..Do I need to provide extra data to take this action
        //3.what do we get out of the method??
///////METHODS/////
        //equals: checks equality with care of lower case or upper case
        //we need to provide entry, it gives boolean true or false results
        //equalsIgnoreCase:checks equality without care of upper or lower case,
        // we need to provide entry, it gives boolean true or false results
        String str="I like Pumpkin";
        System.out.println("str = " + str);

        System.out.println(str.equals("pumpkin"));
        boolean b1=str.contains("PUMP");////...>> false
        System.out.println(b1);

        int index1=str.lastIndexOf("n");//...>>
        System.out.println(index1);

        boolean gotPumpkin=str.contains("Pumpkin");// soutv  gives the next short cut
        System.out.println("got pumpkin? "+gotPumpkin);

        boolean startedWithI=str.startsWith("I");//use soutv

        System.out.println("started With I = " + startedWithI);

        boolean endsWith=str.endsWith("n");//use soutv to get directly next line
        System.out.println("ends With pumpkin= " + endsWith);



    }
}
