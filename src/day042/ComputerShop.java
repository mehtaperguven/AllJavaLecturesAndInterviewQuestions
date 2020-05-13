package day042;

public class ComputerShop {
    public static void main(String[] args) {
        //let us prepare Computer object

        Computer c1=new Computer();
        c1.setBrand("Apple");
        c1.setRam(32);
        c1.setCost(2000);
        c1.runProgram();
        c1.calculate();

        System.out.println(c1);
        int myRam=c1.getRam();//we make a new int variable myRam
        System.out.println("myRam is = " + myRam);

        Computer c2=new Computer();
        c2.setBrand("HP");
        c2.setCost(c1.getCost()/2);
        c2.setRam(myRam/4);
        System.out.println(c2);

        c1.setCost(1800);
        c1.setRam(16);
        System.out.println(c1);


    }

}
