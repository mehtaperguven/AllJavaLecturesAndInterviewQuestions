package day050;

public class Division extends Question {

    public Division(int num1, int num2) {
        super("/", "Division Question");
        if (num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public void calculate(){
        if (num2==0){
            answer=0;
        }
        answer=num1/num2;
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
