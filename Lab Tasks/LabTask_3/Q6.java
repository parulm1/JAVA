//Q6. WAP in Java Print different patterns of asterisk(*)using loops (e.g.triangle of *).

package LabTask_3;

public class Q6 
{
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
        Q6 eqt=new Q6() ;
        eqt.eqiTriangle();
    } 
}
