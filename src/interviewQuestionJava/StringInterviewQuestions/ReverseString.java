package interviewQuestionJava.StringInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str="He llo";
        String reverse="";

        String arr[]=str.split("");

        for (int i=arr.length-1;i>=0;i--){
            reverse=reverse+arr[i];
            //reverse+=""+str.toCharArray()[i];

        }
        //way1
        System.out.println(reverse);
        //way2
        System.out.println(reverse1("StringBuffer"));
        //way3
        reverse2("WeUsedWithoutReturnType");
    }





    public static StringBuffer reverse1(String str){
       StringBuffer str1=new StringBuffer(str);
       return str1.reverse();

    }

    public static void reverse2(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.split("")[i];
        }
        System.out.println(reverse);
    }
    //please visit the below site
    //https://www.geeksforgeeks.org/stringbuffer-class-in-java/
}
