package day031;

public class Calculator {
    public static void main(String[] args) {
        //perform a static method that add
        //it accepts two numbers and print the result;
        add(5,9,90);
        add(80,90,68);
        multiplicationOf4Numbers(4,5,4.0,500);
        operations("product",80,20);
        operations("division",90,20);
        operations("division",70,0);
        operations("subtraction",80,100);
    }
    //if method can contain parameter as many as we want!!
    public static void add(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("Sum is = "+sum);
    }
    public static void multiplicationOf4Numbers(int n1,int n2,double n3,long n4){
        System.out.println("product is = "+(n1*n2*n3*n4));
    }
    public static void operations(String operator, int num1,int num2){
        switch (operator){

            case"addition":
                System.out.println("sum= "+num1+num2);
                break;
            case "subtraction":
                if(num1>num2) {
                    System.out.println("subtraction= " + (num1 - num2));
                }else{
                    System.out.println("subtraction= "+(num2-num1));
                }
            break;
            case"product":
                System.out.println("Multiplication result = "+num1*num2);
            break;
            case"division":
                if(num2!=0){
                System.out.println("Division is "+num1/num2);}
                else{
                    System.out.println("denominator can not be zero");
                }
                break;
            default:
                System.out.println("INVALID INPUT");
        }


    }
}
