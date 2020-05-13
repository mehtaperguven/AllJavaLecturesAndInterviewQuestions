package day014;



public class PasswordValidatorLength {
    public static void main(String[] args) {
        //password validator
        //minimum 8 max 16 characters
        //it must contains _ or $
        //it must not contains space
        //it must start Ab
        //if any of above conditions does not match say INVALID PASSWORD
        //ELSE GOOD PASSWORD!

        String password = "Ab_2723$fgdsu";
        // (password.length()>=8 && password.length()<=16){

        boolean min8max16=password.length()>=8 && password.length()<=16;
        // (password.contains("_")|| password.contains("$")){
        System.out.println(min8max16);
        boolean mustContains_or$=password.contains("_")|| password.contains("$");
        // it must not contains space
        //!password.contains(" ")
        System.out.println(mustContains_or$);

        boolean mustNotContainsSpace=  !password.contains(" ");
       // it must start Ab
        //password.startsWith("Ab")
        System.out.println(mustNotContainsSpace);

        boolean mustStartWithAb=password.startsWith("Ab");
        System.out.println(mustStartWithAb);

        if(min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartWithAb ){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }
    }
}