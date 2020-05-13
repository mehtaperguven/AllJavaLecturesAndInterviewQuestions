package day050;

public class MarkerInterfaceDefinition {
    //there is an interface that has nothing inside
    //It is known as MARKER INTERFACE

    //INTERFACE IS ABSTRACT TYPE
    //THERE IS NO OBJECT
    //if Engine is interface as below

    //public interface Edible{
    // Edible e1=new Edible(); // is not possible
    //}

//where do we see DEFAULT????????
    //in three places
    /*
    * 1....switch statement
    * 2....access modifier
    * 3....interface
    *
    *
    * String season="Winter"
    * switch(season){
    * case"spring":
    * sout("do bla bla")
    * brake;
    * ...
    * default:...//if nothing match

    * ACCESS MODIFIER FOR
    * fields/ methods/constructor
    * when access modifier is not visible it is default
    * it means it is not PUBLIC|| PROTECTED||PRIVATE
    *We do not see DEFAULT key word in here
    *
    *INTERFACE
    *
    *we have default in default method declaration
    *DEFAULT METHOD CAN EXIST ONLY IN THE INTERFACE
    *
    * CONSTRUCTOR
    *
    * DEFAULT CONSTRUCTOR
    * When a class does not have any constructor
    * default constructor is given by compiler
    *
    *DEFAULT VALUES
    *
    * array items get default values
    * int[] nums=new int[5];......>>>>>[0,0,0,0,0]
    * double []nums=new double[3];....>>>>[0.0,0.0,0.0]
    * boolean [] bl=new boolean[];
    *
    *   FIELDS
    * Instance or static fields also get default values
    *for whole numbers ...0
    * for fractional numbers .....0.0
    * for boolean ....false
    * for char....empty char
    * for any non-primitive types we get null
    *  * }
    *
    *
    *
    * */


}
