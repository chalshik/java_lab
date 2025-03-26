package CollectionsTask;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQuequeTasks {
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public static void main(String[] args) {
    priorityQueue.add(1);
        System.out.println(priorityQueue);
        task4(priorityQueue,2);
        System.out.println(priorityQueue);
    }
    public static void task12(PriorityQueue priorityQueue){
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue1.addAll(priorityQueue);

    }
    public static Object[] task10(PriorityQueue priorityQueue){
        Object[] array = priorityQueue.toArray();
        return array;
    }
    public static void task9(PriorityQueue priorityQueue){
        System.out.println("First removed element of priorityqueque "+ priorityQueue.poll());
    }
    public static void task8(PriorityQueue priorityQueue ){
        System.out.println("First element of priorityqueque "+priorityQueue.peek());
    }
    public static void task7(PriorityQueue priorityQueue,PriorityQueue priorityQueue2){
        System.out.println(priorityQueue.equals(priorityQueue2));
    }
    public static void task4(PriorityQueue priorityQueue, Object o){
        priorityQueue.add(o);
    }
}
