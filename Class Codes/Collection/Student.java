package Collection;
public class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private int age;
    
    public Student(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    //For Natural Sorting
    @Override
    public int compareTo(Student o) 
    {
        return this.id-o.id;
    }
//    @Override
//    public int compareTo(Student o) 
//    {
//        return this.age-o.age;
//    }
    @Override
    public String toString() 
    {
        return "Student{" +"id+" + id + "name=" + name + ", age=" + age + '}';
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }    
}
