package interviewQuestionJava.StringInterviewQuestions;


import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="HelloHello Hello ";
        String array[]=str.split("");
        TreeSet<String> setOfLetters=new TreeSet<>();

        for (String each:array){
            setOfLetters.add(each);
        }

        String strSet=setOfLetters.toString();
        String strSetOnlyLetters=strSet.replace("[","").replace("]","").replace(",","");

        System.out.println(setOfLetters);
        System.out.println(strSetOnlyLetters);


        eliminatingDuplication("Hello hello");
        System.out.println(removeDup("Hello hello"));

    }
    public static void eliminatingDuplication(String str){

        char [] arr=str.toCharArray();
        String empty="";
        for (char each:arr){
            if ((!empty.contains(each+""))& (!(each+"").isBlank())){//to eliminate blanks between letters
                empty+=empty+each;
            }
        }

        System.out.println(empty);
    }

    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)) & !((""+str.charAt(i)).isBlank()))

                result += "" + str.charAt(i);



        return result;

    }
}
