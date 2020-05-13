package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade='B';
        System.out.println(grade);

        int letterInNumber='B';
        //"B" is represented as 66 in ascii table
        // Above  char type 'B' is widened to int and stored as number 66
        System.out.println(letterInNumber);

        int letterInNumber2='b';// in ascii "american information institution" b=98
        System.out.println(letterInNumber2);

        char myFirstChar=(char) 100;
        System.out.println(myFirstChar);

        System.out.println("\n");
        System.out.println("ASCII CODES OF LETTERS OF MY NAME");
        int myNamesLetterToNumber1='M';
        int myNamesLetterToNumber2='E';
        int myNamesLetterToNumber3='H';
        int myNamesLetterToNumber4='T';
        int myNamesLetterToNumber5='A';
        int myNamesLetterToNumber6='P';


        System.out.println(myNamesLetterToNumber1);
        System.out.println(myNamesLetterToNumber2);
        System.out.println(myNamesLetterToNumber3);
        System.out.println(myNamesLetterToNumber4);
        System.out.println(myNamesLetterToNumber5);
        System.out.println(myNamesLetterToNumber6);


        System.out.println("\n");

        char letterA='a';
        //adding integer to a character will result in int as ascii number
        // int letterA + 1 is int
        int myN1='a';
        System.out.println("letterA is: "+ letterA);// gives===> letterA is : a
        System.out.println(myN1);// it is 97
        System.out.println(letterA+1);//97+1=98
        System.out.println(""+ letterA+1);// it is concatenating letter and int as "a1"

    }
}
