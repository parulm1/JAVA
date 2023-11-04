package pattern;

public class PARUL 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 8; i++) 
        {
            for (int j = 1; j <= 60; j++) 
            {
                if((i>1&&i<8) && j==1 || (j>1 && j<4)&&i==2 || j==5&&i==3 || (j>1&&j<4)&&i==4 
                    ||(i>1&&i<8) && j==1 || (j>1 && j<4)&&i==2 || j==5&&i==3 || (j>1&&j<4)&&i==4)
                {
                    System.out.print("P ");
                }
                else if(j==7&& i==2 || i==3&&(j>=7&&j<=8)|| i==4&&j==8|| i==5&&(j>=6&&j<=9) ||i==6&&j==5
                        ||i==6&&j==12 || i==7&&j==4||i==7&&j==13||i==4&&j==5)
                {
                    System.out.print("A ");
                }
                else if(i==2&&(j>12&&j<16)||j==13&&i==3||j==17&&i==3|| i==4&&(j>11&&j<15)||j==12&&i==5
                        || j==13&&i==5||j==14&&i==6||j==16&&i==6||j==14&&i==7||j==17&&i==7)
                {
                    System.out.print("R ");
                }
                else if(i==2&&j==18||i==2&&j==25||i==3&&j==19||i==3&&j==26||i==4&&j==17||i==4&&j==24||
                        i==5&&j==18||i==5&&j==25||i==6&&j==21||i==6&&j==26||i==7&&j==24)
                {
                    System.out.print("U ");
                }
                else if(j==27&&i==2||j==28&&i==3||j==26&&i==4||j==27&&i==5||j==29&&i==6||(j>29&&j<34)&&i==7)
                {
                    System.out.print("L ");
                }
                else if(i==8&&(j>0&&j<45))
                {
                    System.out.print("_");
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
