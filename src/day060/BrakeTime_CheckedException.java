package day060;

public class BrakeTime_CheckedException extends Exception{

    public static void main(String[] args) {
        try {
            throw new BrakeTime_CheckedException();
        }catch(Exception e){
        System.out.println("We caught an Exception");
        }
    }

}
