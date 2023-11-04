package DateTimeDemo;

import java.util.Objects;
import java.util.*;

class Student
{
    private String name;
    private int age;
    
    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) 
    {
        Student stud=(Student)obj;
        return this.name.equals(stud.name) && this.age==stud.age;
    }
    @Override
    public String toString() 
    {
        return "Name : "+name+"\nAge : "+age;
    }    
}
public class Equals_Hashcode_toString 
{
    public static void main(String[] args) 
    {
        Student st= new Student("Ramesh",22);
        Student st1= new Student("Ramesh",22);
        Student st2= new Student("Suresh",22);
        Student st3= new Student("Bhawesh",22);
        System.out.println(st);
        System.out.println(st.toString());
        System.out.println(st==st1);
        System.out.println(st.equals(st1));
        System.out.println(st.hashCode());  
        
        LinkedHashSet<Student>studs=new LinkedHashSet<>();
        studs.add(st);
        studs.add(st1);
        studs.add(st2);
        studs.add(st3);   
    }
}
