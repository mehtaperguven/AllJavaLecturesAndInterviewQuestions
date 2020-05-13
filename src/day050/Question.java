package day050;

public abstract class Question {
    /*
    * it will be abstract class
    * fields:
    * int num1;
    * int num2
    * String operator;
    * int answer;
    * boolean calculated;
    * String questionType;
    * */

    int num1,num2,answer;
    String operator;String questionType="Unknown";
    boolean calculated;
    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    public abstract void calculate();


    public String toString() {
        return "MathQuestionSecondGrade{" +
                "This question is'" + questionType + '\'' +
                '}';
    }
}
