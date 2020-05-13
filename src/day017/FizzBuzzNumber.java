package day017;

public class FizzBuzzNumber {
    public static void main(String[] args) {
        //if a number can be divided by both 3 and 5 ....>>Fizz Buzz Number???
        //if a number can be divided by  5.....>>Fizz Number?
        //if a number can be divided by 3....>>>Buzz Number??

        int num=1;
        while(num<=51){

        if (num%5==0 && num%3==0){
            System.out.println(num+ " is Fizz Buzz Number");
        }else if (num%5==0){
            System.out.println(num+ " is Fizz number");
        }else if (num%3==0){
            System.out.println(num+ " is Buzz number");
        }
        ++num;
        }
    }
}
