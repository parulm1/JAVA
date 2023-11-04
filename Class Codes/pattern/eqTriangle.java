package pattern;
public class eqTriangle {
    void eqiTriangle()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++)
             {
             System.out.print("* ");
             }
             System.out.println("\n");
        }
    }
    public static void main(String[] args) 
    {
        eqTriangle eqt=new eqTriangle() ;
        eqt.eqiTriangle();
    } 
}
