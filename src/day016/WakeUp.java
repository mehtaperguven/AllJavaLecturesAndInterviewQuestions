package day016;

import java.util.Scanner;

public class WakeUp {
    public static void main(String[] args) {


        /*Wake up Task 1
        * Given a word with 4 characters stored in a String variable word1, word2;
        * Store the reversed word1 into word2 and
        * Print out
        * for example:
        * word1==Java...>>> word2==avaJ
        * Optionally ask this word from Scanner
        * */
        String word1, word2;
        Scanner scan=new Scanner(System.in);
        word1=scan.nextLine();

        /*word2=word1.replace(word1,"avaJ");
        System.out.println(word2);*/

       /* word2=word1.substring(1)+word1.substring(0,1);
        System.out.println(word2);*/
       word2= ""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
       //IF WE ADD A STRING (HERE "" IS EMPTY STRING) WHEN WE CONCATENATE CHARACTERS IT WILL BE STRING WHOLE PART

        System.out.println(word2);

    }
}
