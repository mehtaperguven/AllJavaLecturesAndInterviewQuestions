package day056;

public class Product extends Object{
    private String name;
    private int price;
@Override
    public boolean equals(Object obj){
    Product otherProduct=(Product)obj;//down-casting from Object to Product
    //From big cup to small cup
    return this.name.equals(otherProduct.name)&&(this.price==otherProduct.price);
}
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
