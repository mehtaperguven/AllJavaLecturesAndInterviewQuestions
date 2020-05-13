package day054.PolymorphismClothes;

public class Utility {
    public static void main(String[] args) {

        Wearable w1=new Clothes();
        wearMyWearable(w1);
        Wearable w2=new Watch();
        wearMyWearable(w2);
        Wearable w3=new Makeup();
        wearMyWearable(w3);
        Wearable w4=new Perfume();
        wearMyWearable(w4);
        //Here we pass the object directly
        // without storing into any variable
        wearMyWearable(new Watch());
        //wearMyWearable(new String("aaaa"));//can not call String object
        //Because method asking to give any Wearable object
        System.out.println(getMyWearableObject());
Wearable result=getMyWearableObject();
        System.out.println(result.getClass().getSimpleName());
    }
//We made method static to call it directly
// from the static main method
    public static void wearMyWearable(Wearable anyWear){
        anyWear.wear();
    }
    public static Wearable getMyWearableObject(){
       // return new Watch();
//       return new Makeup();
//        return new Perfume();
       return new Clothes();
//       Wearable w=new Clothes();
//       return w;//is possible as well
        }
    }

