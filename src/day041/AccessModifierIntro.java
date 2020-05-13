package day041;


import day040.BankAccount;//to access BankAccount
// which is in different package we import with package name

public class AccessModifierIntro {
    public static void main(String[] args) {

        BankAccount b1=new BankAccount();
        //if we make public void only void
        //method which is void will not allow to access
        //it becomes default access modifier
        b1.showAccountBalance();//next code becomes red and
        // does not give any value
        System.out.println(b1);
        //b1.balance=1000;//if instance data balance ,has no public access modifier
        //we can not access it
        //if we make this variable public we can access it
        //public double balance; instance variable is accessible now

        //PUBLIC......... ACCESSIBLE IN ANYWHERE
        //DEFAULT........ IS ACCESSIBLE IN SAME PACKAGE
        //String name;
        //int age;
        //Above those are default
        //PRIVATE........ IS ACCESSIBLE IN ONLY WITHIN THE SAME CLASS


        //PUBLIC IS

        Person p1=new Person();
        //p1.name="Mehtap";//since name is private in the Person class
        //we can not access
        //p1.age=19;//private not accessible
        //ACCESSIBLE ONLY IN THE SAME CLASS
        p1.setAll("Cabir",48,1234567);
        System.out.println("p1 = " + p1);;
        System.out.println("p1.getName()= "+p1.getName());
        p1.setAge(21);
        p1.setSsn(8976543);


    }
}
