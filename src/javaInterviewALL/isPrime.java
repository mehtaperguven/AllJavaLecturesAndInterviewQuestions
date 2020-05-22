package javaInterviewALL;

public class isPrime {

    public static void main(String[] args) {
   printAllPrimes(20);

    }
    public static void printAllPrimes(int num){
        for (int i=2;i<=num;i++){
            if (isPrimeNum(i)) {
                System.out.print(i+" ");
            }
        }

    }


    public static boolean isPrimeNum(int num){

        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }





}
