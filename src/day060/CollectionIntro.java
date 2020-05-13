package day060;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


//The word Collection everywhere :
//        *
//        *
//        * Collection Framework -->> referring entire things , entire topic
//        *
//        * Collection Interface --->> one interface under the entire Collection Framework
// *
//         * Collections class  -->> (it has ""s"" at the end, just like Array and Arrays )
//        *                   -->>  is a utility class with many static methods
//        *                 for example : Collections.sort(your collection object1)




public class CollectionIntro {
    public static void main(String[] args) {
        // a class extends another class
        // an interface extends another interface
        // a class implements one or more interfaces

        //    List<String> names = new ArrayList<>();

        // List interface extends Collection interface
        // and ArrayList implements List interface
        // So we can safely say ArrayList IS-A Collection
        // List is the only data structure that have index(order) ,
        // none of the other data structure has index




        //Collection is INTERFACE
        //Collection is FRAMEWORK
        //Collections is CLASS

        // with the below assignment we can access only what the Collection interface have
        // so we can learn about any type of Collection including Set , Queue , List have in common
        Collection<String> names=new ArrayList<>();
       //Above because reference type is Collection
       // we can access only what the Collection Interface has

        names.add("Cabir");
        names.add("Mehtap");
        names.add("Emir");
        names.add("Erva");
        names.add("Feyza");
        names.addAll(names);//since names is Collection Type
        // we can pass any thing IS-A collection...which is names in here....

        System.out.println(names);
        names.removeAll(Arrays.asList("Mehtap"));//removes all Mehtap
        System.out.println("After removing Mehtaps" +names);

        for (String  eachName:names){
            System.out.println(eachName);
        }
        //>>>>>>>>>>>>>>>System.out.println(names.get(0));//will not work
        //Because Collection has not get() method!!!!
        //However List has get() method
        //Collection is higher than List but It has less methods
        //List has more methods!!!
        //The more sub the more specific in the Hierarchy
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");

names.forEach(each-> System.out.println("each " +each));//LAMBDA EXPRESSION
        //LAMBDA:::Using forEach to print everything in one shot
    }
}
