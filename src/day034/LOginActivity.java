package day034;

public class LOginActivity {
    public static void main(String[] args) {
        /*
        * login1 :  static void method
	it has two String method parameters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		print login successful
	else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)*/
    login1("user","abc123");
        login1("use","abc123");
        //the login2 method is not void and we have return options
        //therefore we can use and store the boolean result
       boolean result= login2("user","abc123");
        System.out.println(result);
        //if true
        if(login2("user","abc123")){
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart ");
            System.out.println("view the order");
        }else{
            System.out.println("No Shopping Unless You Signed In!!!!!");
        }
    }

    public static void login1(String username,String password){

        if (username.equals("user")&& password.equals("abc123")){
            System.out.println("Login Successful");
        }else{
            System.out.println("login Failed");
        }
    }
    /*login2 :  static method boolean return type
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		return true
	else
		return false */
    public static boolean login2(String userName,String passWord){
        return userName.equals("user")&&passWord.equals("abc123");
       /* boolean result=userName.equals("user")&& passWord.equals("abc123");

        if (result){
            return result;
        }else{
            return result;
        }*/
    }
}
