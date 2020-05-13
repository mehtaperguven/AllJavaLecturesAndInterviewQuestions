package interviewQuestionJava.Topics;

import com.sun.source.tree.Tree;

import java.util.*;

public class List_And_Set {


    public static void doTheyHaveSameLetters(String string1, String string2){

        char [] arr1=string1.toCharArray();
        char [] arr2=string2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String result1="", result2="";

        for (int i=0;i<arr1.length;i++){

            result1+=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){

            result2+=arr2[i];
        }
        System.out.println(result1.equals(result2));
//        for (char each:arr1){
//            result1+=each;
//        }
//        for (char each:arr2){
//            result2+=each;
//        }
        //System.out.println(result1.equals(result2));
        System.out.println(result1+"......."+result2);

    }
    //Interview Question:: Do both strings have same letters or  not ???
//way1==use Array.sort();
//way2==use Set<>.
    public static void isSameLetter(String str1, String str2){
        String s1[]=str1.split("");
        String s2[]= str2.split("");
        Set<String> set1=new TreeSet<>();
        Set<String> set2=new TreeSet<>();
        for (String each:s1){
            set1.add(each);
        }
        for (int i=0;i<s2.length;i++){
            set2.add(s2[i]);
        }

        System.out.println(set1.equals(set2));
        System.out.println(set1);
        System.out.println(set2);

    }



//Interview Question::Remove Duplicate letters

    public static void removeDuplicates(String string){
//use TreeSet
        char [] arr=string.toCharArray();

        TreeSet<Character> treeSet=new TreeSet<>();
        for (char each:arr){
            treeSet.add(each);
        }
        System.out.println(treeSet);

    String s=treeSet.toString();
    String lastNonDuplicate=s.replace("[","").replace("]","").replace(",","");
        System.out.println(lastNonDuplicate.replace(" ",""));


    }
//Interview Question :: Remove "Katy"
//way1:Using List<> interface
    public static void removeName(String string){
        //List<String> names= Arrays.asList("Katy","Denis","Katy");
//ArrayList<String> names=new ArrayList<>(Arrays.asList("Katy","Denis","Katy"));
     List<String> names=new ArrayList<>(Arrays.asList("Katy","Dallas","Katy","Elen"));
        for (int i=0;i<names.size();i++){

            if (names.get(i).equals("Katy")){
                names.remove("Katy");
                i--;
            }
        }
        System.out.println(names);


    }
//Interview Question :: Remove "Katy"
//way1:Using Iterator
public  static void removeByIterator(){
        List<String> names=new ArrayList<>(Arrays.asList("Eric","Nana","Nana"));
        ListIterator<String> iterator=names.listIterator();
        if (iterator.hasNext() & (iterator.next().equals("Nana"))){
            iterator.remove();
        }
    System.out.println(names);

    List<String> names2 =new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
    ListIterator<String> iteration=names2.listIterator();
    if (iteration.hasNext() & iteration.next().equals("Ahmed")){
        iteration.remove();

    }
    System.out.println("names2  "+names2);
}
//IQ
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void removeNumbers(){
        List<Integer> numbers=new ArrayList<>(Arrays.asList(4,5,2,7,2,101,107));
        for (int i=0;i<numbers.size();i++){
            if(numbers.get(i)>100){
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        System.out.println(numbers);
//way2
        List<Integer> nums=new ArrayList<>(Arrays.asList(4,5,2,7,2,101,107));
        List<Integer> numsRemoved=new ArrayList<>();

        for (Integer each:nums){
            if (each<100){
                numsRemoved.add(each);
            }
        }
        System.out.println("numsRemoved "+numsRemoved);
    }

    public static void main(String[] args) {


        doTheyHaveSameLetters("Abc","bca");
        isSameLetter("moon","oonm");
        removeDuplicates("ADGGDSS");
        removeName("Katy");
        removeByIterator();
        removeNumbers();

    }
}


