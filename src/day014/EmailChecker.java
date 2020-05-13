package day014;

public class EmailChecker {
    public static void main(String[] args) {
        // variable called email
        //if does not contain character @ say invalid email
        //if it contains space say invalid email

        //if it endsWith @gmail.com  --> gmail
        //if it endsWith @yahoo.com.....>yahoo email
        // if it endsWith  @mail.ru....> russian email

        String email= "mehtaperguven@@yahoo.com";

        if (!email.contains("@") || email.contains(" ")){

            System.out.println("Invalid Email");

        }else if (email.endsWith("@gmail.com")){

            System.out.println(" Google Mail");

        }else if (email.endsWith("@yahoo.com")){

            System.out.println("yahoo email");

        }else if (email.endsWith("@mail.ru")){

            System.out.println("Russian email");

        }else{
            System.out.println("Unkown entry");
        }
    }
}
