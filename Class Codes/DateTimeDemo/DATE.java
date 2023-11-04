/*
package DateTimeDemo;
import java.util.Date;
public class DATE 
{
    public static void main(String[] args) 
    {
        Date d= new Date();
        System.out.println(d);
    }
}
*/

/*
package DateTimeDemo;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATE 
{
    public static void main(String[] args) 
    {
        Date d= new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  dd MMM yyyy hh:mm:ss");//dd-MMM-yyyy,dd MMM yyyy,hh:min:ss
        String strDate=sdf.format(d);
        System.out.println(strDate);
    }
}

*/

///*
package DateTimeDemo;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATE 
{
    public static void main(String[] args) 
    {
        String sDate="2023-10-23";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        try
        {
        Date dt=sdf.parse(sDate);
            System.out.println(dt);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        String sDate1="2023-10-23 8:45:33";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try
        {
        Date dt1=sdf1.parse(sDate1);
            System.out.println(dt1);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

//*/

