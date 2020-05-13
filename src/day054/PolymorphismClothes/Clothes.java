package day054.PolymorphismClothes;

import day051.Person;

public class Clothes implements Wearable {
    int size;

    @Override
    public void wear() {
        System.out.println("you put on from Clothes super type");
    }


    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                '}';
    }

    public static void main(String[] args) {
Clothes c1=new Clothes();
Wearable w1=new Clothes();
Object o1=new Clothes();

Makeup m1=new Makeup();
Wearable w2=new Makeup();
Cosmetics cc1=new Makeup();
Object o2=new Makeup();

Watch wc1=new Watch();
Wearable w3=new Watch();
Object o3=new Watch();

//Since Perfume implements Wearable, and Cosmetics
// Those interfaces can be used to point Perfume object
Perfume p1=new Perfume();//Perfume class becomes type
Wearable w4=new Perfume();
Cosmetics c2=new Perfume();
Object o4=new Perfume();
//Perfume p2=new Cosmetics();//it is not possible Cosmetics is interface

    }
}


class Watch implements Wearable{
    @Override
    public void wear() {
        System.out.println("put on watch");
    }
}


class Makeup  implements Wearable,Cosmetics {
    @Override
    public void wear() {
        System.out.println("You are more beautiful without makeup");
    }
}



class Perfume implements Wearable,Cosmetics{
    @Override
    public void wear() {
        System.out.println("This perfume's smell is so nice and soft");
    }
}
