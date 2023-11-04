package pattern;

public class Lavishay 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 7; i++) 
        {
            //Display L
            for (int j = 1; j <= 7; j++) 
            {
                if((i>=1&&i<=6)&&j==1||i==7&&(j>=1&&j<=5)) 
                {
                    System.out.print("L ");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display A
            for (int j = 1; j <= 12; j++) 
            {
                if (i==1&&j==9||i==2&&j==8||i==2&&j==10||i==3&&j==6||i==3&&j==11||i==4&&(j>=5&&j<=9)
                        ||i==5&&j==5||i==5&&j==12||i==6&&j==12||i==6&&j==5||i==7&&j==1||i==7&&j==8) 
                {
                    System.out.print("A ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display V
            for(int j=1;j<=13;j++)
            {
                if (i==1&&j==2||i==2&&j==2||i==3&&j==3||i==4&&j==1||i==5&&j==5||i==6&&j==6||i==7&&j==3
                        ||i==1&&j==13||i==2&&j==11||i==3&&j==10||i==4&&j==6||i==5&&j==8||i==6&&j==7) 
                {
                    System.out.print("V ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display I
            for(int j=0;j<=8;j++)
            {
                if (i==1&&(j>=4&&j<=8)||(i>=2&&i<=3)&&j==7||i==4&&j==4||(i>=5&&i<=6)&&j==7||i==7&&(j>=0&&j<=4)) 
                {
                    System.out.print("I ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display S
            for(int j=0;j<=12;j++)
            {
                if (i==1&&(j>4&&j<8)||i==2&&j==7||i==2&&j==12||i==3&&j==8||i==4&&j==7||i==5&&j==12
                        ||i==6&&j==7||i==6&&j==12||i==7&&(j>0&&j<4)) 
                {
                    System.out.print("S ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display H
            for(int j=0;j<=16;j++)
            {
                if (i==1&&j==4||i==2&&j==8||i==3&&j==9||i==4&&(j>5&&j<11)||i==5&&j==9||i==6&&j==8||i==7&&j<=0
                        ||i==1&&j==11||i==2&&j==15||i==3&&j==16||i==5&&j==16||i==6&&j==15||i==7&&j==7) 
                {
                    System.out.print("H ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display A
            for (int j = 0; j <= 16; j++) 
            {
                if (i==1&&j==8||i==2&&j==10||i==2&&j==13||i==3&&j==10||i==3&&j==15||i==4&&(j>=3&&j<=7)
                        ||i==5&&j==9||i==5&&j==16||i==6&&j==15||i==6&&j==8||i==7&&j==0||i==7&&j==7) 
                {
                    System.out.print("A ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //Display Y
            for (int j = 0; j <= 16; j++) 
            {
                if (i==1&&j==0||i==2&&j==4||i==3&&j==7
                   ||i==1&&j==9||i==2&&j==11||i==3&&j==10||i==4&&j==0||i==5&&j==9||i==6&&j==8||i==7&&j==0) 
                {
                    System.out.print("Y ");
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
