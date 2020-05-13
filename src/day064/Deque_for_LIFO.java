package day064;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque_for_LIFO {
    public static void main(String[] args) {


        //we can use any Deque interface implementation for instance >>>LInkedList<>();
       // How do we implement a LifoQueue if not using old class called Stack
                // we can use any of Deque interface implementation
                // Deque is a double ended Queue so we can add item as always
                // and when we remove we can use removeLast last method to achieve Last in first out


        Deque<String> lifoQue=new LinkedList<>();

        lifoQue.add("review the class");
        lifoQue.add("doYour homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say good bye to Java");
        lifoQue.add("Say good bye to Java");
        System.out.println("lifoQue.removeFirst() = " + lifoQue.removeFirst());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = "+lifoQue.removeLast());

        System.out.println(lifoQue);

    }
}
