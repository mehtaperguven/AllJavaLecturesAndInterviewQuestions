package day08;

public class MultiBranchIf2 {
    public static void main(String[] args) {
        //more than 90 go to jail
        //reckless driving 80<speed<90
        //warning >70
        //point taken  60<speed<70
        // if not speeding keep driving

        int currentSpeed= 65;

        if (currentSpeed>90){
            System.out.println("Jail time!");
        }
        else if(currentSpeed >80){
            System.out.println("Reckless driving");
        }
        else if (currentSpeed>70){
            System.out.println("Warning!!");
        }
        else if (currentSpeed>60){
            System.out.println("Point taken");
        }
        else {
            System.out.println("Keep driving");
            //if I do not put last "else"
            // when currentSpeed=65
            // it is  printing "Point taken" and "Keep Driving" as two lines
        }

    }
}
