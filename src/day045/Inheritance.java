package day045;

public class Inheritance {
    /*
    * to build relationship between other classes
    * As a Sub Class(Child)(Derived) We can inherit everything from Super Class(Parent)(Base Class)
    * A class can extends only to one Parent Class
    * One super class can have multiple sub classes
    *
    *MULTIPLE INHERITANCE IS NOT SUPPORTED IN JAVA
    * Which means one Sub Class have Two Parent Classes!!!
    *
    * ALL THE VISIBLE FIELDS ARE INHERITED
    * ALL THE VISIBLE METHODS ARE INHERITED
    *
    * CONSTRUCTOR IS NOT INHERITED
    *
    *""""""""""""""""""""" ACCESS MODIFIERS""""""""""""""""
    * private<default<protected<public
    * Every thing that default can do protected do as well
    *
    * PRIVATE ONLY IN THE SAME CLASS accessible
    * WHAT IS THE DIFFERENCE BETWEEN DEFAULT AND PROTECTED
    *
    * DEFAULT is only with in the same package
    * IN ALL CLASSES IN THE SAME PACKAGE
    *
    * PROTECTED is accessible from the same package +other packages
    *
    ******************************
    * METHOD OVERRIDING
    ******************************
    * SAME METHOD NAME ,SAME PARAMETER
    * MUST BE OVERRIDDEN IN SUB CLASS!!!!!!!
    *OVERRIDING CAN NOT BE IN THE SAME CLASS!!!!!!!!!
    * IN sub class access modifier should be more visible than parent
    * in order overridden access modifier (in child class) must be same or more visible
    * private<default<protected<public
    * return type,method name,parameters must be same!!!!!
    *only instance method can override (static and private can not override)
    * @Override Must be applicable
    *WE NEED OVERRIDING TO PROVIDE DIFFERENT FUNCTIONALITY TO THE METHOD
    ***********************************
    *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    *METHOD OVERLOADING
    * *********************************
    *
    * METHOD OVERLOADING CAN BE IN SAME CLASS!!!!!!!!
    * RETURN TYPE CAN BE DIFFERENT
    * PARAMETER MUST BE DIFFERENT
    *
    * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    * METHOD OVERRIDING
    * **********************************************
    * METHOD OVERRIDING IN SUB CLASS MUST BE
    * RETURN TYPE MUST BE SAME/PARAMETER MUST BE SAME/
    * ONLY INSTANCE METHOD CAN BE OVERRIDE (CAN NOT BE STATIC OR PRIVATE)
    *ACCESS MODIFIER OF OVERRIDDEN METHOD MUST BE SAME OR MORE VISIBLE
    *
    * */
}
