package day050;

public class Multiplication extends Question{


    public Multiplication(int num1,int num2){
        super("*","Multiplication");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {
        answer=num1*num2;
        calculated=true;
    }

    public String toString(){
        if (calculated==true) {
            return"The question type is "+questionType+" question "+ num1 + operator + num2 + " = " + answer;
        }else{
            return"The question type is "+questionType+" question "+num1 + operator + num2 + " = ";
        }
    }
}
