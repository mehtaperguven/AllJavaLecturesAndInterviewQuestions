package day045;

public class BOATeams {
    String teamType;
    int teamSize;
    String teamName;
    static String companyName;
//since it is static it is belongs to the class
    //we should call with class name
    //classname.static field;//static field is static variable
    //BOATeams.companyName;
public static void Test(){
    System.out.println(" is having a meeting ");
}

    public static void main(String[] args) {


        BOATeams team1=new BOATeams();
        team1.teamName="BugBusters";
        team1.teamSize=12;
        team1.teamType="Scrum Team";
        BOATeams.companyName="BOA";


        BOATeams team2=new BOATeams();
        team2.teamName="Eagles";
        team2.teamSize=9;
        team2.teamType="UAT";
        BOATeams.companyName="BOA";
Test();
        System.out.println();
    }

}
