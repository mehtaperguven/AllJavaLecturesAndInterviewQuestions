package day059;

import java.io.IOException;

public class CheckedAndUnChecked {

    public static void main(String[] args)  {

        //Exception e1;
        //throw new Exception("There is exception");//gives compile error
    //

        String x="abc";
        System.out.println(x);
        ///try {
           // throw new IOException("just throwing this way");
            //to declare we use throws IOException

       // }catch(IOException e){
          //  System.out.println("Exception caught");
        //}

try {
    Thread.sleep(4000);//to declare it we use InterruptedException
}catch(InterruptedException e){
    System.out.println("To handle we use try catch block");
}

        System.out.println("HJKHJHLH");
    }
}
