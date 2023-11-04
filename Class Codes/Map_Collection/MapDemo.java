package Map_Collection;
import java.util.*;
public class MapDemo 
{
    public static void main(String[] args) 
    {
        Map<Integer,String> mp =new HashMap<>();//may or maynot follow the sequence
        //Map<Integer,String> mp =new LinkedHashMap<>();//follows the sequence
        //Map<Integer,String> mp =new TreeMap<>();//follows the order 
        
        mp.put(1, "Ram");
        mp.put(2, "Shyam");
        mp.put(4, "Krishna");
        mp.put(3, "Radhe");
      
        //System.out.println(mp);
        for(Integer i:mp.keySet())
        {
            String val=mp.get(i);
            System.out.println("Key : "+i+" Value : "+val+"ji");
        }
        for(String s:mp.values())
        {
            System.out.println(s);
        } 
    }
}
