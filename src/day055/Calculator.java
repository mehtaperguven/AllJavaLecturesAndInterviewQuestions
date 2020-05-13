package day055;

public class Calculator {
     int result;
    //addNum is a method to add number to current result
    //addNum returns Calculator object
    //We can keep calling a method with the same object
    //c1.addNum(100).addNum(500).addNum(400);
    //object.method().method().method()...
    //only one object and multiple method calls with chaining
    //this is called BUILDER PATTERN in Java
public Calculator minusNum(int num){
    this.result-=num;//this represents the current object
    // which we work on Below this. points c1
    //Later this calls c2
    return this;
}
    public Calculator addNum(int num){
        this.result=this.result+num;
        return this;
    }
    public void displayFinalResult(){
        System.out.println("result is "+result);
    }

    public static void main(String[] args) {

        Calculator c1=new Calculator();
        c1.addNum(100).addNum(200).minusNum(50);

        System.out.println(c1.result);
Calculator c2=new Calculator();
c2.addNum(400).minusNum(100).addNum(700);
        System.out.println(c2.result);
        c1.addNum(500).addNum(900).displayFinalResult();

        System.out.println(c1.result);

    }
}
