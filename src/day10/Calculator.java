package day10;

public class Calculator {
    public static void main(String[] args) {

        //task
        // char variable named operator
        // use switch
        //if the operator is '+' print "you are about to add numbers"
        //if the operator is '-' print "you are about to subtract the numbers"
        //if the operator is '*' print  "you are about to multiply the numbers"
        //if the operator is '/' print "you are about to divide the numbers"



        char operator='+';

        switch( operator){

            case '+':// this case is equivalent to if(operator=='+')
            System.out.println("You are about to add numbers");
            operator='+';
            break;
            case '-':
                System.out.println("You are about subtract the numbers ");
                operator='-';
                break;
            case '*':
                System.out.println("You are about to multiply the numbers");
                operator='*';
                break;
            case '/':
                System.out.println("You are about to divide numbers");
                operator='/';
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }System.out.println("your operator is  "+ operator);

    }
}
