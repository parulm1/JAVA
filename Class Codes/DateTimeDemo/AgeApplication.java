/*
package DateTimeDemo;
import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;
public class AgeApplication 
{
    public static void main(String[] args) {
        System.out.println("Enter your date of birth 'date/month/year'");
        Scanner scan=new Scanner(System.in);
        String dob=scan.next();
        String arr[]=dob.split("/");
        
        int d=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        int y=Integer.parseInt(arr[2]);
        
        LocalDate birthDate=LocalDate.of(y, m, d);
        LocalDate today=LocalDate.now();
        
        Period p=Period.between(birthDate, today);
        
        System.out.println("You are : "+p.getYears()+" Years, "+p.getMonths()+" Months, "+p.getDays()+"Days");
    }
}
*/


/*
package DateTimeDemo;
import java.time.LocalDate;
public class AgeApplication 
{
    public static void main(String[] args) 
    {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.minusMonths(6));
        System.out.println(today.minusDays(120));
        
        System.out.println(today.plusMonths(2));
        
        System.out.println(today.isAfter(today));
        System.out.println(today.isAfter(LocalDate.of(2021, 12, 1)));
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
    }
}
*/