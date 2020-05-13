package day012;

public class LoginTest2 {
    public static void main(String[] args) {
     String userName="abc123";
     boolean userNameCorrect=userName.equals("ABC123");
        System.out.println(userNameCorrect);
        boolean userNameCorrect2=userName.equalsIgnoreCase("ABC123");
       //uqualsIgnoreCase does not care upper case lowercase
        //it checks only content
        System.out.println(userNameCorrect2);
    }
}
