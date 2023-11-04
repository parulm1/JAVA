//Q2.Write a java program to Create a menu-driven interface for managing
//student grades. Users can perform the following tasks:
//1. Add students
//2. Update grades
//3. Remove students
//4. View individual grades
//5. List all students and grades
//6. Calculate the average grade for all students.
//Use HashMap to store student names and grades.

package LabTask_19;

import java.util.*;

public class Q2 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Grade");
            System.out.println("3. Remove Student");
            System.out.println("4. View Individual Grade");
            System.out.println("5. List All Students and Grades");
            System.out.println("6. Calculate Average Grade");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student marks: ");
                    int marks = scanner.nextInt();
                    studentGrades.put(name, marks);
                    System.out.println(name + " has been added with a grade of " + marks);
                    break;
                    
                case 2:
                    System.out.print("Enter student name to update grade: ");
                    String studentToUpdate = scanner.nextLine();
                    if (studentGrades.containsKey(studentToUpdate)) 
                    {
                        System.out.print("Enter the new grade for " + studentToUpdate + ": ");
                        int newGrade = scanner.nextInt();
                        studentGrades.put(studentToUpdate, newGrade);
                        System.out.println(studentToUpdate + "'s grade has been updated to " + newGrade);
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter student name to remove: ");
                    String studentToRemove = scanner.nextLine();
                    if (studentGrades.containsKey(studentToRemove)) 
                    {
                        studentGrades.remove(studentToRemove);
                        System.out.println(studentToRemove + " has been removed.");
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter student name to view grade: ");
                    String studentToView = scanner.nextLine();
                    if (studentGrades.containsKey(studentToView))
                    {
                        int studentGrade = studentGrades.get(studentToView);
                        System.out.println(studentToView + "'s grade: " + studentGrade);
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 5:
                    System.out.println("List of all students and grades:");
                    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                    
                case 6:
                    double totalGrade = 0;
                    int totalStudents = studentGrades.size();
                    for (int g : studentGrades.values()) 
                    {
                        totalGrade += g;
                    }
                    double averageGrade = totalGrade / totalStudents;
                    System.out.println("Average Grade for all students: " + averageGrade);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
