package day041;

public class Person {
    private String name;
    private int age;
    private long ssn;
//ENCAPSULATION IS:::::>>>
    //WE PERFORM PRIVATE INSTANCE VARIABLES
    //AFTER THAT PREPARE PUBLIC METHODS TO ACCESS THOSE INSTANCE VARIABLES
public String getName(){
    return name;
}
public void setName(String newName){
    name=newName;

}public void setAge(int newAge){

    }public void setSsn(long newSsn){
    ssn=newSsn;
    }

    public void setAll(String newName, int newAge, long newSsn){
        name=newName;
        age=newAge;
        ssn=newSsn;


    }
//RIGHT CLICK ....>>GENERATE.....>>TOSTRING()..GIVES DIRECTLY BELOW METHOD!!!
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
