package day048;
/*task: an interface called Bounceable
		it has one constant called
			gravity as double 	and assign 9.81
		it has 1 abstract methods :
			abstract void method bounce();  */
public interface Bounceable {

    //ALL INTERFACE FIELDS ARE PUBLIC STATIC FINAL
    //IF WE WRITE ONLY .......double GRAVITY=9.81;
    //compiler will not give an error

    public static final double GRAVITY=9.81;


    //IF NO ACCESS MODIFIER IS GIVEN
    //EVERY MEMBER OF INTERFACE AUTOMATICALLY IS PUBLIC

    //void bounce(); can be written in this way as well
    //it is directly ,automatically is public abstract
    //since without body it is obvious


    public abstract void bounce();


}
