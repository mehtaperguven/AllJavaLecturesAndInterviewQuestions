package day060;

public class BrakeTimeException extends RuntimeException{



}
class Main{


    public static void main(String[] args) {

        //throw new BrakeTimeException();
        try {
         throw new MyOwnException();
        }catch(MyOwnException e){
            System.out.println("Wola my own Exception is caught");
        }
    }
}