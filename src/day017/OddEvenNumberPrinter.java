package day017;

public class OddEvenNumberPrinter {
    public static void main(String[] args) {
//write program to print even numbers from 0 till 50
        int x=0;
        while(x<=50){
            System.out.print(x+" ");
            x+=2;
        }
        ////write program to print odd numbers from 1 till 50
        System.out.println();
        int y=1;
        while(y<=50){

            System.out.print(y+" ");
            y+=2;
        }
        System.out.println("--------------------------");

        int cnt3=0;
        while (cnt3<=50){

            if (cnt3%2==0){
                System.out.println(cnt3+ " is an even number");

            }else {
                System.out.println(cnt3+ " is an odd number");
            }
            ++cnt3;
        }
    }
}
