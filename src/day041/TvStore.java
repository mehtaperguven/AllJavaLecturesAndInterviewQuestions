package day041;

public class TvStore {
    public static void main(String[] args) {

        TV t1=new TV();
        t1.name="Sony";
        System.out.println(t1);
        t1.turnOn();
        t1.setCurrentChannel(12);
        System.out.println("t1= "+t1.toString());
        System.out.println(t1.getCurrentChannel());
        t1.turnOff();
        System.out.println(t1);//directly calls toString method
            t1.setCurrentChannel(89);

    }
}
