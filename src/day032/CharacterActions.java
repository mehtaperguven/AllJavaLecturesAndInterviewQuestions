package day032;

public class CharacterActions {
    public static void main(String[] args) {
printAToZ();
printZtoA();
    }
    public static void printAToZ(){
        for (char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printZtoA(){
        for (char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }
    }
}
