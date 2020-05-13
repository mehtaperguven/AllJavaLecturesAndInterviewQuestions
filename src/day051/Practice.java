package day051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<String> lst=new ArrayList<>();
        lst.add("Abc");

        List<Integer>lst2=new ArrayList<>();
        lst2.add(90);
        lst2.add(78);
        lst2.add(34);
        lst2.add(95);
        Collections.sort(lst2);///////Collections.sort();
        System.out.println(lst2);
    }
}
