package day023;

public class ForEachLoop {
    public static void main(String[] args) {

        double[] prices={99.23,11.98, 100.23, 99.99, 56.34};

        //FOR EACH LOOP SYNTAX

        //for(dataTypeOfYourArray variableNameForEachTime: yourArrayVariable){
        // do something in here
        // }
        for (int x=0; x<prices.length;x++){
            double eachPrice=prices[x];
            System.out.println("eachPrice = " + eachPrice);
        }

        //LETS DO same as above code  BY FOR EACH LOOP
        //for each loop can only be used for Array
        //there is no infinite loop ever in for each loop
        //it goes by order!!!!!!

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (double blablabla : prices ){

            System.out.println("eachPrice = "+blablabla);
        }
    }
}
