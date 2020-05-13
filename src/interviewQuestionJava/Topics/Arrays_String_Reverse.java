package interviewQuestionJava.Topics;

import java.util.Arrays;

public class Arrays_String_Reverse {
    public static void main(String[] args) {

        //array declaration, int, String, char

        int [] arr=new int[5];
        int[] arr1={1,2,3,4,5};

        char [] c=new char[3];
        char [] c1={'a','b'};

        String [] a1=new String[]{"A","B"};

        System.out.println("int array"+Arrays.toString(arr1));
        System.out.println("char arr"+Arrays.toString(c1));


        //using for loop to print arrays

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i=0;i<cars.length; i++){

            System.out.println(cars[i]);
        }


        //using for each loop to print arrays

        for (String each: cars){
            System.out.print(each+" ");
        }


        //finding max value of array, min value ?
        System.out.println();
        int [] a2={2,4,6,8,9};
        int max=0;
        for (int i=0;i<a2.length;i++){
            if (a2[i]>max){//a2[0]=2>0
                max=a2[i];
            }
        }
        System.out.println("max value "+max);

    //finding min value of array
        int min=a2[0];
        for (int i=0;i<a2.length;i++){
            if (a2[i]<min){//a2[0]=2
                min=a2[i];
            }
        }
        System.out.println("min value "+min);

        //reversing array,swapping using temp;

        int a[]={4,9,3,1};

        int temp; int l=a.length-1;

        for (int i=0;i<a.length/2;i++){

            temp=a[i];//a[0]
            a[i]=a[l-i];//a[0]=a[4-1-0]=a[3]
            a[l-i]=temp;//a[3]=a[0]
        }

        System.out.println("swapped array   "+Arrays.toString(a));//[1,3,9,4]

        Arrays.sort(a);
        System.out.println("ne sorted array "+Arrays.toString(a));//[1,3,4,9]...sorting in ascending order

        //INTERVIEW QUESTION  reversing string

        String str="He llo";
        String sNoGap=str.replaceAll(" ","");
        String reverse="";
         String s[]=sNoGap.split("");
         for (int i=s.length-1;i>=0;i--){
             //reverse+=s[i];
             reverse+=sNoGap.charAt(i);

         }

        System.out.print("reverse;;;;;;;;;;;;;;"+reverse);
        System.out.println();


        //using StringBuffer to  reverse the string
        //we can use StringBuffer class to use reverse() method!!

        String s3="HELLO";
        StringBuffer str1=new StringBuffer(s3);
        str1.reverse();//it is already changed since String Buffer is mutable

        System.out.println(str1);



        //INTERVIEW QUESTION PALINDROME
        // reading from right to left does not effect word itself...Palindrome
        String newStr="ANn A";
        String reverse1="";
        String s5=newStr.replaceAll(" ","").toLowerCase();
        System.out.println("s5 is "+s5);

        for (int i=s5.length()-1;i>=0;i--){
            reverse1+=s5.charAt(i);
        }
        System.out.println("reverse1  is   "+reverse1);
        System.out.println(s5.equals(reverse1));


        System.out.println(reverse1("HELLO"));

    }public static StringBuffer reverse1(String str){
        StringBuffer str1=new StringBuffer(str);
        return str1.reverse();

    }
}
