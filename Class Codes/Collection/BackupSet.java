package Collection;
import java.util.*;
public class BackupSet 
{
    public static void main(String[] args) 
    {
        Set<Integer> originalSet=new HashSet<>();
        
        originalSet.add(111);
        originalSet.add(222);
        originalSet.add(333);
        
        Set<Integer> backupSet=Collections.unmodifiableSet(new HashSet<>(originalSet));
        //Set<Integer> backupSet=new HashSet<>(originalSet);
        System.out.println("OriginalSet "+originalSet);
        System.out.println("BackupSet "+backupSet);
        
        try
        {
            backupSet.add(500);
        }
        catch(Exception e){}
        System.out.println("OriginalSet "+originalSet);
        System.out.println("BackupSet "+backupSet);
    }
}
