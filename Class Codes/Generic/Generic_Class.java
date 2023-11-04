package Generic;

class Container
{
    String contains;

    public void setContains(String contains) 
    {
        this.contains = contains;
    } 

    public String getContains() 
    {
        return contains;
    }
    
    public void showType()
    {
        System.out.println(contains.getClass());
    }
}
public class Generic_Class 
{
    public static void main(String[] args) 
    {
        Container c= new Container();
        String s=c.contains;
    }
}

//package Generic;
//
//class Container
//{
//    Object contains;
//
//    public void setContains(Object contains) 
//    {
//        this.contains = contains;
//    } 
//}
//public class Generic_Class 
//{
//    public static void main(String[] args) 
//    {
//        
//    }
//}

//Generic
//package Generic;
//
//class Container<T>
//{
//    Object contains;
//
//    public Container(T contains) 
//    {
//        this.contains = contains;
//    } 
//
//    public T getContains() 
//    {
//        return contains;
//    }
//    
//    public void showType()
//    {
//        System.out.println(contains.getClass());
//    }
//}
//public class Generic_Class 
//{
//    public static void main(String[] args) 
//    {
//        Container c= new Container();
//        //String s=(String)c.getContains();
//        String s=c.getContains();
//    }
//}


//GenericCls.java
//package generic;
//
//import java.util.List;
//
//class Container<T,V>{
//    T contain;
//
//    public Container(T contain) {
//        this.contain = contain;
//    }
//
//    public T getContain() {
//        return contain;
//    }
//    public List showData(List<? super V> data){
//        return data;
//    }
//    public void showType(){
//        System.out.println(contain.getClass().getName());
//    }
//}
//public class GenericCls {
//    public static void main(String[] args) {
//        Container<String,Integer> c=new Container<>("Cdac");
//        String s=c.getContain();
//        System.out.println(s);
//        System.out.println(c.showData(List.of(102,23,34,45)));
//       List<Number> lst=List.of(102.23,23.33,34.44,45.55);
//        System.out.println(c.showData(lst));
////       System.out.println(c.showData(new Object(12.23)));
//        c.showType();
//    }
//}