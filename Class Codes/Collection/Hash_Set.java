package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set 
{
    public static void main(String[] args) 
    {
        //Set<Integer> st=new HashSet<>();//doesnot maintain sequence
        //Set<Integer> st=new LinkedHashSet<>();//maintain sequence
        Set<Integer> st=new TreeSet<>();//maintain order
        st.add(10);
        st.add(30);
        st.add(60);
        st.add(40);
        st.add(70);
        
        //System.out.println(st);
        
        for(Integer i:st)
        {
            System.out.println(i);
        }
    }
}
