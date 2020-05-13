package day029;

import java.util.Arrays;

public class HomeTask {
    public static void main(String[] args) {

        String [] allHeros={"Superman-Clark Kent",
            "Batman-Bruce Wayne",
            "Wonder Woman-Princess Diana",
            "Aquaman-Arthur Orin Curry",
            "Wonder Woman-Princess Diana",
            "Cyborg-Victor Stone",
            "The Flash-Barry Allen ",
            "Green Lantern-Hal Jordan",
            "Green Arrow-Oliver Queen",
            "Atom-Ray Palmer",
            "Hawkman-Carter Hall",
            "Hawkgirl-Shiera Hall",
            "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};
        //print initials of the all hero
        

        for (String eachHero :allHeros){
            System.out.println("each Hero = " + eachHero);
            String hero1=eachHero;
            String star="";
            String[] hero2=hero1.split("-");
            String heroCOde=hero2[0];
            String fullName=hero2[1];
            int length=fullName.length();

            for (int i=1;i<=length;i++){

                star=star+"*";
            }

            System.out.println("HiddenName: "+hero1.replace(fullName,star));
        }




    }
}
