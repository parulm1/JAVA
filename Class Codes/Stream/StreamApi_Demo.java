package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi_Demo 
{
    public static void main(String[] args) 
    {
//        List <String> lst1 =List.of("Laveena","Atishay","Parul","Purti","Priya","Poornita");
//        
//        //Accessing by foreach loop
//        for(String s:lst1)
//        {
//            System.out.println(s);
//        }
//        
//        System.out.println("*******************");
//        
//        //calling foreach Method
//            lst1.stream().forEach(e->System.out.println(e));
//            System.out.println("*******************");
//            //Method Refrence
//            lst1.stream().forEach(System.out::println);
            
        List<Integer> lst2 =List.of(10,23,30,79,50,43);
        System.out.println("Original List : "+lst2);
        //lst2.stream().forEach(e->System.out.println(e));
        
        //For finding even no.
        
        //collect method is to collect the list elements or 
        //we can also use foreach loop to just see the elements
        
        List<Integer> evenlst=lst2.stream().filter(i->i%2==0).collect(Collectors.toList()); 
        System.out.println("EVEN List : "+evenlst);
        
        //For finding odd no.
        List<Integer> oddlst=lst2.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("ODD List : "+oddlst);
        
        //performing some operation on list elements
        lst2.stream().map(i->i+5).forEach(System.out::println);
        
        Set<Integer>st=lst2.stream().map(i->i+5).collect(Collectors.toSet());
        System.out.println("Set : "+st);
        
        //Sorting
        System.out.println("Sorted List : ");
        lst2.stream().sorted().forEach(System.out::println);
        
        //descending 
        System.out.println("Sorted List in Desceding Order : ");
        lst2.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
        
        //Printing Smallest no. 
        Integer i=lst2.stream().max((x,y)->y.compareTo(x)).get();  
        System.out.println("Smallest no. : "+i);
                
        //printing name starts with 'r'
        System.out.println("Arrays : ");
        String arr[]={"ramesh","suresh","bhavesh","diensh","mahesh"};
        Arrays.stream(arr).filter(e->e.startsWith("r")).forEach(System.out::println);  
    }
}
