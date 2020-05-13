package day023;

public class WarmUpArray {
    public static void main(String[] args) {
        //form int array of 7 items
        //assign values
        //print out in reverse order
        //store last item i  lastItem variable
        //print out separately
        //print the item right in the middle
        //find sum, max, average, min

        int num[]=new int[]{10,2,21,4,50,6,7};
        int length=num.length;
        System.out.println(length);
        for (int i = length-1; i>=0 ; i--) {
            System.out.print(num[i]+" ");

        }
        int lastItem=num[length-1];
        System.out.println();
        System.out.println(lastItem);

int middle=length/2;
        System.out.println(middle);
        System.out.println(num[middle]);
        int sum=0;

        for (int i = 0; i <length ; i++) {
             sum=sum+num[i];

        }
        double average;
        System.out.println("sum is :"+sum);
        average=sum/length;

        System.out.println("average :"+average);
        int max=num[0];
        for (int i = 0; i <length ; i++) {
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("maximum is: "+max);
        int min=num[0];
        for (int i = 0; i <length ; i++) {
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("minimum number is: "+min);
    }

}
