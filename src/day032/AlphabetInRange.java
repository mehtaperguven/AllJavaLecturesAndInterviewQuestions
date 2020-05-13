package day032;

public class AlphabetInRange {
    public static void main(String[] args) {
        //if beginning char is before ending char...>>>A,D..>>>ABCD
        //If beginning char is after ending char...>>>D,A..>>>DCBA
        //How to determine 'a'>'b'....>>>ascii code
        printAlphabetInRange('A','D');
        printAlphabetInRange('Z','Q');
        printAlphabetInRange('N','N');

    }
    public static void printAlphabetInRange(char beginning, char ending){
        if (beginning<ending){
            System.out.println("we need to increment from "+beginning+" till "+ending);
            for (char i=beginning; i<=ending;i++){
                System.out.print(i+" ");
            }
            System.out.println();

        }else if(beginning>ending){
            System.out.println("we need to decrement from "+beginning+" till "+ending);
            for (char i=beginning; i>=ending;i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }else{
            System.out.println("the characters are same!!");
        }

    }
}
