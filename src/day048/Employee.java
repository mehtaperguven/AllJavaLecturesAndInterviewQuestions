package day048;
/*Warm up
----------
abstract super class called Employee
instance fields : name , id
Constructor : to set all the fields
abstract methods :
		calculateAnnualSalary
		toString*/

public abstract class Employee {
String name;
int id;


public Employee(String name, int id){//constructor
    this.name=name;
    this.id=id;

}
public abstract void calculateAnnualSalary();

public abstract String toString();
}
