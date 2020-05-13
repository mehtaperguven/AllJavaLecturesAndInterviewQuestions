package day051;

public class Person implements Comparable<Person> {
    //Comparable is interface comes from JDK
    //it contains public int compareTo(...);
    //which is abstract method without body
    //if Person is comparable
    // you can put inside Comparable<..in here..>


    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo1(Person p1, Person p2) {
        int age1 = p1.age;
        int age2 = p2.age;
        //how can we compare two person with each other
        //Compare two person by age
        if (age1 > age2) {
            return 1;
        } else if (age1 == age2) {
            return 0;
        } else {
            return -1;
        }

}//below code comes from Comparable Interface
    //Comparable has only below method inside
    // and Comparable comes fromJDK
//        @Override
//        public int compareTo (Person p1){
//            if (this.age > p1.age) {
//                return 1;
//            } else if (this.age == p1.age) {
//                return 0;
//            } else {
//                return -1;
//            }
//        }
    @Override
    public int compareTo(Person p1){
//        if (this.name.charAt(0) > p1.name.charAt(0)) {
//            return 1;
//        } else if (this.name.charAt(0) == p1.name.charAt(0) ){
//            return 0;
//        } else {
//            return -1;
//        }
        return this.name.compareTo(p1.name);
    }


//    @Override
//    public int compareTo(Person person) {
// if we write inside of Comparable<Person>...compareTo methods would have Person
//        return 0;
//    }
//
//    @Override
//    public int compareTo(String s) {
// if we write inside of Comparable<String>...
// compareTo methods would have String
//        return 0;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}