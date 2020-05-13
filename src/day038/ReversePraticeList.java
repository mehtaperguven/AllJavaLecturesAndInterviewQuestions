package day038;

import java.util.Arrays;
import java.util.List;

public class ReversePraticeList {
    public static void main(String[] args) {
/*Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
* print pass if its more than 60 fail if not
* count how many score are more than 90
* get the average score
*
* */
//short way of performing a list that non-resizable List Object not ArraysList
        List<String> numList= Arrays.asList("79" , "54" , "100", "65", "44","78","68","98","89","77");
        System.out.println("numList = " + numList);
        int count=0;
        int sum=0;
        for (String each:numList){
            int eachNum=Integer.parseInt(each);
            if (eachNum>60){
                System.out.println("Pass = "+eachNum);
            }else{
                System.out.println("Fail = "+eachNum);
            }
            if (eachNum>90){//finding count of numbers that >90
                count++;
            }
        }
        System.out.println("count is : "+count);
/////FINDING AVERAGE
        for (String each :numList){
            int eachNumber=Integer.parseInt(each);
            sum=sum+eachNumber;
        }
        System.out.println(" Average = "+sum/(numList.size()));

///////update the values with score-grade pair
//  for example
//79C , 54F, 100A, 65D, 44F , 89B , 95A
for (int i=0;i<numList.size();i++)  {
    int number=Integer.parseInt(numList.get(i));

    if (number>=90 && number<=100){
        numList.set(i,numList.get(i)+"A");
    }
}
        System.out.println(numList.get(2));


    }
}
