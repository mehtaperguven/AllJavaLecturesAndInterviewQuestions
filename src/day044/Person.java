package day044;

public class Person {
    private String name;
    private int age;
    public static String species;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +'\''+",species="+species+
                '}';
    }
}
