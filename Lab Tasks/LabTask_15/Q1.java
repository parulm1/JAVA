//1.Write a Java code to create a BufferedReader and read a line of text 
//from the output screen.

package LabTask_15;

import java.io.*;

public class Q1 
{
    void readLines() throws IOException
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("For ending the reading process enter = 'stop'");
        
        System.out.println("Provide sentences to read its lines: ");
        do{
        str=br.readLine();
            System.out.println(str);
    }
        while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException {
        Q1 q = new Q1();
        q.readLines();
    }
}