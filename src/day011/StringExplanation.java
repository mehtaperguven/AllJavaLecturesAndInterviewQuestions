package day011;

public class StringExplanation {
    public static void main(String[] args) {
        String name="Erva";// String literal
        String name2=new String ("Erva");
        String name3="Erva";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(" Comparing strings with == METHODS");
        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println(" Comparing strings with equals METHOD");
        //The correct way of comparing String to get consistent Result
        //using one of the String behavior /method called EQUALS METHOD
        // str1.equals(str2)
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

    }
}
