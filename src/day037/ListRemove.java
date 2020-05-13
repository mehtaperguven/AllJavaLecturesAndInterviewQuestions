package day037;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) {
        List<Integer>lst=new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println(lst);
      //we use index 3 to remove below
        lst.remove(3);
        System.out.println(lst);
//we use value itself to remove  by WrapperType Integer.valueOf()
        lst.remove(Integer.valueOf(34));
        System.out.println(lst);
        //if we try to delete the item that does not exist result
        // will be same without any change
        lst.remove(Integer.valueOf(49));
        System.out.println(lst);
    }
}
