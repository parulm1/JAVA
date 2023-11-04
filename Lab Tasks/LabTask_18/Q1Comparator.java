package LabTask_18;
import java.util.Comparator;
public class Q1Comparator implements Comparator<Q1>
{
    @Override
    public int compare(Q1 o1, Q1 o2) 
    {
        return o1.getName().compareTo(o2.getName());
    }
}
