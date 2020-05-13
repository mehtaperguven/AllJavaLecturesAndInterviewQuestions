package day056;

import java.util.Arrays;
import java.util.List;

public class Store2Test {
    public static void main(String[] args) {

        List<Product> lst= Arrays.asList(new Product("cookie",2),
                new Product("telefon",400),
                new Product("book",25),
                new Product("toy",15));


        Store s2=new Store("Mehtap's store",lst);
        System.out.println("s2 = " + s2);


        Product p1=new Product("Cheese cake",10);



    s2.addProduct(p1);
        System.out.println("s2 = " + s2);

        s2.addProduct("Latte",3);
        System.out.println("s2 = " + s2);
        s2.displayProduct();

        System.out.println("Do we have cheese cake with prive 10$ ? "+s2.checkIfProductExists(p1));
        System.out.println("What is the index of Cheese cake "+s2.indexOfProduct(p1));

        System.out.println("s2.find Sum Of All Product Prise() "+s2.findSumOfAllProductPrise());
        System.out.println("s2.getAveragePrice() "+s2.getAveragePrice());

    }





}
