package day042;

public class Teacher {
    //ENCAPSULATION make private instance variables then perform public methods
    private String name;
    private int age;
    //do not put main in here
    public static void main(String[] args) {

        Teacher t1=new Teacher();
        t1.age=25;
        t1.name="Cabir";
        System.out.println(t1);
        t1.setName("Cabircan");
        t1.setAge(44);
        System.out.println(t1);
        System.out.println( t1.getName());
        System.out.println(t1.getAge());
        t1.setAll("Cabir Erguven",48);
        System.out.println(t1);
        System.out.println(t1.getClass());


    }
    public String getName(){
        return name;
    }public void setName(String name){
        this.name=name;
    }public int getAge(){
        return age;
    }public void setAge(int age){
        this.age=age;
    }public void setAll(String name,int age){
        //this.age=age;
        //this.name=name;//or like below code
        // we can set names by other set methods directly
      setName(name);//optionally this.setName(name);
        setAge(age);

    }

    //right click/generate/toString()
    // select all variables will give below code directly
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
