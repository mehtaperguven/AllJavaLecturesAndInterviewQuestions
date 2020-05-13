package day040;

public class HotMarketAction4 {
    public static void main(String[] args) {

        Offer o1=new Offer();
        o1.company="Apple";
        o1.location="Austin";
        o1.isFullTime=false;
        o1.salary=140000;
        System.out.println(o1);//directly calls automatically calls toString()method
      String o1Str=o1.toString();
      System.out.println("o1Str = " + o1Str);

       System.out.println(o1.toString());
       System.out.println(o1.toString2(o1));
       System.out.println(o1);

    }
}
