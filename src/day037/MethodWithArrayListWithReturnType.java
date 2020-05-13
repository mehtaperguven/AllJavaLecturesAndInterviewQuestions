package day037;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListWithReturnType {
    public static void main(String[] args) {
int finNumber=5;
        System.out.println(getListFromTheFinalNumber(finNumber));
        System.out.println(getListFromTheFinalNumber(9));
        System.out.println(getListFromTheFinalNumber(8));
        System.out.println(getListFromTheFinalNumber(20));

       //List<Integer> is my data type below!!!!!!!
        List<Integer> myList=getListFromTheFinalNumber(4);
        System.out.println(myList);

    //@param is finalNumber
    //@return type is List<Integer>
    }

    /**
     *
     * @param finalNumber
     * @return
     */
    public static List<Integer> getListFromTheFinalNumber(int finalNumber){

        List<Integer>nums=new ArrayList<>();
        for (int i=1; i<=finalNumber;i++){
            nums.add(i);
        }
        return nums;
        //return type is List<Integer>
    }

}
