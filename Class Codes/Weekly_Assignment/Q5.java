//5.Write a Java program to demonstrate Upcasting Vs Downcasting

package Weekly_Assignment;

class Birds 
{
    void makeSound() 
    {
        System.out.println("Birds makes sound");
    }
}

class parrot extends Birds 
{
    @Override
    void makeSound() 
    {
        System.out.println("Parrot squeaks");
    }

    void eats() 
    {
        System.out.println("Parrot eats chilly");
    }
}

public class Q5 
{
    public static void main(String[] args) {
        
        Birds birds = new parrot(); 
        birds.makeSound();
        
        if(birds instanceof parrot) 
        {
            parrot parrot = (parrot) birds; 
            parrot.eats();
        } 
        else 
        {
            System.out.println("Bird is not a parrot");
        }
    }
}
