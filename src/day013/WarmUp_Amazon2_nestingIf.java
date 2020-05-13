package day013;

public class WarmUp_Amazon2_nestingIf {
    public static void main(String[] args) {

        // produce a boolean to  the result of YouWantToShop
        //if yes, do you want to go to store or do you wanna shop online
        boolean youWantToShop= true;
        String preference= "Online";
        //if(youWantToShop) is same as the next line!!
        if (youWantToShop==true){
            if (preference.equals("Store")){
                System.out.println("GOING TO STORE FOR SHOPPING");
            }else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }


        }else {

            System.out.println("good job stay home coding!!!!");
        }


    }
}
