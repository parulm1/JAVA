//2. Write a program in java to create a class name studinfo accept the student
//information by the member method getdata and inherit it in the base class name marks create
//method to get marks in derived class and calculate the percentage and display the complete
//information of student do this for three students.

package Weekly_Assignment;
import java.util.Scanner;
class studInfo 
{
    protected String name;
    protected int roll_no;

    public void getdata() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        name = scanner.nextLine();
        System.out.println("Enter Roll Number : ");
        roll_no = scanner.nextInt();
    }
}
class marks extends studInfo 
{
    protected double CAO;
    protected double DBMS;
    protected double ADS;
    public void getmarks() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks in CAO : ");
        CAO = scanner.nextDouble();
        System.out.println("Enter marks in DBMS : ");
        DBMS = scanner.nextDouble();
        System.out.println("Enter marks in ADS : ");
        ADS = scanner.nextDouble();
    }
    public void calculatePercentage() 
    {
        double total = CAO + DBMS + ADS;
        double percent = (total / 300) * 100;
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Marks in Math : " + CAO);
        System.out.println("Marks in Science : " + DBMS);
        System.out.println("Marks in English : " + ADS);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percent + "%");
    }
}
public class Q2 {
    public static void main(String[] args) 
    {
        marks[] students = new marks[3];
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter information for Student " + (i + 1) + ":");
            students[i] = new marks();
            students[i].getdata();
            students[i].getmarks();
        }
        for (int i = 0; i < 3; i++) 
        {
            students[i].calculatePercentage();
        }
    }
}
