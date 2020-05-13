package day041;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setName("iphone");//if name was public p1.name was enough
        p1.setPrice(699);

        System.out.println(p1.getName());
        double myPrice=p1.getPrice();
        System.out.println("myPrice = " + myPrice);
        System.out.println(p1);


    }

}
