package IO_STREAM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadParagraph
{
    void ReadPara()throws Exception
    {
        String str[]=new String[100];
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide Para to read");
        for(int i=0;i<str.length;i++)
        {
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
        }     
        System.out.println("Provided Para........");
        for(int i=0;i<str.length;i++)
        {
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }       
    }
    public static void main(String[] args) throws Exception
    {
        ReadParagraph rp=new ReadParagraph();
        rp.ReadPara();
    }
}
