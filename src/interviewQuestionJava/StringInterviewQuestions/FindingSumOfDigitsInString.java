package interviewQuestionJava.StringInterviewQuestions;

public class FindingSumOfDigitsInString {
    public static void main(String[] args) {
        System.out.println(sum("A15BBbb9nn"));

    }
    public static int sum(String string){
       int sum=0;
       char[] arr=string.toCharArray();
       for (char each:arr){
           if (Character.isDigit(each)){
              sum+=Integer.parseInt(each+"");
               //sum+=Integer.valueOf(""+each);
           }
       }
        return sum;
    }
}
