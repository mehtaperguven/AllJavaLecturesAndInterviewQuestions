package day044;

public class PersonAction {
    public static void main(String[] args) {
        Person p1=new Person("Jon Snow",28);
        p1.species="Human";
        System.out.println(p1);
        System.out.println(Person.species);
        Person p2=new Person("Erva Erguven",5);
        p2.species="Humanoid";

        System.out.println(p2);
        System.out.println(Person.species);


    }
}
