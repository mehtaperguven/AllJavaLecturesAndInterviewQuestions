package interviewQuestionJava.StringInterviewQuestions;

public class Palindrome {

    public static boolean isPalindrome1(String text) {
        String noGap = text.replaceAll(" ", "").toLowerCase();
        StringBuffer str = new StringBuffer(noGap);
        StringBuffer reverse = str.reverse();//we use reverse() method from StringBuffer class
        return (reverse.toString()).equals(noGap);//we must convert to string!
    }

    public static boolean isPalindrome(String string){
        String reverse="";
        String strNoSpace=string.toLowerCase().replaceAll(" ","");
        for (int i=strNoSpace.length()-1;i>=0;i--){
            reverse=reverse+strNoSpace.charAt(i);
        }
        System.out.println(reverse);

        return strNoSpace.equals(reverse);

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome1("LoLo    L"));

        System.out.println(isPalindrome("Bon     non"));

    }
}
