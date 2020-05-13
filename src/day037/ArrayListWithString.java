package day037;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithString {
    public static void main(String[] args) {
        List<String> superHeros=new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Flash");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");

        System.out.println(superHeros);
        System.out.println(superHeros.contains("Superman"));
        System.out.println(superHeros.contains("man"));

        for (int i=0;i<superHeros.size();i++){
            String currentHero=superHeros.get(i);
            if (currentHero.contains("man")){
                superHeros.remove(currentHero);//IMPORTANT!!!!!!!!!
                --i;//when we remove item we need to shift to the back to same index
            }
        }
        System.out.println("Real Heros = "+superHeros);

        
        List<String>superHerosCopy=new ArrayList<>(superHeros);
        System.out.println("superHerosCopy = " + superHerosCopy);
   
         //following Arrays.asList will give only visually elaments we can not modify them
        List<String>topics= Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);

        //we convert it to active array below
        List<String>topicsCopy=new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);
    }
}
