//9.Write a java program to display your initials on the screen in block letters as shown. For
//example the name Tapan Kumar.
//TTTTTTTT K   K
//   T     K  K
//   T     K K
//   T     K
//   T     K K
//   T     K  K
//   T     K   K

package Weekly_Assignment;

public class Q9 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 7; i++) 
        {
            for (int j = 1; j <= 20; j++) 
            {
                if (j==1 || (i == 1 && j < 4) || (i==4 && j<4) || ((i>1 && i<4) && j==6) ) 
                {
                    System.out.print("P ");
                } 
                else if((i==1 && j ==9) || (i==2 && j==10) || (i==3 && j==10) || (i==4 && j==9) || (j==11 && i>4))
                {
                    System.out.print("M ");
                }
                else if((i==2 && j==12) || (i==3 && j==14) || (i==2 && j==15) || (i==1 && j==18))
                {
                    System.out.print("M ");
                }
                else if((i==2 && j==17) || (i>4 && j==20) || (i==3 && j== 18) || (i==4 && j==18))
                {
                    System.out.print("M ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
    }
}