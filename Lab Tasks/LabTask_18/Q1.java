//Q1. .Write a java program to Create a collection of Employee class and sort
//objects using comparable and comparator interfaces.

//Q2.Write a java program to Implement Queue data structure using
//LinkedList and Queue collection.
//.
//Q3. Write a java program to find a name from a collection.
//Q4. Write a java program to Create a priority queue to insert elements with
//different priorities.
//Q5. Write a java program to perform insertion at first and at last position in
//Array Dequeue.

package LabTask_18;

import java.util.*;

public class Q1 implements Comparable<Q1>
{
    private int id;
    private String name;
    
    public Q1(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Q1 o) 
    {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Q1{" + "id=" + id + ", name=" + name + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    public static void main(String[] args) 
    {
        Vector<Q1> v= new Vector<>();
        
        Q1 s1=new Q1(13,"Ramesh");
        Q1 s2=new Q1(24,"Bhawesh");
        Q1 s3=new Q1(23,"Suresh");
        Q1 s4=new Q1(41,"Yogesh");
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        Collections.sort(v);
        
        Q1Comparator com=new Q1Comparator();
        Collections.sort(v,com);
        
        Iterator<Q1> it = v.iterator();
        while (it.hasNext()) 
        {
            Q1 s=it.next();
            System.out.println("ID : "+s.getId()+", Name : "+s.getName());
        }
    }
}
