package Inner_Class;

@FunctionalInterface
interface LengthFinder
{
int strLength(String str);    
}
public class Lambda_Function 
{
    public static void main(String[] args) 
    {
        LengthFinder lf = (str)->str.length();
        System.out.println("Length of "+lf.strLength("Annonymous"));
      
        Runnable r=()->{
            for(int i =0;i<10;i++){
                System.out.println("i= "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {       
            }}
        };
        r.run();
        
        Runnable r1 = new Runnable()
        {
            public void run(){
                for(int i =0;i<10;i++)
                {
                    System.out.println("Anonymous i = "+i);
                   
                    try 
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) 
                    {}             
                }
            }
        };
        r.run();
        r1.run();
    }   
}

