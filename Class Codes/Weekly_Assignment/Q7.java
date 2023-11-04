//7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
//Inner class).

package Weekly_Assignment;

class Out 
{
    private int outerField = 200;
    class MemberInner 
    {
        void Display() 
        {
            System.out.println("Member Inner Class: outerField = " + outerField);
        }
    }
    void localInnerClassDemo() 
    {
        int localVariable = 400;

        class LocalInner 
        {
            void Display() 
            {
                System.out.println("Local Inner Class: localVar = " + localVariable);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.Display();
    }

    void anonymousInnerClassDemo() 
    {
        Runnable runnable = new Runnable() 
        {
            @Override
            public void run() 
            {
                System.out.println("Anonymous Inner Class: Running a thread");
            }
        };
        runnable.run();
    }
}

public class Q7 
{
    public static void main(String[] args) 
    {
        Out out = new Out();
        Out.MemberInner memberInner = out.new MemberInner();
        memberInner.Display();
        out.localInnerClassDemo();
        out.anonymousInnerClassDemo();
    }
}

