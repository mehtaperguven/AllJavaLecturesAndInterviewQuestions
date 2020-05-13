package day050;
/*Create sub class Addition
		it has one constructor to set
			num1 and num2
			it should also set questionType to "addition"
								operator to  "+"
		it should implement calculate method
		toString method in below format
			return num1 + operator +  num2  =  "" if not calculated yet
			return num1 + operator +  num2  =  answer if already calculated*/
public class Addition extends Question {

    public Addition(int num1, int num2) {
        super("+", "Addition");
        this.num1 = num1;
        this.num2 = num2;


    }

    @Override
    public void calculate() {
        answer = num1 + num2;
        //when we come to the above row
        // it means calculation is done hence,..>>>>
        calculated=true;
    }

public String toString(){
        if (calculated==true) {
            return "The question type is "+questionType+" question "+ num1 + operator + num2 + " = " + answer;
        }else{
            return "The question type is "+questionType+" question "+ num1 + operator + num2 + " = ";
        }
}


}
