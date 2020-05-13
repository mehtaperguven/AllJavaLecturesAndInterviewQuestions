package day016;

public class Counting1To10 {
    public static void main(String[] args) {
//print numbers from 1 till 10
        int x=1;
        //while(x<11) is possible as well!!
        while(x<=10){
            System.out.println(x);
            ++x;
            //if we do not increase by 1 it will be problem it will print infinite times!!!!
        }
    }
}
