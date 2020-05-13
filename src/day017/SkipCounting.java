package day017;

public class SkipCounting {
    public static void main(String[] args) {

        //Skip counting by 3 from 0 till 30
        //3 6 9 12 15 18 21 24 27 30
        int count=0;
        while(count<30){
            count+=3;
            System.out.print(count+" ");
        }

    }
}
