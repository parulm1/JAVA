package Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Student_Collection 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Student> v=new PriorityQueue<>(new SortingByName_StudentClass());
        //Vector<Student> v= new Vector<>();
        
        Student s1=new Student(13,"Ramesh",23);
        Student s2=new Student(24,"Bhawesh",24);
        Student s3=new Student(23,"Suresh",43);
        Student s4=new Student(41,"Yogesh",25);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        //Collections.sort(v); //for natura1 sorting on the basis of id
        
//      SortingByName_StudentClass sbn=new SortingByName_StudentClass();
//      Collections.sort(v,sbn);

//        SortingByAge_StudentClass sba=new SortingByAge_StudentClass();
//        Collections.sort(v,sba);
          
        Iterator<Student> it = v.iterator();
        while (it.hasNext()) 
        {
            Student s=it.next();
            System.out.println("ID : "+s.getId()+", Name : "+s.getName()+", Age : "+s.getAge());
        }
//        System.out.println(v.get(1).getId());
//        System.out.println(v.get(1).getName());
//        System.out.println(v.get(1).getAge());
    }
}
