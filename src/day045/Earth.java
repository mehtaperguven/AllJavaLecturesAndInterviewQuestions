package day045;

public class Earth extends Planet{

    int population;


    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        //this.gravity=gravity;
        //this.radius = radius;
        //this.hasLife = hasLife;
        //to reuse the functionality of super class constructor
        //in  sub class constructor
        //we used super(gravity,radius,hasLIfe);
        this.population = population;
    }


    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public static void main(String[] args) {
        Earth e1=new Earth(9.87,5000,true,100000);
        System.out.println(e1);
        //if I do not have toString() method
        // I can not print e1

    }
}
