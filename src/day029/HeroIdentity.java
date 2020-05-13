package day029;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {
        //Task
        //this is hero1 : "Superman-Clark J Kent"
        //hide this hero identity
        //String heroX="Superman-***********";
        String hero1="Superman-Clark J Kent";
        String star="";
        String[] hero2=hero1.split("-");
        System.out.println("Hero2 splitted is :"+Arrays.toString(hero2));
        String heroCOde=hero2[0];
        String fullName=hero2[1];
        int length=fullName.length();
        System.out.println(length);
        for (int i=1;i<=length;i++){

            star=star+"*";
        }
        System.out.println(hero1);
        //way1
        System.out.println(hero2[0]+"-"+star);
        //way2 use replace
        System.out.println(hero1.replace(fullName,star));
    }
}
