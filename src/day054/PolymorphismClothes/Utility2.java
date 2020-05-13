package day054.PolymorphismClothes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility2 {
    public static void main(String[] args) {
        Wearable w1=new Clothes();
        Wearable w2=new Watch();
        Wearable w3=new Makeup();
        Wearable w4=new Perfume();

        //List<Wearable>list=new ArrayList<>(Arrays.asList(w1,w2,w3,w4));

        List<Wearable> myList= Arrays.asList(w1,w2,w3,w4);

        for (Wearable each:myList){
        each.wear();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");


        for(int i=0;i<myList.size();i++){
            myList.get(i).wear();

        }

    }
}
