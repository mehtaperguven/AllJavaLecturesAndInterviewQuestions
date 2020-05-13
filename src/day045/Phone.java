package day045;

public class Phone extends Electronic{
    //Sub class Phone inherit every visible instance field and static field
    //Sub class Phone inherit every visible instance method and static method
    //String brand;
    //static boolean useElectricity=true;
     double size;
     double price;
//using main method below is not so nice
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="Apple";
        System.out.println(p1);
        System.out.println(useElectricity);

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        //we inherit showBrand() method from Electronic parent class
p1.showBrand();
//if you have STATIC METHOD HOW TO CALL THEM????
        //CALL THEM DIRECTLY IN SAME CLASS as below::::>>..>

        displayUseElectricity();
        //it is in Electronic we can use it in sub class
        //WE CAN CALL by STATIC WAY as shown below
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();

    }
}
