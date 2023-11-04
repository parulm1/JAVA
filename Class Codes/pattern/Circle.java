package pattern;

public class Circle 
{
    public static void main(String[] args) 
    { 
        for (int i = 1; i <= 11; i++) 
            {
                for (int j = 1; j <= 11; j++) 
                {
                    if(i==2&&(j>1&&j<5) || j==2&&i==3 || j==5&&i==3)
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
