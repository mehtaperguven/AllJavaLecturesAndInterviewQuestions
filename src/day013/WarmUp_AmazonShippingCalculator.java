package day013;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {

        /*
        Amazon has two type of users, Prime Member and Regular Member
        *Prime member get free shipping in all purchase no matter the amount
        * Regular member get free shipping only if their purchase more than 25&
        *otherwise they get 5$ shipping fee
         */

        String memberType="member";
        double amount=15.99d;
        int shippingFee=0;

        if (memberType.equalsIgnoreCase("prime member")){
            System.out.println("You get 1 day free shipping");
            System.out.println("Your final perice is "+ amount);
        }else if (amount>25){
        //else if (!memberType.equalsIgnoreCase("prime member") && amount>25)
            //we can use second row more obviously!!

            System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25 ");
            System.out.println("You got free shipping on amount "+ amount);
        }else {
            System.out.println("Do you want to sign up for prime membership ?");
            shippingFee=5;
            amount=amount+shippingFee;// amount+=shippingFee;
            System.out.println("Your final amount is "+ amount);
        }
    }
}
