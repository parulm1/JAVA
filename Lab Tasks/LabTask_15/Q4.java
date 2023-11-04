//4.Write a code in java to read data from a file using traditional IO(java.io.package).

package LabTask_15;

import java.io.FileInputStream;
import java.io.IOException;

public class Q4 
{   
    void readFile() throws IOException
    {
        int i;
        try(FileInputStream fin=new FileInputStream("\"C:\\Users\\HP\\Desktop\\DBMS.txt"))
        { 
        do
        {
         i=fin.read();
            System.out.print((char)i);
        }
        while(i!=-1);
        }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
    }
   
    public static void main(String[] args) throws IOException
    {
        Q4 q4 = new Q4();
        q4.readFile();
    }
}
