package day055.association;

public class TaxiAction {
    public static void main(String[] args) {
        Engine en=new Engine("V6",400);
        System.out.println(en.horsePower);
        Driver dr=new Driver("Cabir",12345);
        Taxi t1=new Taxi(101,en,dr);
        System.out.println("t1 = "+t1);
        
        Taxi t2=new Taxi(103,new Engine("V8",600),new Driver("Emir",123456));
        System.out.println("t2 = " + t2);

        System.out.println(t2.dr.name);
        System.out.println(t1.dr.name);
        String nameNew=t1.dr.name;
        System.out.println("nameNew = " + nameNew);
        System.out.println(t1.eng.horsePower);

        System.out.println("\"\"\"");
        Driver y=t1.dr;//we stored Driver object into y
        System.out.println("y =" +y.name);//we called name of Driver
        System.out.println(t1.dr.name);//we call same thing name of the driver


        Engine horse=t2.eng;//giving us engine object we stored into horse
        System.out.println("horse = " + horse);
        System.out.println("horse.horsePower = "+horse.horsePower);


    }


}
