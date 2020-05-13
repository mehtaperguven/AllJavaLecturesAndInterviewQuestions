package day042;

public class Movie {
    private String name;
    private double length;
    private  String type;
    //default constructor
    // a default constructor is given by compiler
    //when if we do not have any constructor in our class
    // default constructor has no parameter
    //has no return type
    //has no code inside
    //it is invisible  but I have it
   public Movie(){//default constructor

        System.out.println("Empty movie");

    }
    //write a constructor to set all the fields (instance field) value
    public Movie(String name,double length, String type){
        this.name=name;
        this.type=type;
        this.length=length;
    }
    //WE DO NOT HAVE SETTERS
    //WE PREPARE MOVIE OBJECT IS IMMUTABLE
    //WHICH MEANS WE CAN NOT CHANGE VALUES !!!
    //WE CAN ONLY READ THEM
    //THAT IS MAKING OBJECT IMMUTABLE
    public String getName(){
        return name;
    }public double getLength(){
        return length;
    }public String getType(){
        return type;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
