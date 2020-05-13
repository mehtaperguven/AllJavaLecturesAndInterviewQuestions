package day056;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
   // List<Product> allProducts;
   private List<Product> allProducts;//Store has list of products

public Product getMOstExpensiveProduct(){

    Product maxProduct=null;
    int max=Integer.MIN_VALUE;//we can say >>>>>int max=allProducts.get(0).getPrice();
    for (Product each: allProducts){

      if (max< each.getPrice()){
          max=each.getPrice();
          maxProduct=each;
      }

    }
    return maxProduct;
}
    public int findSumOfAllProductPrise(){
        int sum=0;
        for (Product each:allProducts){
            sum+=each.getPrice();
        }
        return sum;
    }
    public double getAveragePrice(){

        return findSumOfAllProductPrise()/getProductCount();
    }

    public void  addProduct(Product p){
        System.out.println("calling addProduct( Product P) ");
        allProducts.add(p);
    }

    public void addProduct(String productName, int productPrice){
        Product newP=new Product(productName,productPrice);
        allProducts.add(newP);
    }

    public int getProductCount(){
        return allProducts.size();
    }
    public void displayProduct(){
        System.out.println(name +"'s store has below product:");
        for (Product each:allProducts){
            System.out.println("\t each = "+each);
        }
    }
public boolean checkIfProductExists(Product p){
        return allProducts.contains(p);
}
public int indexOfProduct(Product p){
        return allProducts.indexOf(p);

}
public void removeProduct(Product p){

        if (checkIfProductExists(p)==true){
            allProducts.remove(p);
        }else{
            System.out.println("We do not have "+p);
        }
}
    public Store(){
        this.name="Cybertek Store";
        this.allProducts=new ArrayList<>();//we produce ArrayList object as []
        //Later we can insert elements inside
    }
    public Store(String name, List<Product> otherList){
        this();//calls no arg constructor
        this.name=name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
