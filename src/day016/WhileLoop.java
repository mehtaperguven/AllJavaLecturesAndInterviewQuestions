package day016;

public class WhileLoop {
    public static void main(String[] args) {
//******************WHILE LOOP***************************
        //while (a condition is true){
        // repeat this action
        // }
        //until condition is false loop  will keep repeating forever!!!!
//******************************************
        //important!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
int x=0;
while(x<5){
    System.out.println("happy new day");
}
*/
// in the above code since condition x<5 is true
// happy new day will be repeated infinite times
//**********************************
        //below it will repeat until x is 5!!
        //it will print out 5 happy new day
        int x=0;
        while(x<5){

            System.out.println("happy new day");
            ++x;
        }


    }

}
