package day012;

public class CarShopping {
    public static void main(String[] args) {

        //Buy Corolla or Tesla (only if it is within the budget)
        //there is only one car covered with cloth
        //we do not know what car is it and what is the price
        //once we take out the cloth
        //we check whether is toyota,if it is we buy it without checking price
        //if it is not we check if it is tesla and also whether it is within the budget

        int carPrice=90000;
        String carBrand="Tesla";
        int budget=40000;
        //we can use | instead of || to check all situations one by one!!!!!
        //if we care about corolla and its price
        //in this example we do not care about price of Corolla for that reason we used below statement

        if (carBrand.equals("Corolla")|| carBrand.equals("Tesla") && carPrice<=budget){
            System.out.println("Car Acquired");
        }else{
            System.out.println("Not What I'm looking for");
        }
    }
}
