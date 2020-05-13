package day027;

public class MultiDimensionalArrayPractice_Teams {
    public static void main(String[] args) {

        String [] developersTeam={"Vladislav","Ercan","Tolkun","Abide"};
        String [] testersTeam={"Mehtap","Erva","Feyzacan"};
        String [] businessAnalystsTeam={"Lisa","Ozlem","Naila"};

        String [][] scrumTeam={developersTeam,testersTeam,businessAnalystsTeam};
        int maxLength=scrumTeam[0][0].length();
        String longestString=scrumTeam[0][0];
        for (String [] each1DArray:scrumTeam){
            for (String eachElement:each1DArray){
                if (maxLength<eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }


            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
    }
}
