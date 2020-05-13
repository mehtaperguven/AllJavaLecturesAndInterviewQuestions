package day048;

public class HourlyEmployee extends Employee{
    /*HourlyEmployee
instance fields :
	hourlyWage , numsOfHours ,
Constructor : to set all the fields
instance methods ;
	calculateAnnualSalary
	toString*/

    int numsOfHoursPerWeek;
    int hourlyWage;
    double annualSalary;

    public HourlyEmployee(String name, int id, int numsOfHoursPerWeek, int hourlyWage) {
        super(name, id);
        this.numsOfHoursPerWeek = numsOfHoursPerWeek;
        this.hourlyWage = hourlyWage;
        //this.annualSalary = annualSalary;
    }

    @Override
    public void calculateAnnualSalary() {
        annualSalary=numsOfHoursPerWeek*hourlyWage*4*12;
        System.out.println(annualSalary);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "numsOfHoursPerWeek=" + numsOfHoursPerWeek +
                ", hourlyWage=" + hourlyWage +
                ", name='" + name + '\'' +
                ", id=" + id +", annualSalary=" + annualSalary +
                '}';
    }
}
