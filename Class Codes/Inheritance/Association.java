package Inheritance;

class Person{
    private String name;
    private Address address;
    
    public Person(String name, Address address){
        this.name=name;
        this.address=address;
    }
    void personDetails(){
        System.out.println("Person Name : "+name);
        System.out.println("Person Address : "+address);
    }
}
class Address{
    private int houseNo;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
    
    public Address(int houseNo,String landmark,String city,String state,String pincode){
        this.houseNo=houseNo;
        this.landmark=landmark;
        this.city=city;
        this.state=state;
        this.pincode=pincode;   
    }
    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + '}';
    }
}
public class Association{
    public static void main(String[] args){
        
        Address ad= new Address(101,"Hi-tech City","Nagpur","Maharashtra","440030");
        Address ad1= new Address(101,"Low-tech City","Chandrapur","Maharashtra","440030");
        Person  p = new Person("Parul",ad1);
        p.personDetails();
    }
}
