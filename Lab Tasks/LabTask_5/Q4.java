//4. Write a program to print the names of students by creating
//a Student class. If no name is passed while creating an object
//of Student class, then the name should be "Unknown",
//otherwise the name should be equal to the String value
//passed while creating object of Student class.

package LabTask_5;

public class Q4 
{
    String name;

    public Q4() 
    {
        this.name = "Unknown";
    }

    public Q4(String name) 
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
    public static void main(String[] args) 
    {
        Q4 student1 = new Q4();
        System.out.println("Student 1 Name: " + student1.getName());

        Q4 student2 = new Q4("Atishay");
        System.out.println("Student 2 Name: " + student2.getName());

        Q4 student3 = new Q4("Laveena");
        System.out.println("Student 3 Name: " + student3.getName());
    }
}

