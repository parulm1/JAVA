//2.Write a code in java which demonstrates proper exception handling when working
//with BufferedReader

package LabTask_15;

import java.io.*;

public class Q2
{
    public static void main(String[] args) 
    {
        String fileName = "C:\\Users\\user\\OneDrive\\Desktop\\abc.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
        } catch (IOException e) 
        {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
