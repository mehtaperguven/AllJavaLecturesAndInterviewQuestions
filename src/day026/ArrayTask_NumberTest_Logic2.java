package day026;

public class ArrayTask_NumberTest_Logic2 {

    public static void main(String[] args) {

        // logic 2
        // we are checking all the elements are they more than 100 or not?
        // assume finalResult="yes"; check each item
        //break as long as one number is less than 100

        int[] scores={156, 101,76,187,87,110};
        String finalResult="yes";
        for (int eachNum: scores){
            if (eachNum<=100){
                finalResult="No";
                break;
            }
        }
        System.out.println("final result : "+finalResult);


    }
}
