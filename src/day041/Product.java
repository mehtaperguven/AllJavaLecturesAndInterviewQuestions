package day041;
//MAKE THIS PRODUCT A WELL ENCAPSULATED
//WE WILL HAVE PROTECTION IN THIS WAY
//make all the instance variables private
//provide public getters and setters
public class Product {

    private String name;
    private double price;

    public String getName(){
        return name;
    }public void setName(String name){
        //name=newName;

        this.name=name;
    }public double getPrice(){
        return price;
    }public void setPrice(double price){
        if (price>0){
           // price=newPrice;
            this.price=price;
            //this can be used inside instance method
            // (and later constructer)
        }
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
