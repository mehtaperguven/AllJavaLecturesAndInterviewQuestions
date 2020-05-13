package day024;

public class ShoppingWithArray {
    public static void main(String[] args) {
        //String[] groceryItems=new String[6];
        //String [] groceryItems= new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
        String [] groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};
        //task 1
        //print each member in one line with arrow
        for (String eachFruit: groceryItems){
            System.out.print(eachFruit);
            System.out.print("-->");

        }

        //print each member in one line with arrow and do not put arrow after last one
        //assume you know last item is kiwi
        //if the fruit you are checking is kiwi just do not add it
        //how to get last item of anny array programmatically

        int itemCount=groceryItems.length;
        int lastItemIndex=itemCount-1;
        String lastFruit=groceryItems[lastItemIndex];
//below for each loop  express that : String eachFruit members
// which are in the groceryItems Array
// there is no infinite loop in for each loop
        for (String eachFruit: groceryItems){

            System.out.print(eachFruit);
            if (!eachFruit.equals(lastFruit)){
                System.out.print("-->");
            }
        }




    }
}
