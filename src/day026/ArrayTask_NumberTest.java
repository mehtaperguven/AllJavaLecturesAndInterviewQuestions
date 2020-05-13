package day026;

import java.util.Arrays;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        //1. write a program
        // to test all the element in an int array more than 100

   int[] scores={156, 101,76,187,87,110};
   int scoresMoreThan100 []=new int[6];
   int count=0;
  for (int i=0;i<scores.length; i++){

      if (scores[i]>=100){
          scoresMoreThan100 [i]=scores[i];
          count++;
      }

  }
        System.out.println(Arrays.toString(scoresMoreThan100));
        System.out.println(count);

        for (int i=0;i<scoresMoreThan100.length;i++){
            if (scoresMoreThan100[i]==0){
                 continue;
                }
            System.out.print( (scoresMoreThan100[i]=scores[i])+", ");
        }
        System.out.println();

        System.out.println("Numbers less than 100: ");
        //FINDING NUMBERS LESS THAN 100
        int countLessThan100=0;
        for (int eachNum :scores){
            if (eachNum<=100){
                System.out.println("eachNum = " + eachNum);
                countLessThan100++;
            }
        }
        System.out.println(countLessThan100);

        //FINDING NUMBERS MORE THAN 100

        int countMoreThan100=0;
        for (int eachNum:scores){
            if (eachNum>=100){
                System.out.println("eachNum = " + eachNum);
                countMoreThan100++;
            }
        }
        System.out.println(countMoreThan100);

        System.out.println("*************************");

        //using for loop finding and printing numbers more than 100
        int count1=0;
        for (int i=0;i<scores.length; i++){

            if (scores[i]>=100){
                System.out.println("scores "+i+" "+(scores[i]=scores[i]));
                count1++;
            }


        }
        System.out.println(count1);

        System.out.println("**********************");
        String finalResult;
//let us find , do all numbers are more than 100
        if (countMoreThan100==scores.length){
             finalResult="Yes";
        }else{
            finalResult="No";
        }
        System.out.println(finalResult);
    }

}
