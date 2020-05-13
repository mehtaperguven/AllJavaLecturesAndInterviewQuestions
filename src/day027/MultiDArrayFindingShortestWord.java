package day027;

public class MultiDArrayFindingShortestWord {
    public static void main(String[] args) {
        String [] developersTeam={"Vladislav","Ercan","Tolkun","Abide"};
        String [] testersTeam={"Mehtap","Erva","Feyzacan"};
        String [] businessAnalystsTeam={"Lisa","Ozlem","Naila"};

        String [][] scrumTeam={developersTeam,testersTeam,businessAnalystsTeam};
        int minLength=scrumTeam[0][0].length();
        String shortestString=scrumTeam[0][0];
        for (int i=0;i<scrumTeam.length;i++){
            for (int j=0;j<scrumTeam[i].length;j++){
                if (minLength>scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortestString=scrumTeam[i][j];
                }

            }
        }

        System.out.println(minLength);
        System.out.println(shortestString);


    }
}
