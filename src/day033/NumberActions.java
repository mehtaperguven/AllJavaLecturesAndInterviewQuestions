package day033;

public class NumberActions {
    public static void main(String[] args) {

       int finalNumber= getSumFrom1ToX(1,6);
        System.out.println(finalNumber);
        System.out.println(build_Got_Email("cabir","erguven"));
        String email1=fullNameToGotEmail("emir erguven");
        System.out.println(email1);
        System.out.println(fullNameSplitBySpace("feyza erguven"));
        System.out.println(fullNameByArray("mehtap erguven"));
    }
    //getSumFrom1ToX
    //@param x final number to be added
    //@return the sum of numbers from 1 to X
    public static int getSumFrom1ToX(int num1,int x){
        int sum=0;
        for(int i=num1;i<=x;i++){
            sum=sum+i;
        }
        return sum;

    }
    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial+lastname+@NightWatch.com
     */
    public static String build_Got_Email(String firstName,String lastName){
        char firstInitial=firstName.charAt(0);
        String email=firstInitial+lastName+"@NightWatch.com";

        return email;
        //return firstInitial+lastName+"@NightWatch.com";
        //will return same result
    }
    public static String fullNameToGotEmail(String fullName){
        int indexOfSpace=fullName.indexOf(" ");
        char firstChar=fullName.charAt(0);
        String lastName=fullName.substring(indexOfSpace+1);
        String email=firstChar+""+lastName+"@NightWatch.com";

        return email;
    }
    //we solved by array
    public static String fullNameSplitBySpace(String fullName){

        String part1=fullName.split(" ")[0];
        String part2=fullName.split(" ")[1];
        String email=build_Got_Email(part1,part2);
        return email;
    }
    public static String fullNameByArray(String fullName){
        String []array=fullName.split(" ");
       String  email=build_Got_Email(array[0],array[1]);
        return email;
    }
}
