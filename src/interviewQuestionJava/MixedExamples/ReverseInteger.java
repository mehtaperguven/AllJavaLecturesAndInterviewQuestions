package interviewQuestionJava.MixedExamples;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));


        System.out.println("...."+123/10);
    }
    public static int reverse(int a){

        int result=0;
        while(a>0){
            result=result*10+a%10;
            a=a/10;
            System.out.println(a);
        }
        return result;
    }
}
