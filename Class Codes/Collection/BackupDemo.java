package Collection;

import java.util.*;

public class BackupDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> originallst = new ArrayList<>();
        
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        originallst.add(400);
        
        System.out.println(originallst);
        List<Integer> backuplst = originallst.subList(0,2);
        System.out.println(backuplst);
        backuplst.add(111);
        System.out.println(originallst);
        System.out.println(backuplst);
    }
}
