package IO_STREAM;

import java.io.*;//on behalf of below 3 lines

//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;

class Student implements Serializable
{ 
        String name;
        int age;
        transient String password;
    public Student(String name,int age,String password)
    {
        this.name = name;
        this.age = age;
        this.password=password;
    }
}
public class Serialization 
{
    public static void main(String[] args) 
    {
        try(FileOutputStream fout=new FileOutputStream("stud.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout))
        {
            Student stud=new Student("Parul",23,"pass");
            oos.writeObject(stud);
            System.out.println("Object is Serialized");
        }
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }            
}
