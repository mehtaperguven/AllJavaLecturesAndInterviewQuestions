package day026;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String[] marvelHeros = {"Iron Man", "Captain America", "Spider Man",
                "Black Panther", "Hulk", "black Widow", "Wanda", "Iron Man","Captain Marvel",
                "Captain America", "Spider Man", "captain America"};


        System.out.println("Marvel Heros = "+ Arrays.toString(marvelHeros));
        int sizeOfArray=marvelHeros.length;
        System.out.println("Hero count = "+sizeOfArray);

        String itemToSearch="Iron Man";
        int countOfItem=0;
        for (String eachHero: marvelHeros){

            if (eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println(countOfItem);

//count the hero with the name contains "Black"
        int countBlack=0;
        for (String eachHero:marvelHeros){
            if (eachHero.toLowerCase().contains("black")){
                countBlack++;

            }

        }
        //since we can not use equalIgnoreCase in here

        //"Hello world".equalIgnoreCase("Hello").....>>false
        //"Hello world".equal("Hello")........>>false
        //"Hello world".equal("Hello worl").....>>false
        //"Hello world".toUpperCase().contains("HELLO")....>>>>true
        //"Hello world".toUpperCase().contains("Hello")....>>>>false
        //"Hello world".toLowerCase().contains("HELLO")...>>>>false
        //"Hello world".toLowerCase().contains("hello")....>>>>true

        System.out.println(countBlack);
        //FINDING LONGEST NAME
        String   longestName=marvelHeros[0];
        int longestNameLength=(marvelHeros[0]).length();
        for (String eachHero: marvelHeros){

            if (eachHero.length()>longestNameLength){
                  longestName=eachHero;
            }
        }
        System.out.println(longestName);
    }
}