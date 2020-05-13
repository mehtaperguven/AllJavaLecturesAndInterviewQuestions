package day043;

public class Coffee {
    //how to Encapsulate this add private and add setters and getters
    private String type;
    private int caffeineLevel;
    private double price;
   //no argument constructor
    public Coffee(){

    }
    //2 arguments constructor to set type and caffeineLevel
    public Coffee (String type, int level){
        //if int is caffeineLevel
        //this.caffeineLevel=caffeineLevel;
        this.type=type;
        caffeineLevel=level;
// 3 arguments constructor to set type, caffeineLevel, price
    }public Coffee(String type,int caffeineLevel, double price){
        this.type=type;
        this.caffeineLevel=caffeineLevel;
        setPrice(price);//to protect price not to be negative
        //we call setPrice() method

    }

//all getters and setters are below
    //right click generate and choose setter and getter will give directly below methods
    public String getType() {
        return type;
    }
    public int getCaffeineLevel() {
        return caffeineLevel;
    }
    public double getPrice() {
        return price;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }
//we wrote below for protection , not to have negative price
    public void setPrice(double price) {

        if(price>0){
            this.price = price;
        }else{
            this.price=1;
        }
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
