package day031;

import org.w3c.dom.ls.LSOutput;

public class MethodPractice3 {
    public static void main(String[] args) {
        countDownFrom20tillOne();
        System.out.println();
        printOddNumbers1to100();
        System.out.println();
        namePrint();
    }

    public static void countDownFrom20tillOne(){

        for (int i=20;i>0;i--){
            System.out.print(i+" ");
        }
    }

    public static void printOddNumbers1to100(){
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void namePrint(){
        String name="Mehtap";
        for (int i=0;i<name.length()-1;i++){
        System.out.print(name.charAt(i)+"-");}
        System.out.println(name.charAt(name.length()-1));

    }

}
