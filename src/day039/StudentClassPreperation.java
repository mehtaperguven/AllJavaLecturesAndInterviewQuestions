package day039;

public class StudentClassPreperation {
    public static void main(String[] args) {
        //we produced two different objects s1 and s2 below
        Student s1=new Student();
        s1.name="Karima";
        s1.age=18;
        s1.gender='F';
        System.out.println("s1 name "+s1.name);
        System.out.println("s1 age "+s1.age);
        System.out.println("s1 gender "+s1.gender);
         Student s2=new Student();
         s2.name="Juma";
         s2.age=31;
         s2.gender='M';

        System.out.println("s2 age "+s2.age);
        //Let us store Juma's age before change
        int oldAge=s2.age;//oldAge is primitive
        System.out.println(s2.name+" || "+oldAge+" || "+s2.gender);
        s2.age=28;
        System.out.println(s2.name+" || "+s2.age+" || "+s2.gender);
        System.out.println("Juma's old age "+oldAge);

        //find the difference between old age and new age
        System.out.println("The difference is "+(oldAge-s2.age));
    }
}
