package day017;

public class WhileLoopPractice {
    public static void main(String[] args) {


    //count 1 to 5 then count 5 to 1

    int count=1;
    while (count<=5){
        System.out.print(count+" ");
        ++count;
    }
        //iteration 1: count is 1..1<=5..TRUE..COUNT printed as 1 and it is increased to 2
        //iteration 2: count is 2..2<=5..TRUE..COUNT printed as 2 and it is increased to 3
        //iteration 3: count is 3..3<=5..TRUE..COUNT printed as 3 and it is increased to 4
        //iteration 4: count is 4..4<=5..TRUE..COUNT printed as 4 and it is increased to 5
        //iteration 5: count is 5..5<=5..TRUE..COUNT printed as 5 and it is increased to 6
        //iteration 6: count is 6..6<=5..FALSE.. LOOP FINISHED!!
        System.out.println();
        System.out.println("count "+ count);

        //let us count from 5 to 1
        //now count value is 6!!!
        while(count >1){
            --count;
            System.out.print(count + " ");

        }
        System.out.println();
        System.out.println("count "+ count);
}
}