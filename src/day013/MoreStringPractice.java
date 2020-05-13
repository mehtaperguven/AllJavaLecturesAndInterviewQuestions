package day013;

public class MoreStringPractice {
    public static void main(String[] args) {

        String name="Dilara";
        System.out.println(name);
        //name is our remote controller in the stack
        //it shows object Dilara  in Heap


        name="Erva";// we reassign the value

        //connection of remote controller name and Dilara disconnected
        //now name shows object Erva in Heap
        System.out.println(name);

        name.toUpperCase();
        System.out.println(name);
        name.length();
        System.out.println(name.length());

    }
}
