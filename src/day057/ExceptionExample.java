package day057;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello  Friends!");

       //int num=2.5;//COMPILE ERROR
        int nums[]=new int[3];//array declaration
        nums[0]=55;
        System.out.println(nums[0]);
        nums[1]=56;
        System.out.println(nums[1]);
//try {
    nums[8] = 100;
   // throw new IndexOutOfBoundsException();
//}catch(IndexOutOfBoundsException e){
    //System.out.println(e);
            System.out.println("bnbbbbbbb");
        //}
       // nums[3]=200;//it will not give compile error
        //However at the Runtime ArrayIndexOutOfBoundsException Error happens
        System.out.println("Bye bye B15");//At run time it will not be printed

       //int result=10/0;//ArithmeticException :/by zero thrown in runtime
        //System.out.println("result is "+result);//it can not print this line



    }
}
