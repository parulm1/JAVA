package Collection;

import java.util.*;

public class Haset2 
{
    public static void main(String[] args) 
    {
        List<Integer> lst= Arrays.asList(10,10,20,20,30,30,40,50,60);
        Set<Integer> st = new HashSet<>();
        st.addAll(lst);
        System.out.println("List : " + lst);
        System.out.println("Set : " + st);
        
        lst=new ArrayList<>();
        lst.addAll(st);
        System.out.println(lst);
    }
}
