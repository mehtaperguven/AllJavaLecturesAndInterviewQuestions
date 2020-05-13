package day012;

public class SameCarShoppingDifferentRepresentation {
    public static void main(String[] args) {
        int carPrice=50000;
        int budget=40000;
        String carBrand="corolla";
        if (carBrand.equals("corolla")){
            System.out.println("COROLLA CAR ACQUIRED");
        }else if (carBrand.equals("Tesla")&& carPrice<=budget){
            System.out.println("TESLA CAR ACQUIRED");
        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }
    }
}
