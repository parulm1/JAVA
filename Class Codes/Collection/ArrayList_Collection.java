/*
package Collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_Collection 
{
    public static void main(String[] args) 
    {
        List ls=new ArrayList();
        
        ls.add('D');
        ls.add('A');
        ls.add('B');
        ls.add('D');
        
        ls.add(3,'C');
        
        ls.remove(4);
        
        System.out.println(ls);
    }
}
*/

/*
package Collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_Collection 
{
    public static void main(String[] args) 
    {
        List ls=new ArrayList();
     
        ls.add('D');
        ls.add('A');
        ls.add('B');
        ls.add('D');
        
        List lst=new ArrayList();
        
        lst.add(1);
        lst.add(2);
        lst.add(3);
        
        ls.addAll(lst);
        System.out.println(ls);
        
        ls.addAll(1,lst);
        System.out.println(ls);
        
        System.out.println(ls.get(3)); 
        System.out.println(ls.contains('B')); 
    }
}
*cx                                                                                                                                             /

/*
package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

public class ArrayList_Collection 
{
    public static void main(String[] args) 
    {
        List ls=new ArrayList();
        
        ls.add(23);
        ls.add(12.23);
        ls.add("Soft Polynomials");
        ls.add(new Date());
        
        for(Object obj:ls)
        {
            System.out.println(obj);
        }
        System.out.println("========================================");
        
        Iterator it=ls.iterator();
        while(it.hasNext())
        System.out.println(it.next());
        
    }
}
*/

package Collection;

//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Collection 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lst=new ArrayList<>();
        
        lst.add(23);
        lst.add(34);
        lst.add(21);
        lst.add(45);
        lst.add(67);
        
        System.out.println(lst);
        System.out.println("__________________________________\n");
        //for sorting
        Collections.sort(lst);
        
        for(Integer i:lst)
        {
            System.out.println(i);
        }
        //for binarysearch
        int pos=Collections.binarySearch(lst, 22);
        System.out.println("__________________________________\n");
        
        System.out.println("position  "+pos);
        
        System.out.println("__________________________________\n");
        
        //disjoint -- no similar elements in any of the list
        boolean b=Collections.disjoint(lst,Arrays.asList(100,200,300));
        System.out.println("DisJoint == "+b);
        
        System.out.println("__________________________________\n");
        
        Collections.copy(lst,Arrays.asList(10,20,30) );
        System.out.println(lst);
        
        System.out.println("__________________________________\n");
        
        List<Integer> lst1=Arrays.asList(100,200,300);
        System.out.println(lst1);
        
        System.out.println("__________________________________\n");
        
        List<String> lst2=Arrays.asList("Ram","Shyam","Ravi","Radhe");
        System.out.println(lst2);
        
        System.out.println("__________________________________\n");
        
        Collections.sort(lst2);
        for(String s:lst2)
        {
            System.out.println(s);
        }   
    }
}