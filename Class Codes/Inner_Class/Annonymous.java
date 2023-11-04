package Inner_Class;

class ParentOfAnonymous
{
    void greeting()
    {
        System.out.println("Hello!!!!!");
    }
}
class OuterOfAnonymous{
    ParentOfAnonymous p = new ParentOfAnonymous()
    {
        @Override
        void greeting() {
            System.out.println("Good morning!!!!!");
        }  
    };   
}
public class Annonymous {
    public static void main(String[] args) 
    {
        OuterOfAnonymous o = new OuterOfAnonymous();
        o.p.greeting();
    }
}

