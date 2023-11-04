package pattern;

public class star 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 11; i++) 
        {
            for (int j = 1; j <= 11; j++) 
            {
                if((j>6 && j<8) && i==1 || (j>5 && j<8) && i==2 || (j>=1 && j<8) && i==3 || (j>1 && j<8) && i==4)
                {
                    System.out.print("* ");
                }
                else if((j>2 && j<8) && i==5 || (j>1 && j<8) && i==6 || (j>=1 && j<8) && i==7)
                {
                    System.out.print("* ");
                }
                else if((j>5 && j<8) && i==8 || (j>6 && j<8) && i==9)
                {
                    System.out.print("* ");
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
