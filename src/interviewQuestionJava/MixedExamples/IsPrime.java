package interviewQuestionJava.MixedExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class IsPrime {
    public static void main(String[] args) {
int arr[]={4,8,1,6};
SortingArrayAsc(arr);

        for (int i=100;i>=0;i-=5){

            System.out.print(i+" ");

        }

        System.out.println();
        /*INTERVIEW QUESTION:How to declare infinite loop
        Infinite loop runs without any condition and runs infinitely
         for(; ;){
        statement
        }
        * */

       // for(; ;){
         //   System.out.println("Hello");
       // }


        /*
         *IQ: What is the difference between continue and break statement/
         * Continue skips, and when break is used in loop,loop is broken and stop and exit the code
         *Below loop is broken when i=4. It prints only 0,1,2,3,4
         *
         *
         * for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==4){
               break;
            }

        }
         *
         *
         *
         * */

        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==4){
               continue;
            }
            System.out.println("It will not be printed if i=4");
        }
int num=20;
        boolean isPrime=true;

        for (int i=2;i<num/2;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }else{
                continue;
            }

        }
        System.out.println(isPrime);



    }
    public static boolean process(int number) {
        boolean returnValue = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                returnValue = false;
//                break;
            }
        }
        return returnValue;
    }

    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {
            list.add(each);
        }
//int arr[]={4,8,1,6};
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }
}




