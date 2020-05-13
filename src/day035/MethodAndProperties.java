package day035;

public class MethodAndProperties {
    public static void main(String[] args) {
        /*Method practice with void and return type
return keyword :
	used to return a value from a method with return type
	also terminate the method execution (any method)
Using the methods already created in different classes
	in order to use a class outside of your current packAge
	import the package name first
		import packageName.className;
	a special case for above statement is :
		*****you don't have to import classes from java.lang package
		for example String , System , Math
			All the Wrapper classes we are about to learn
	****in order to use a static method of other classes
		ClassName.methodName(.....)
	in order to use a static method in current class
		methodName(....) ;
		OPTIONALLY
		ClassName.methodName(.....)

        * Using the method which are performed in other classes
        * ClassName.methodName(.....)
        * ti use a static method from the other class
        * ClassName.methodName(.....)
        * using static method in current class
        * methodName(....)
        * OPTIONALLY
        * ClassName.methodName(...)
        *
        * METHOD OVERLOADING
        * Methods with same name  and different parameter list in same Class!!!
        * Different parameters can be:
        * different parameters count
        * different parameters type or
        * both
        * METHOD SIGNATURE=METHOD NAME +PARAMETERS LIST
        * Method overloading only care about Method Signature
        * It does not care about access modifier,"public",static or not , return type,"void",
        *public static void main{
        * fly(100);
	        fly(100L); -->> This method call expecting a fly method
					that accept long paramter  }
        * class Plane(){
        * public static void fly(){
        * }
        * public static void fly(int mile){
        * }
        * //can not have 2 methods with same signature!!!!!
        * public static void fly(int milex){
        * }
        * // following code DOES NOT COMPILE
		public static long fly(int mileX){
			// some code here
		}
        *
        * }*/
    }
}
