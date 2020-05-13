package day023;

public class ForEachLoopFindingMax {
    public static void main(String[] args) {
       long [] salaryExpected=new long[]{80000,70000,120000,100000};
        long max = salaryExpected[0];


        for (long salary : salaryExpected) {

            if (salary > max) {
                max = salary;
            }


        }
        System.out.println("max is :" +max);
    }
}
