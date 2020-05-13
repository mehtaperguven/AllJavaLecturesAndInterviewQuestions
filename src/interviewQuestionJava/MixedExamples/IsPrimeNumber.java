package interviewQuestionJava.MixedExamples;

public class IsPrimeNumber {


    public static boolean isPrimeNUmber(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void isPrime(int num){

       for (int j=2;j<=num;j++) {
           boolean isPrime=true;
           for (int i = 2; i <= j / 2; i++) {

               if (j % i == 0) {
                   isPrime=false;
                   break;
               }


           }
           if (isPrime=true){
               System.out.print(j+" ");
           }

       }
    }
    public static void prime(int n) {

        /*
            A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself.
        */
        for(int i=2;i<=n;i++) {
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++)  // 2.Try dividing the number by half check whether it divisible
            {
                if(i%j==0) // 3. If the number is divisible by other number ->Not a prime Number
                {
                   isPrime=false;
                   // break;
                }

            }
            if(isPrime==true) // 4. If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       // System.out.println(isPrimeNUmber(10));
       // isPrime(100);
        prime(50);
    }
}
