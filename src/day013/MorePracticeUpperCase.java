package day013;

public class MorePracticeUpperCase {
    public static void main(String[] args) {

        String name="Pumpkin";

        System.out.println(name);

        name.toUpperCase();// we make it upper but did not save it
        //new string object does not have remote controller
        //it is only in heap it will not be represented in the next line
        //it will be still first name "Pumpkin" in the below line
        System.out.println(name);
        System.out.println(name.toUpperCase());

        name=name.toUpperCase();
        // when we use method we produce new name remote controller,pointer
        //
        System.out.println(name);

    }
}
