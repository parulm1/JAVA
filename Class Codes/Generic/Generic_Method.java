//package Generic;
//
//public class Generic_Method
//{
//    public static void showData(String arr[])
//    {
//        for(String s:arr)
//        {
//            System.out.println(s);
//        }
//    }
//    
//    public static void showData(Integer arr[])
//    {
//        for(Integer s:arr)
//        {
//            System.out.println(s);
//        }
//    }
//    public static void main(String[] args) 
//    {
//        String names[]={"Ramesh","Suresh","Mahesh","Dinesh"};
//        Integer ages[]={23,34,43,22};
//        showData(names);
//        showData(ages);
//    }
//}


////Generic Method 
//package Generic;
//
//public class Generic_Method
//{
//    public static <E> void showData(E arr[]) //E is just a variable it can be anything
//    {
//        for(E s:arr)
//        {
//            System.out.println(s);
//        }
//    }
//    
//    public static void main(String[] args) 
//    {
//        String names[]={"Ramesh","Suresh","Mahesh","Dinesh"};
//        Integer ages[]={23,34,43,22};
//        showData(names);
//        showData(ages);
//    }
//}


////Wild Card
//
//package Generic;
//
//import java.util.*;
//
//public class Generic_Method
//{
//    public static <E> void showData(List < E> lst) //E is just a variable it can be anything
//    {
//        for(E s:lst)
//        {
//            System.out.println(s);
//        }
//    }    
//    public static void main(String[] args) 
//    {
//        List lst1=List.of("Ramesh","Suresh","Mahesh","Dinesh");
//        List lst2=List.of(23,34,43,22);
//        showData(lst1);
//        showData(lst2);
//    }
//}


package Generic;

public class Generic_Method
{
    public static <E> void showData(E arr[]) 
    {
        for(E s:arr)
        {
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) 
    {
        String names[]={"Ramesh","Suresh","Mahesh","Dinesh"};
        Integer ages[]={23,34,43,22};
        showData(names);
        showData(ages);
    }
}


////Lower Bound
//package Generic;
//
//import java.util.*;
//
//public class Generic_Method
//{
//    public static void showData(List < ? super Integer> lst) //Integer and its Parents can be accesible by "super"
//    {
//        for(Object s:lst)
//        {
//            System.out.println(s);
//        }
//    }    
//    public static void main(String[] args) 
//    {
//        String names[]={"Ramesh","Suresh","Mahesh","Dinesh"};
//        Integer ages[]={23,34,43,22};
//        //showData(names);
//        //showData(ages);
//        
//    }
//}