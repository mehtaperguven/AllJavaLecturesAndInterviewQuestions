package day038;

import java.util.ArrayList;
import java.util.List;

public class ListNameChars {
    public static void main(String[] args) {
        List<Character> resultList=new ArrayList<>();
        resultList =namesCharsToString("feyza");
        System.out.println(resultList);
        System.out.println(namesCharsToString("muge"));
        resultList.add('m');
        resultList.add('1');
        System.out.println(resultList);

    }

    /**
     *
     * @param name
     * @return   List<Character> that contains each character
     */

    public static List<Character> namesCharsToString(String name){

        List<Character> charLst= new ArrayList<>();
        for (int i = 0; i <name.length() ; i++) {
            charLst.add(name.charAt(i));
        }
    return charLst;

    }
}
