package day048;
/*----------------
FullTimeEmployee
	instance fields :
		 monthlySalary
Constructor : to set all the fields
instance methods ;
	calculateAnnualSalary
	toString*/

public class FullTimeEmployee extends Employee {
//A NON -ABSTRACT SUB CLASS OF ABSTRACT SUPER CLASS
// IS CALLED CONCRETE CLASS
double monthlySalary;
double annualSalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    public void calculateAnnualSalary(){
annualSalary=monthlySalary*12;
        System.out.println(annualSalary);

}
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", annualSalary=" + annualSalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }



}
