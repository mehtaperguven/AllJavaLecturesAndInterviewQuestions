package day09;

public class DayPrinter {
    public static void main(String[] args) {

        /*Produce the variable called dayCode as int
        * if the dayCode is 1  print Monday
        * if the dayCode is 2  print Tuesday
        * if the dayCode is 3  print Wednesday
        * if the dayCode is 4  print Thursday
        * if the dayCode is 5  print Friday
        * if the dayCode is 6  print Saturday
        * if the dayCode is 7  print Sunday
        * if none of the above just print unknown day
         */
        int dayCode=6;
        String dayName="";// WE ASSIGNED EMPTY STRING VALUE

        if (dayCode==1){
            //System.out.println("Day is Monday");
            dayName="Monday";
        }else if(dayCode==2){
            //System.out.println("Day is Tuesday");
            dayName="Tuesday";
        }else if (dayCode ==3){
            //System.out.println("Day is Wednesday");
            dayName="Wednesday";
        }else if (dayCode ==4){
            //System.out.println("Day is Thursday");
            dayName="Thursday";
        }else if (dayCode ==5){
            //System.out.println("Day is Friday");
            dayName="Friday";
        }else if (dayCode ==6){
            //System.out.println("Day is Saturday");
            dayName="Saturday";
            System.out.println("Yaya@@ SATURDAY");
        }else if (dayCode ==7){
            //System.out.println("Day is Sunday");
            dayName="Sunday";
            System.out.println("WATCH FOOTBAL@@@!!!");
        }else{
            dayName="UNKNOWN";
        }

        System.out.println("Day is "+ dayName);

    }

}
