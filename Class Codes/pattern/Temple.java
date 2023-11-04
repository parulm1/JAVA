package pattern;

public class Temple 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 20; i++) 
            {
                for (int j = 1; j <= 18; j++) 
                {
                    if((j>10 && j<12) && i==1 || (j>10 && j<13) && i==2 || (j>10 && j<12) && i==3 
                            || (j>13 && j<15) && i==3 || (j>10 && j<13) && i==4 || (j>10 && j<12) && i==5  
                            || (j>10 && j<12) && i==6 || (j>8 && j<10) && i==7 || (j>11 && j<13) && i==7
                            || (j>6  && j<8)  && i==8 || (j>13 && j<15) && i==8 || (j>4 && j<12) && i==9
                            || (j>4  && j<6)  && (i>9 && i<16) || (j>4 && j<12) && i==15 
                            || (i>11 && i<15) && (j>7 && j<9) || (j>8 && j<11) && i==12 || (j>10 && j<12) && i==13
                            || (j>10 && j<12) && i==14 || (j>15 && j<17) && (i>9 && i<12) || (j>12 && j<14) && i==12
                            || (j>13 && j<15) && i==13 || (j>13 && j<15) && i==14)
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
