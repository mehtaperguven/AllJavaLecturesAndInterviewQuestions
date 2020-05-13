package day056;

import java.util.Arrays;
import java.util.List;

public class StoreTest3 {
    public static void main(String[] args) {
List<Product> newLst= Arrays.asList(new Product("cookie",2),
        new Product("telefon",400),
        new Product("book",25),
        new Product("toy",15),
        new Product("coffee",4),
        new Product("nuts",5),
        new Product("Java Book",75));

Store s2= new Store("Mehtap's stora has",newLst);

        System.out.println("s2.getMOstExpensiveProduct() "+s2.getMOstExpensiveProduct());

    }
}
