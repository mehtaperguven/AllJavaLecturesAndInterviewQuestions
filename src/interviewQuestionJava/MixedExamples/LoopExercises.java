package interviewQuestionJava.MixedExamples;

import java.util.Arrays;

public class LoopExercises {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        String str="";
        for (int i=0;i<=5;i+=2){
            System.out.println(arr[i]);
            str=str+arr[i];

        }
        System.out.println(str);
        System.out.println(">>>>>>>>>"+Arrays.toString(arr));





        int ii=0;
        int jj=7;
        for(ii=0; ii<jj-1; ii=ii+2){
            //if we already initialize no need to start with int in for loop
            System.out.println(ii+" ");
        }

        String [] arr2={"A","B","C","D"};
        for (int i=0;i<arr2.length;i++){

            System.out.println(arr2[i]+" ");

          if (arr2[i].equals("C")){
              continue;//we skip the next row
              //in the loop we should not have any thing after continue;
          }
            System.out.println("Work Done");
          break;//directly it stops the loop says bye bye :)


        }

////////////// new OCA Question

int data[]={2010,2013,2014,2015};
        int key=2014;
        int count=0;
        for (int each:data){

          if (each!=key) {
              continue;
             // break;
              //count++;
          }
          count++;

        }
        System.out.println(count+"found");

    }


}
