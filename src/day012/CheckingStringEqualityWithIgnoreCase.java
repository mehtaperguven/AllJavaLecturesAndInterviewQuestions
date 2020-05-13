package day012;

public class CheckingStringEqualityWithIgnoreCase {

    public static void main(String[] args) {

        String myName="ERVA";

        boolean myNameCheck=myName.equalsIgnoreCase("erva");
        System.out.println("Does the name has exactly same characters");
        System.out.println(myName.equals("Erva"));
        System.out.println("Does the name has same character without caring case");
        System.out.println(myNameCheck);
        System.out.println(myName.equalsIgnoreCase("eRvA"));
    }
}
