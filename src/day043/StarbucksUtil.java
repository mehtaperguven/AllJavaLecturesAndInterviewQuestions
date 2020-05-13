package day043;

public class StarbucksUtil {
    public static void main(String[] args) {
        Coffee c=new Coffee("Blonde",5,1.3);
        printCoffeeInfo(c);
Coffee c1=new Coffee ();
printCoffeeInfo(c1);
//you can directly pass coffee object as below
printCoffeeInfo(new Coffee("Turkish",9,1.9));

        String myString=new String ("Hello");
        printStringInfo(myString);
        //if below printStringInfo method is not static to call this method
        //we have to form produce util object to call non static method as below
        //StarbucksUtil util=new StarbucksUtil();
        //util.printStringInfo(myString);

    }

    /**
     *
     * @param co
     */
    public static void printCoffeeInfo(Coffee co){
        //static means we can call directly
        System.out.println("This coffee is : "+co.getType());
        System.out.println("Price is : "+co.getPrice());
        System.out.println("CaffeineLevel is : "+co.getCaffeineLevel());


    }

    /**
     * a static method to print first and last character of string
     * @param str
     */
    public static void printStringInfo(String str){
        System.out.println("first character is "+str.charAt(0));
        System.out.println("Last character is "+str.charAt(str.length()-1));
    }
}
