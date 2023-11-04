//1.Create an Array of Employee class and initialize array elements with different
//employee objects.

package LabTask_7;

public class Q1 
{
    private int empID;
    private String empName;
    private Double empSalary;

    public Q1(int empID,String empName,Double empSalary) 
    {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    public int getEmpID() 
    {
        return empID;
    }
    public String getEmpName() 
    {
        return empName;
    }
    public Double getEmpSalary()
    {
        return empSalary;
    }
    public static void main(String[] args) 
    {
        Q1 emp1=new Q1(1,"Purti",500.0);
        Q1 emp2=new Q1(2, "Parul", 600.0);
        
        Q1 [] Array={emp1,emp2};
        
        for(Q1 emp:Array)
        {
            System.out.println("Employee ID : "+emp.getEmpID()+
                            ", Name : "+emp.getEmpName()+
                            ", Salary : "+emp.getEmpSalary());
        }
    }
}
