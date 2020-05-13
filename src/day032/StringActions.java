package day032;

public class StringActions {
    public static void main(String[] args) {

        printStringWithDashInBetween("Erva");
        printStringWithDashInBetween("Akif");
        printStringWithDashInBetween("Duru");
        printStringWithDashInBetween("Ahmet");
        reversePrintMyName("Emir");
    }
    public static void printStringWithDashInBetween(String name){

        int length=name.length();
        for (int i=0;i<name.length()-1;i++){
            System.out.print(name.charAt(i)+"-");
        }
        System.out.print(name.charAt(length-1));
        System.out.println();
    }

    public static void reversePrintMyName(String name1){

        for (int i=name1.length()-1;i>=0;i--){
            System.out.print(name1.charAt(i));
        }
        System.out.println();
    }
}
