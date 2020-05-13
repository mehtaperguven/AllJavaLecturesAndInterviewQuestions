package day063;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        //Map is data structure and part of the Collection
        //Map does not extends to Collection Interface
        //We can imagine map as a Dictionary structure, like word-definition
        //Map storey key-value pair instead of one object
        //like name-age, name-class,groupNo-groupLeader
        //hence we need two data type it is storing as a pair
        //below String name and string State are sored as Map object
        Map<String,String> nameAndStatedPair=new HashMap<>();

        Map<Integer,String> groupNumLeaderName=new HashMap<>();

        Map<String,Double> fruitNameAndPricePair=new HashMap<>();

        Map<String,Boolean> voiterNameAndEligibilityPair=new HashMap<>();

        Map<String,Integer> gameNameAndScorePair=new HashMap<>();

        Map<Byte,Character> QuestionNoAndAnswerPair=new HashMap<>();


    }
}
