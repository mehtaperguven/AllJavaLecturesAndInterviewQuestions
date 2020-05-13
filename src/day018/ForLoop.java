package day018;

public class ForLoop {

    public static void main(String[] args) {


        //*****FOR LOOP********


        // initialization part int i=0;  termination part i<10;   increment part i++;
        //for(int i=0; i<10; i++){
        // System.out.println("Happy Birthdays "+i);
        // }


        for (int i = 0; i < 5; i++) {
            System.out.println("happy new days " + i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("i is " + i);
            System.out.println("Happy Birthday Erva ");

// in the for loop does not matter i++ or ++i!!!!!!
            for (int counter = 10; counter > 0; counter--) {
                System.out.println(counter);
            }

        }
    }
}
