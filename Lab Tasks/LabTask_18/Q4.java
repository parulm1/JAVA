package LabTask_18;

import java.util.PriorityQueue;

public class Q4
{
    public static void main(String[] args)
    {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        
        priorityQueue.offer("High Priority Element");
        priorityQueue.offer("Medium Priority Element");
        priorityQueue.offer("Low Priority Element");
        System.out.println("Priority Queue Elements:");
        
        while (!priorityQueue.isEmpty()) 
        {
            System.out.println(priorityQueue.poll());
        }
        
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>((a, b) -> b - a);
        
        customPriorityQueue.offer(5);
        customPriorityQueue.offer(1);
        customPriorityQueue.offer(10);
        
        System.out.println("\nCustom Priority Queue Elements (Reverse Order):");
        
        while (!customPriorityQueue.isEmpty())
        {
            System.out.println(customPriorityQueue.poll());
        }
    }
}
