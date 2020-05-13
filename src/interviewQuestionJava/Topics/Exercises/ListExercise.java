package interviewQuestionJava.Topics.Exercises;

import java.util.*;

public class ListExercise {
    //Under List INTERFACE
    //ArrayList>>works with index, faster to read,
    // slower when we do manipulation(add elements..)
    //LinkedList>>works with node, each element points to previous and next element
    //Vector

    //
    public static void main(String[] args) {
        List<String> lst=new LinkedList<>();//initialization order
        LinkedList<String> linkSet=new LinkedList<>();//first in first out, initialization order
        TreeSet<String> treeSet=new TreeSet<>();//in natural order, ascending

        HashSet<String> hashSet=new HashSet<>();//un ordered
        hashSet.add("value1");
        hashSet.add("value2");
        hashSet.add("value3");
        System.out.println(hashSet);

        lst.addAll(hashSet);
        System.out.println("lst>> "+lst);

        for (String each:hashSet){
            treeSet.add(each);
        }
        System.out.println("treeSet " +treeSet);

        for (String each:hashSet){
            linkSet.add(each);
        }

        System.out.println("linkSet "+linkSet);


    Iterator<String> iter= hashSet.iterator();
    while(iter.hasNext()){
        System.out.println("%%%%%%% "+iter.next());
    }

//queue

        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
    priorityQueue.add("John");
    priorityQueue.add("Elsa");
    priorityQueue.add("Tom");
    priorityQueue.add("Dilos");

        System.out.println("Queue:  "+priorityQueue);
        System.out.println(priorityQueue.peek());//gives the first element in queue
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        //finds the first prints it and delete it from the list in the next call
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());





    }
}
