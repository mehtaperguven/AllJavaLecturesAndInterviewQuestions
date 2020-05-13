package day016;

public class SecondWordGetter {
    public static void main(String[] args) {
        
        //given a sentence with 3 words
        //get the second word
        
        //steps:
        //second word is between first space and second" last space since we have three words" space
        //getting location of space reminds indexOf
        //getting string inside another string by beginning and ending index
        //reminds substring
        //                 01234567890
        //String sentence="I love Java";
//below we are getting second word
       String sentence= "You Understand *Java";
        String secondWord;
        int firstSpaceIndex=sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
//if we know the index of the first space and index of second space
// we can use the following code
        //sentence was I love Java
        System.out.println(sentence.substring(2,6));
//if we do not know the indexes
// same thing with the above code is done in the below one
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);

        System.out.println("second Word is = "+secondWord);
        
        //*****************************************
        //How to get first word
        //first word is starting from first character till first space
        String firstWord= sentence.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
        firstWord= sentence.substring(0,sentence.indexOf(" "));
        System.out.println("first word is "+ firstWord);
//**********************************

        //how to get last word
        //from last space till the end we should find locations
        //last space +1 will give me index of last word!!!

        System.out.println(lastSpaceIndex);
        System.out.println(sentence.substring(15));
       String lastWord=sentence.substring(lastSpaceIndex);
        System.out.println("lastWord =" + lastWord);
        
    }
}
