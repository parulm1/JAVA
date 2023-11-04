package GarbageCollection;

public class ObjInsideMethod
{
    String objName;
    private static void display() 
    {
        ObjInsideMethod t2=new ObjInsideMethod("t2");
    }
    public ObjInsideMethod(String objName)
    {
        this.objName=objName;
    }
    static void show()
    {
        ObjInsideMethod t1=new ObjInsideMethod("t1");
        display();
    }
    @Override
    protected void finalize()throws Exception
    {
        System.out.println(this.objName+" is free from memory........");
    }
    public static void main(String[] args) 
    {
        show();
        System.gc();
//      Runtime.getRuntime().gc();
    }
}   



