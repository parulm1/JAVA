//By using Reflection API we can access Private properties of any class
package Generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person
{
    private final String name;
    private final int age;

    public Person(String name,int age) 
    {
        this.name = name;
        this.age = age;
    }

//    public void showInfo()
//    {
//        System.out.println("Hello "+name+", ypur age is "+age);
//    }
    
    private void showInfo()
    {
        System.out.println("Hello "+name+", ypur age is "+age);
    }
}
public class ReflectionAPI_Demo 
{
    public static void main(String[] args) throws NoSuchMethodException,
                InstantiationException,IllegalArgumentException,
                InvocationTargetException, IllegalAccessException, NoSuchFieldException 
    {
        //create class reference,
        Class Person_Cls=Person.class;
        
        Constructor cons=Person_Cls.getDeclaredConstructor(String.class,int.class);
        Object object=cons.newInstance("Ramesh",24);
        
        Field fname=Person_Cls.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(object, "Suresh");
        
        Method m=Person_Cls.getDeclaredMethod("showInfo");
        
        //Accessing Public Method
        //m.invoke(object);
        
        //Accessing Private Method
        m.setAccessible(true);
        m.invoke(object);
        
        String s=(String)fname.get(object);
        System.out.println(s);
        
        Field fage=Person_Cls.getDeclaredField("age");
        fage.setAccessible(true);
        int ag=fage.getInt(object);
        System.out.println(ag);
    }
}
