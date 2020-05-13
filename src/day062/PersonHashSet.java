package day062;

public class PersonHashSet implements Comparable<PersonHashSet>{
    String name;
    int age;

    public PersonHashSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonHashSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public int compareTo(PersonHashSet person) {

        if (this.age>person.age){
            return 1;
        }else if (this.age<person.age){
            return -1;
        }else{
            return 0;
        }
    }


}
