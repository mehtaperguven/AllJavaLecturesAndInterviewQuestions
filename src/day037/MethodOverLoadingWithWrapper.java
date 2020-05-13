package day037;

public class MethodOverLoadingWithWrapper {
    public static void main(String[] args) {
printNum(10);
printNum(Integer.valueOf(10)) ;
    }
    //if we run only below code by auto-boxing
    //it gives two int values
    public static void printNum(int x){
        System.out.println("printing primitive int x = "+x);
    }
    //if we run only the below method
    // by auto-unboxing will give two Integer objects as a result
    public static void printNum(Integer x){
        System.out.println("printing Integer object x = "+x);
    }
    //select all ctrl+/ will make all code by //
}
