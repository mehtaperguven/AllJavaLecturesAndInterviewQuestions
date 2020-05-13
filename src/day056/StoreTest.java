package day056;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {



        Store s1 = new Store();
        System.out.println(s1.name);
//        System.out.println(s1.allProducts);
        System.out.println("s1 = " + s1);

//        s1.allProducts.add(new Product("imac", 3999));
//        System.out.println(s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));

        Store s2 = new Store("Denis Store", denisList);
//        s2.allProducts.clear();
        System.out.println("s2 = " + s2);
        System.out.println(denisList);




//        Store s1=new Store();
//        System.out.println(s1.name);
//        System.out.println(s1.allProducts);
//
//    s1.allProducts.add(new Product("imac",3999));
//        System.out.println(s1.allProducts);
//
//        List<Product> denisList= Arrays.asList(new Product("cookie",2),
//                new Product("telefon",400),
//                new Product("book",25),
//                new Product("toy",15));
//
//Store s2=new Store("Denis Stotore",denisList);
//        System.out.println(s2);


    }
}
