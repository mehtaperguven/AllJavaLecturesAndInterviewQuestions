package day017;

public class OnlyOddNumber {
    public static void main(String[] args) {

        int x=100;
        while (x>0){
        //if(x % 2!=0) this code is same as below code
            if(x % 2==1){

                System.out.println(x+" is odd number");
            }
            --x;
        }
    }
}
