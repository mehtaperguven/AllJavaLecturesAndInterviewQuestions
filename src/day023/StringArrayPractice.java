package day023;

public class StringArrayPractice {
    public static void main(String[] args) {

        String [] shows={"Orville","Game of Throne","Flash","Arrow","Super girl"};
        int showsCount=shows.length;
        System.out.println("showsCount = " + showsCount);
        for (int x=0;x<showsCount; x++){

            String currentShow=shows[x];
            System.out.println(currentShow+" has character count : "
                    +currentShow.length());


        }

       String firstThree= shows[0].substring(0,3);
        System.out.println(firstThree);
    }
}
