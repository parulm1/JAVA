//5.Write a code in java to write data to a file using traditional IO(java.io.package).

package LabTask_15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Q5 {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("\"C:\\Users\\HP\\Desktop\\DBMS.txt");
            
            String content="Soft Polynomials Pvt Ltd,Nagpur";
            for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

