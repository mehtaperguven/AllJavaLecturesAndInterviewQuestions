package day10;

public class SwitchPractice {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald , what can I do for you ");

    String order="";
    int itemNumber=5;

        // In Switch we can use only
        // byte,short, int, char, String
    switch( itemNumber){
        case 11:

            System.out.println("You have selected 11 ");
            order="Burger";
            break;
        case 5:
            System.out.println("You have selected 5 ");
            order="French Fry";
            break;
        case 8:
            System.out.println("You have selected 8 ");
            order="Nuggets";
            break;
        case 35:
            System.out.println("You have selected 35 ");
            System.out.println("YAY!! YUM!!!");
            order="Ice Cream";
            break;
        default:
            System.out.println("You have selected Unknown item");



    }
        System.out.println("Your order is , "+order);

    }
}
