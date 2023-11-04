package Inheritance;

class College{

    private String name;
    private Department departs[]=new Department[5];
    
    public College(String name,Department[] departs){
        this.name=name;
        this.departs=departs;
    }
    void collegeDetails(){
        System.out.println("College Details");
        System.out.println("Name : "+name);

        for(Department d:departs)
        
            System.out.println(d); 
    }
}
class Department{
    private String name;
    private int capacity;
    public Department(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", capacity=" + capacity + '}';
    }
}
public class Agregation {
    public static void main(String[] args) {
        Department dept[]= {new Department("IT",500),new Department("Mechanical",400),new Department("Chemical",200)};
        Department dept1[]= {new Department("IT",500),new Department("Mechanical",400)};
        
        College c = new College("YCCE",dept);
        College c1 = new College("VNIT",dept1);
        c.collegeDetails();
        c1.collegeDetails();
    }
}
