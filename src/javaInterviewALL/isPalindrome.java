package javaInterviewALL;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalind(123432));

    }
    public static boolean isPalindrome(int num){

        String number=String.valueOf(num);
        String s="";

        for (int i=number.length()-1;i>=0;i--){
            s+=number.charAt(i);

        }
       return number.equals(s);

    }

    public static boolean isPalind(long num){
//121
        long remain=num;
        long rev =0;
        while (remain!=0){
            long digit=remain%10; //121%10=1>>12%10==2>>1%10==1
            rev=rev*10+digit;// 0*10+1==1>>1*10+2==12>>12*10+1=121
            remain/=10;//121/10==12>> 12/10==1>>>>1/10==0
        }
        return num==rev;

    }

}
