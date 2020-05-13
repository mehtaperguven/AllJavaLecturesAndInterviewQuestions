package day036;

public class MethodWithParameters {
    public static void main(String[] args) {

        addOneHundred(25);//125
        addOneHundred(new Integer(100));//200
        int num=8;
        addOneHundred(num);//108


        addOneHundred2(45);

        int num2=10;
        addOneHundred2(10);//110
        addOneHundred2(num2);//this method does not change num2 only print inside the method value is still same
        //Arrays.sort() method changes array value ,order !!!!!!Different case
        //num2 was 10 in the method we add 100 and result becomes 110
        //in the method x will copy inside num2 which is pure value int 10!!!
        System.out.println(num2);
        //Infect num2 is still 10 result becomes 10

    }public static void addOneHundred(int x){
        //when we pass the method int x=25;
        //int x=new Integer(100);
        //int x=num;....>>>>int x=8;
        System.out.println(x+100);
    }public static void addOneHundred2(int x){

        x=x+100;
        System.out.println(x);
    }
}
