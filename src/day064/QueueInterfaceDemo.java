package day064;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {
//Queue can duplicate
        //first in first out (FIFO)

        Queue<String> taskQueue=new LinkedList<>();

        taskQueue.add("review the class");
        taskQueue.add("doYour homework");
        taskQueue.add("attend the class");
        taskQueue.add("Say good bye to Java");
        taskQueue.add("Say good bye to Java");

        System.out.println("taskQueue = " + taskQueue);

        System.out.println(taskQueue.remove());
        System.out.println(taskQueue.remove());
        //we removed first two elements from the taskQueue
        System.out.println(taskQueue);





    }
}
