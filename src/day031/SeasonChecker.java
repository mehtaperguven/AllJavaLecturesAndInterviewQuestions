package day031;

public class SeasonChecker {
    public static void main(String[] args) {

        String mySeason="AAAAA";
        decideSeasonAction(mySeason);//invalid
        decideSeasonAction("Summer");//prints result via method named decideSeasonAction()
        decideSeasonAction("Spring");
        decideSeasonAction("AAAAA");
        System.out.println("AAAAA");//prints only directly
        System.out.println(mySeason);//print via variable mySeason

    }
//task
    //wrote static method called decideSeasonAction
    //it should have String parameter named season
    public static void decideSeasonAction(String season){
        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go snowboarding");
                break;
            default:
                System.out.println("INVALID ENTRY!!");



        }
    }
}
