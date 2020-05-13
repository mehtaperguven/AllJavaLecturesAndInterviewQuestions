package day012;

public class LoginTest {
    public static void main(String[] args) {
        String userName="abc";
        String passWord="pass128";

if (userName.equals("user123") && passWord.equals("pass123")){
    System.out.println("Login Successful");

}else if (!userName.equals("user123") && passWord.equals("pass123")){
    System.out.println("User name is incorrect ");

}else if (userName.equals("user123")&& !passWord.equals("pass123")) {
            System.out.println("pass word is incorrect");
        }else{
    System.out.println("BOTH ARE WRONG!!!!");
}
    }
}
