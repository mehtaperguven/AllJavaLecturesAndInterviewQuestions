package day051;

public class DifferenceAbstractAndINterface {

    /*
    * ................ABSTRACT CLASS.................................INTERFACE
    * INSTANCE FIELD.....yes ............................................NO
    * STATIC FIELD ......yes............................................YES(only public static final=CONSTANT)
    * CONSTRUCTOR       yes..............................................no
    *ABSTRACT INSTANCE METHOD....yes.....................................yes(all methods with no body interface)
    * NON-ABSTRACT INSTANCE METHOD..yes.................................only non-abstract method in interface is default method
    * STATIC METHOD.....yes..............................................yes(static method with body)
    * DEFAULT METHOD....NO...............................................yes(only interface have default method)
    * abstract method access modifier ..Except private all...............ONLY PUBLIC
    * instance field access modifier....ALL..............................-----
    *static field access modifier ......ALL..............................Public
    * non-abstract instance method access modifier...ALL.................default method should be public(untilJava9)After java 9 we have private default method asw well
    * static method access modifier........ALL...........................Public
    *
    * when is good time to use ABSTRACT CLASS?????.....................
    *
    * Ife we have shared instance fields we want sub classes to have,
    * If we want to provide reusable constructor logic to sub class
    * if you want this class to be only super class
    *
    * When to use INTERFACE ??????
    * A class can implement more than one interface
    * if you do not have any instance fields to share with sub classes
    * if you want to share only constants
    * LOOSELY COUPLED:Interface allow the implementing classes have less or no relationship with each other at all
    * */
}
