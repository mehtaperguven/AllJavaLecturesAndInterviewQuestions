package day045;

public class Electronic {

     String brand;//it belongs to Electronic
    static boolean useElectricity=true;
    //do we inherit static member?????
    //let us see.

    public void showBrand(){
        System.out.println("brand = "+brand);
    }
    public static void displayUseElectricity(){

        System.out.println("displayUseElectricity "+useElectricity);
    }
}
