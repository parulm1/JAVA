//7.Create a program that displays a directory for file changes (additions, modifications,
//deletions) using NIO.

package LabTask_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Q7 
{
    public static void main(String[] args) 
    {
        try
        {
            Path p = Paths.get("D:\\DailyInterview\\Parul");
            Path p1 = Files.createDirectory(p);
            Path path=Paths.get("D:\\DailyInterview\\Parul\\example.txt");
            String content="Soft Polynomials Pvt Ltd,Nagpur";
            for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Directory Created And Operations performed......");
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}