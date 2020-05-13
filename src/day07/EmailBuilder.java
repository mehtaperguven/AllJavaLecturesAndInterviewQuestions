package day07;

public class EmailBuilder {
    public static void main(String[] args) {


         //String firstName, lastName, company,email;// is easier!!!!
         String firstName= "mehtap";
        //System.out.println("please enter your first name :" + firstName);
         String lastName="erguven";
        String company= "Cybertek School";
         String email=firstName+"_"+lastName+"@"+ company + ".com";


         System.out.println("my first name is " + firstName+ " last name is "+lastName+
                "\n" +"I work for the "+ company+" company" +
                 "\n"+" my email is : "+email);






    }
}
