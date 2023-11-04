//1.Build a class which has references to other classes. Instantiate these reference variables and
//invoke instance methods.

package Weekly_Assignment;

class Address 
{
    private String area;
    private String city;
    private String state;
    private String pincode;
    public Address(String area, String city, String state, String pincode) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    public void PrintAddress() 
    {
        System.out.println("Address : " + area + ", " + city + ", " + state + " " + pincode);
    }
}

class Employee 
{
    private int emp_id;
    private String emp_name;
    private int emp_age;
    private Address address;

    public Employee(int emp_id,String emp_name, int emp_age, Address address) 
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.address = address;
    }

    public void displayInfo() 
    {
        System.out.println("ID : " + emp_id);
        System.out.println("Name : " + emp_name);
        System.out.println("Age : " + emp_age);
        address.PrintAddress();
    }
}
public class Q1 
{
    public static void main(String[] args) 
    {
        Address address = new Address("Mahal","Nagpur","Maharashtra - ", "440032");
        Employee emp = new Employee(101,"Parul Mankar", 23, address);
        System.out.println("Employee Information:");
        emp.displayInfo();
    }
}