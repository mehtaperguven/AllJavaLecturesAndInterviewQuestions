package day034;

public class ReturnPractice {
    public static void main(String[] args) {

        //why return keyword is used
        //when method is terminated we can use return;
        //break VS return

        //break...loop:break out of the loop
        //in switch ...to  break out of the case
        //we can NOt use to exit the method!!!!!!!

        //return....inside the method:
        //returns the value out of a method with return type
        // when we reached to return keyword it will terminate the method
        //can we use in void method?/....yes but only
        //As....... return;
        //in void we use to terminate the method early!!!!
      printMin4CharacterLengthName("ja");
      printMin4CharacterLengthName("Java shark");
      printMin4CharacterLengthName("ozi");
      printMin4CharacterLengthName("erva eerguven");
    }
    public static void printMin4CharacterLengthName(String name){

        if (name.length()<4){
            System.out.println("INVALID NAME");
            return;
            //when we use return, for the word"Ja" it will print INVALID NAME
            //and directly finish the code
            //if I do not use return; it will first INVALID NAME then will print Ja
        }
        System.out.println(name);
    }
}
