package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{
    public static void main(String[] args) 
    {
//        Queue<String> q=new PriorityQueue<>();

//        q.add("Ramesh");
//        q.add("Bhawesh");
//        q.add("Suresh");
//        q.add("Mahesh");
//        q.add("Yogesh");

//        System.out.println(q);
//        String p=q.poll();//FIFO
//        System.out.println(p);
//        System.out.println(q);
//        
        
        PriorityQueue<String> q=new PriorityQueue<>();//the list may not be ordered properly but itperformes operation orderly
        q.add("Ramesh");
        q.add("Bhawesh");
        q.add("Suresh");
        q.add("Mahesh");
        q.add("Yogesh");
        System.out.println(q);
        String p=q.poll();//FIFO
        System.out.println(p);
        System.out.println(q);
        
        String p1=q.poll();
        System.out.println(p1);
        System.out.println(q);
        
        String p2=q.poll();
        System.out.println(p2);
        System.out.println(q);
        
        String p3=q.poll();
        System.out.println(p3);
        System.out.println(q);
        
        String p4=q.poll();
        System.out.println(p4);
        System.out.println(q);
    }
}
