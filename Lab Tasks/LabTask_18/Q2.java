package LabTask_18;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Parul");
        queue.offer("Priya");
        queue.offer("Purti");

        System.out.println("Queue: " + queue);

        String element1 = queue.poll();
        System.out.println("Removed element: " + element1);
        System.out.println("Updated Queue: " + queue);

        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        int size = queue.size();
        System.out.println("Queue size: " + size);
    }
    
}
