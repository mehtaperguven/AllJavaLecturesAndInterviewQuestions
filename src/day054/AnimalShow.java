package day054;

public class AnimalShow {

    public static void main(String[] args) {

        //Dog IS-A Dog
        //Dog IS_A Animal
        //Dog IS-A Object
        //Dog IS-A IndoorPet
        Dog d1=new Dog();//It can do everything a dog can do
        // (including Animal, indoorPet)
        //Since Dog extends Animal implements IndoorPet!!!!!
        Animal a1=d1;
        a1.speak();//will work
        //a1.play();will not work!!!!!!
        //since a1 is Animal type
        // it has only method speak();

        Object o1=d1;
        o1.hashCode();//will work since comes from Object class
        o1.getClass();//will work same reason above
        o1.toString();//will work
//o1.speak(); will not work!!!!!!!!!!!!
        IndoorPet p1=d1;
        p1.play();//will work


        //d1.....points.....>>>>Dog object
        //a1...is Animal...a1=d1..points......>>>>Dog Object
        //o1.....is Object type...o1=d1;.......points Dog Object as well
        //p1.....is IndoorPet...IndoorPet p1=d1.......points Dog object as well
    }
}
