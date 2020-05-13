package day056;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Macbook Pro", 2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL", 1299));
        productList.add(new Product("Sumsung 10", 1188));
        productList.add(new Product("Sumsung Note", 1288));

        boolean result = false;
        for (Product each : productList) {

            if (each.getName().equals("Sony TV") && (each.getPrice() == 499)) {
                result = true;

            }


        }
        System.out.println("Does object have Sony TV and price 499 or not ==?? " + result);
        for (Product each : productList) {
            if (each.equals(new Product("Sony ", 499))) {
                result = true;
            }
        }
        System.out.println("Second way Does object have Sony TV and price 499 or not ==?? " + result);

        System.out.println("productList.size() = " + productList.size());

//contains()  method uses !!!!!equals() method !!!!!!!on each run
        //contains () would internally calls the equals() method of that Type(Product TYpe in here)
//List<Product> productList=new ArrayList<>(); (Product type!!!!)
        boolean result2 = productList.contains(new Product("Sony", 499));//false
        System.out.println(result2);

        Product sony = new Product("Sony Tv", 499);




        boolean result3 = productList.contains(sony);
        //this new sony object is not in the productList
        System.out.println("result3 = " + result3);//returns false

        System.out.println(productList.remove(sony));//returns false
        //because sony object is not in the productList
        //remove() method uses contains() method ....contains()method uses equals() method
        //if there exist in the list then remove this object
        //if not it does not exist can not remove it. And return false

        System.out.println("Has Sony TV after removing? = " + productList.contains(sony));
        System.out.println("productList.indexOf(sony) after = " + productList.indexOf(sony));


//        for (Product each : productList) {
//            if (each.getName().equals("Sony TV") && each.getPrice() == 499) {
//                result = true;
//            }
//            if (each.equals(new Product("Sony TV", 499))) {
//                if (each.equals(sony)) {
//                    result = true;
//                }
//            }
//
//        }




    }
}