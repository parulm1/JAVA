package LabTask_18;

import java.util.ArrayDeque;

public class Q5 
{
    public static void main(String[] args)
    {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Krishna");
        System.out.println("\nElement inserted at the first position:");
        System.out.println(deque);

        deque.offerFirst("Parul");
        deque.offerFirst("Pari");

        System.out.println("\nElements inserted at the first position:");
        System.out.println(deque);
        
        deque.offerLast("Pari");
        deque.offerLast("Parul");
        deque.offerLast("Priya");
        deque.offerLast("Purti");

        System.out.println("\nElements inserted at the last position:");
        System.out.println(deque);

        
    }
}
