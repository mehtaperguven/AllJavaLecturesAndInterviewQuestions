package day07;

public class CastingExample {
    public static void main(String[] args) {

        /* converting one type to another
        IMPLICITLY= automatically, EXPLICITLY by programmer
         */
        //primitives : byte,int,long, float,double ,

        double bigNum=10;// 10 is implicitly converted to double 10.0
        System.out.println("bigNum"+ bigNum);
        // int num= 12.99;  12.99 is double it has bigger range than int
        // int num=12.99 gives error;
        //System.out.println(num);
        int num= (int) 12.99;
        System.out.println(num);
        int a= (int) bigNum;
        System.out.println("a="+bigNum);

        //produce a long variable and store int
        //produce an int variable and try to store above long value
        System.out.println("\n"+"\n");
        long varLong= 100000;
        int varSmaller= (int) varLong;
        System.out.println("Our Long variable is " +varLong);
        System.out.println("we poured smaller cup now it  is int and its value is "+ varSmaller);
        varLong=varSmaller;
        /*
        int smallVar=18;
        long var2=smallVar;
        System.out.println(smallVar);
        System.out.println(var2);
        */
        System.out.println("new long variable  is "+ varLong);

        double price = 99;
        long earthToKrypton= 15000;

        System.out.println(price);
        System.out.println(earthToKrypton);



    }
}
