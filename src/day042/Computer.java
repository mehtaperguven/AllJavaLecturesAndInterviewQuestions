package day042;

public class Computer {
    //we prepare computer class
    /*
    * Computer
	attributes:  make it private
		brand, ram (1-128) , price
	behaviour
		runProgram
			--> print brand is running program with the ram  (size)
		calculate
			-->> print brand is calculating
		add getters and setters to all the fields
		ram can not be less than 1 more than 128
		price can not be less than
		toString method */
    private String brand;
    private int ram;
    private int cost;

public void runProgram(){
    System.out.println(this.brand+" is running program with the ram size "+this.ram);
}public void calculate(){
        System.out.println(this.brand+" is calculating ");
    }
    public String getBrand(){
        return brand;
    }public void setBrand(String brand){
        this.brand=brand;
    }public int getRam(){
        return ram;
    }public void setRam(int ram){
    if(!(ram<1||ram>128)){
        this.ram=ram;}
    }public int getCost(){
        return cost;
    }public void setCost(int cost){
    if (cost>20){
        this.cost=cost;
    }

    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", cost=" + cost +
                '}';
    }
}
