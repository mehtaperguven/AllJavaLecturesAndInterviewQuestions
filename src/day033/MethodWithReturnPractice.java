package day033;

public class MethodWithReturnPractice {
    public static void main(String[] args) {
        /*covertNumberToDay
         * This method will take number from 1-7
         * and convert that to actual day in word
         * @param int dayCode to represent day in number
         * @return the day in word in English as String
         *         if the number is valid
         *         if the number is not 1-7 return INVALID DAY!
         * */
        String day = getDaysOfTheWeekFromNUmber(1);
        System.out.println(day);
     String day1=getDaysOfTheWeekFromNumber2(4);
        System.out.println(day1);
    }

    public static String getDaysOfTheWeekFromNUmber(int dayCode) {
        String dayName = "";
        switch (dayCode) {
            case 1:
                dayName = "Today is Monday";
                break;
            case 2:
                dayName = "Today is Tuesday";
                break;
            case 3:
                dayName = "Today is Wednesday";
                break;
            case 4:
                dayName = "Today is Thursday";
                break;
            case 5:
                dayName = "Today is Friday";
                break;
            case 6:
                dayName = "Today is Saturday";
                break;
            case 7:
                dayName = "Today is Sunday";
                break;
            default:
                dayName = "FUN DAY";
        }
        return dayName;
    }

    public static String getDaysOfTheWeekFromNumber2(int daycode){
        String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
       String day="";
      if(daycode>0 && daycode<=7 ){
        day=daysArray[daycode-1];
           }else
               {
       day="FUNDAY";
             }
     return day;
   }
}