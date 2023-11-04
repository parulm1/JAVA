package IO_STREAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineByLine 
{
    void ReadLines() throws IOException
    {
        char ch;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentence to read its charecters");
        
        do
        {
            ch= (char)br.read();
            System.out.println(ch);
        }
        while(ch!='q');
    }
    public static void main(String[] args) throws IOException 
    {
        ReadLineByLine rcbc = new ReadLineByLine();
        rcbc.ReadLines();
    }
}