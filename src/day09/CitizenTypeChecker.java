package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {
        //task
        // classname CitizenTypeChecker
        //int age with value
        //if age is more than 65 , assign value of citizenType as Senior
        //if not , assign value of citizenType as Not-Senior
        String citizenType;
        int age=60;
        if (age>60){

            citizenType="Senior";
           // System.out.println("The citizen age is "+age+" , and He is "+"");
//we can use the above code here
// but to not repeat ourselves use it at the line 24 once
        }else
            {
            citizenType="Not Senior";
               // System.out.println("The citizen age is "+age+" , and He is "+"");

            }
        System.out.println("The citizen age is "+age+" , and He is "+"");
    }
}

