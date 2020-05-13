package day016;

public class WhileLoopPractice {

    public static void main(String[] args) {
        int x=100;
        while (x<=104){

            System.out.println("Hello World");
           ++x;
           //x++ in the post increment case there will not be difference in this while loop!!
        }

        //iteration 1: x=100.....if..100<=104..>>true.....prints ..hello world..x increased by 1 ..x=101
        //iteration 2: x=101.....if..101<=104..>>true.....prints..hello world..x increased by 1 ..x=102
        //iteration 3: x=102.....if..102<=104..>>true.....prints..hello world..x increased by 1 ..x=103
        //iteration 4: x=103.....if..103<=104..>>true.....prints..hello world..x increased by 1 ..x=104
        //iteration 5: x=105.....if..104<=104..>>true.....prints..hello world..x increased by 1 ..x=105
        //iteration 6: x=105.....if..105<=104..>>false.....does not prints..hello world
    }
}
