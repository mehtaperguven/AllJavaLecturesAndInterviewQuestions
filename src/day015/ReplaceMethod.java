package day015;

import javax.lang.model.SourceVersion;

public class ReplaceMethod {
    public static void main(String[] args) {

        String message="I love Pumpkin , Pumpkin IS FUN";
        // message.replace("Pumpkin","Java!");
        //if we write only the above code it does not print I love java,Java IS FUN

        message=message.replace("Pumpkin","Java!");
        System.out.println(message);
        //what if I want to replace Thanks Giving by Thanksgiving

        String message2="Happy Thanks Giving to All!!";
        message2=message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);

        message2=message2.replace("to All","to everybody");
        System.out.println("message2 = " + message2);

        //what if I want to replace space from everywhere 
  
        message2=message2.replace(" ","");
        System.out.println("message2 = " + message2);

        String message3="TOMORROW IS OFF NO!";
        message3=message3.replace("NO","");
        System.out.println("message3 = " + message3);

    }
}
