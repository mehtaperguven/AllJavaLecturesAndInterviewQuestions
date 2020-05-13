package day027;

public class Multi_D_ArrayTask {
    public static void main(String[] args) {
        int [][] numbers={{12,11,10,19},{19,20,15},{100,90,89,7888}};

        int max=numbers[0][0];//assume that first element is the max

        for (int i=0;i<numbers.length;i++){

            for (int j=0;j<numbers[i].length;j++){

                if (max<numbers[i][j]){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println("max is: "+max);
//solution max by for each loop

        int max2=numbers[0][0];
        for (int [] each1DArray:numbers){
            for(int eachInt:each1DArray){
            if (max2<eachInt){
             max2=eachInt;
                }
            }

        }
        System.out.println("max 2 is: "+max2);

        int min=numbers[0][0];
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                if (min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println("min number is: "+min);

    }
}
