//6.Write a java program to create a demo application to understand the role of access modifiers.

package Weekly_Assignment;

class PackagePrivateClass 
{
    int packPrivateField = 1;

    void PackPrivateMethod() 
    {
        System.out.println("This is a Package-Private method.");
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {
        PackagePrivateClass ppClass = new PackagePrivateClass();
        ppClass.PackPrivateMethod();
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println(example.publicField);
        example.publicMethod();
        System.out.println(example.protectedField);
        example.protectedMethod();
        System.out.println(example.packagePrivateField);
        example.packagePrivateMethod();
    }
}

class AccessModifiersExample 
{
    public int publicField = 11;
    protected int protectedField =12;
    int packagePrivateField = 13; 
    private int privateField = 14;

    public void publicMethod() 
    {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() 
    {
        System.out.println("This is a protected method.");
    }

    void packagePrivateMethod() 
    {
        System.out.println("This is a default (package-private) method.");
    }

    private void privateMethod() 
    {
        System.out.println("This is a private method.");
    }
}

