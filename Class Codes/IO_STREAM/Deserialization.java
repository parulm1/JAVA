package IO_STREAM;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization 
{
    public static void main(String[] args) 
    {
        try(FileInputStream fin=new FileInputStream("stud.ser"); 
                ObjectInputStream ois=new ObjectInputStream(fin))
        {
            Student s=(Student)ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
