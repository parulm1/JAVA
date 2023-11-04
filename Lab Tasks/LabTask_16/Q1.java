//Q.1.Formatting Dates to Strings:
//a. Create a SimpleDateFormat object to format the current date in the "dd-MM-yyyy"
//pattern. Print the formatted date.
//b. Format the current time in the "HH:mm:ss" pattern and display it.
//c. Create a SimpleDateFormat object to format a given date of your choice in the "MMM dd,
//yyyy" pattern.

package LabTask_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1 
{
    public static void main(String[] args) 
    {
        //Q1 a
        Date d= new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String str=sdf.format(d);
        System.out.println("Q1 a Solution : "+str);
        
        //Q1 b
        Date d1= new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
        String str1=sdf1.format(d1);
        System.out.println("Q1 b Solution : "+str1);
        
        //Q1 c
        Date d2= new Date();
        SimpleDateFormat sdf2=new SimpleDateFormat("MMM dd yyyy");
        String str2=sdf2.format(d2);
        System.out.println("Q1 c Solution : "+str2);
    }
}
