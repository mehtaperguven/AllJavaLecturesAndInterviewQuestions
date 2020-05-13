package day037;


import java.util.ArrayList;
import java.util.List;

public class TeamMatesArrayLst {
    public static void main(String[] args) {

       // ArrayList<String>teamMates=new ArrayList<>();
        List<String> teamMates=new ArrayList<>();
teamMates.add("MehmetTice");
teamMates.add("MehtapErguven");
teamMates.add("OmerSeker");
teamMates.add("MehmetBereket");
teamMates.add("SelenUcar");
teamMates.add("SuzanCure");
teamMates.add("MuharramjonShokirova");
teamMates.add("FirdevsOren");
teamMates.add("OmerSolak");
teamMates.add("HalisCan");
teamMates.add("SemaEngin");
teamMates.add("Nurzhamal Crutchfield");
teamMates.add("HuseyinGokmen");
teamMates.add("KaderDonmez");
teamMates.add("BekirInalhan");
teamMates.add("Nurjamal Crutchfield");

        System.out.println("Team MAtes ="+teamMates);
        int lastItemIndex=teamMates.size()-1;
        System.out.println("last item = "+teamMates.get(lastItemIndex));

    for (int i=0;i<teamMates.size();i++){

        System.out.println("\tMember "+(i+1)+" "+teamMates.get(i));

    }
for (int i=teamMates.size()-1;i>0;i--){

    System.out.println("\tMember "+(i-1)+" "+teamMates.get(i));
}
//print neighboring items  1-2,2-3,3-4,4-5
for(int i=0;i<=teamMates.size()-2;i++){

    System.out.println(teamMates.get(i)+"---- "+teamMates.get(i+1));
}
        System.out.println();
        System.out.println("getting only two members without repeating");
//print1-2,3-4,5-6,....

    for (int i=0;i<teamMates.size()-1;i=i+2){
        System.out.println(teamMates.get(i)+"---- "+teamMates.get(i+1));

    }
for (int i=0;i<=teamMates.size()-3;i=i+3){
    System.out.println(teamMates.get(i)+"---- "+teamMates.get(i+1)+"----"+teamMates.get(i+2));
}
if (teamMates.size()%3!=0){
    int remainder=teamMates.size()%3;
    System.out.println(teamMates.get(teamMates.size()-remainder));
}
        //System.out.println(teamMates.size()%3);


// concat everyone in one string separated by -
        String result = "";
        for (int i = 0; i < teamMates.size()-1; i++) {

            result = result + teamMates.get(i) + "-";

        }
        System.out.print("result = " + result);
        //we removed last dash
        System.out.println(teamMates.get(teamMates.size()-1));


    //HOW CAN WE RETURN A LIST object INTO A STRING
        String lstToString=teamMates.toString();
        System.out.println(lstToString);
        System.out.println("\nlstToString after replacing = "+lstToString.replace(", "," - ")
                .replace("[","")
                .replace("]",""));



    }


}
