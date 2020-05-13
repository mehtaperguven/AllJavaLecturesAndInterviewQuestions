package day023;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        /* perform a long array of 5 items called salaries
         *put your salary amounts that okay for your offer
         * use for each loop and print them out
         *
         * use different foreach loop
         * to print only the salary more than 100000
         * */
        long salary[] = new long[]{80000, 90000, 120000, 110000, 100000};

        for (long preferredSalary : salary) {
            System.out.println("preferredSalary = " + preferredSalary);
        }
        for (long salary2 : salary) {
            if (salary2 > 100000) {
                System.out.println("salary more than 100000 is: " + salary2);
            }

        }

//FINDING MAX SALARY
        long max = salary[0];
        for (long salaryNew : salary) {

            if (salaryNew > max) {
                max = salaryNew;
            }

        }
        System.out.println("max is :" +max);

//FINDING MIN SALARY
        long min=salary[0];
        for (long salaryMin:salary){
            if (salaryMin<min){

                min=salaryMin;
            }
        }
        System.out.println("minimum salary is = " + min);
    }
}
