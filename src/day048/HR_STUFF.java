package day048;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {

    public static void main(String[] args) {

        //Employee is abstract super type
        //HourlyEmployee and FulltimeEmployee is specific type (sub classes)


        //if we have Employee data type for e1 variable
        //we can write down address of anything is an employee

        //data type::::EMPLOYEE
        Employee e1=new HourlyEmployee("Dilaracan",1111,25,90);

        e1.calculateAnnualSalary();
        System.out.println(e1);
        Employee e2=new FullTimeEmployee("Ervacan",11111,13000);
        e2.calculateAnnualSalary();
        System.out.println(e2);
        Employee e3=new HourlyEmployee("Durucan",111111,20,99);
        e3.calculateAnnualSalary();
        System.out.println(e3);
        System.out.println();

        //easiest way to store above three objects together List<>

        List<Employee> allEmployee= Arrays.asList(e1,e2,e3);
        for (Employee each:allEmployee){
            System.out.println(each.name);
            each.calculateAnnualSalary();
            //System.out.println(each.calculateAnnualSalary());
        }


    }
}
