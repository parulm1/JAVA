package Exception_Handling;
import java.util.*;
public class VoterValidity 
{
    void checkValidity()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age=scan.nextInt();
        if(age>=18)
        {
            System.out.println("Congrats you are eligible to voting :)");
        }
        else
        {
            try
            {
                throw new VVException("Bhai abhi tum chote ho... Politics se door raho");
            }
            catch(VVException ed)
            {
                System.out.println(ed.getMessage());
            }
        }
    }
}
