package day056;

public class ProductTest {
    public static void main(String[] args) {
        Product p1=new Product("Macbook",2999);
        Product p2=new Product("Sony Tv",499);
        Product p3=new Product("Sony Tv",499);
        Product p4=p3;
        //p1...>>points>>>>MacBook,2999 object
        //p2...>>points>>>>Sont Tv,499 object
        //p3...>>points>>>>Sony Tv,499 object
        //All p1,p2,p3 are pointing to different three objects
//therefore == gives forever false....
        System.out.println(p2==p3);//gives false
        System.out.println(p2==p2);//gives true
        //p2 and p3 are  different objects
        System.out.println(p2==p1);//false

        //equals() method was comparing if we have different object or not
//we wrote our equals() method by comparing name and price of different two objects
        //when the name and price is same it returns true
        //it does not mean that we have same object!!!!!!
        System.out.println("p2.equals(p3) >> "+p2.equals(p3));//true       System.out.println("p2.equals(p2) >> "+p2.equals(p2));//true
        System.out.println("p2.equals(p2) >> "+p2.equals(p2));//true
        System.out.println("p2.equals(p1) >> "+p2.equals(p1));//false
        System.out.println("ABC".equals("ABC"));//compares content//returns true

        System.out.println(p1.getName());


    }



}
