package IO_STREAM;

import java.io.FileInputStream;

public class Read_File 
{
    void ReadFile()
    {
        try
        {
        FileInputStream fin=new FileInputStream( "filename.txt");
        }
        catch(Exception e)
        {
            System.out.println("  ");
        }
    }
    public static void main(String[] args) 
    {
        Read_File rf=new Read_File();
        rf.ReadFile();
    }
}
