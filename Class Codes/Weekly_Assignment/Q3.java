//3.Write a Java program to create an abstract class Instrument with abstract methods play() and
//tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
//the respective methods to play and tune each instrument.

package Weekly_Assignment;

abstract class Instrument 
{
    public abstract void play();
    public abstract void tune();
}

class Piano extends Instrument 
{
    @Override
    public void play() 
    {
        System.out.println("Playing Piano :) ");
    }

    @Override
    public void tune() 
    {
        System.out.println("Tuning Piano :) ");
    }
}

class Guitar extends Instrument 
{
    @Override
    public void play() 
    {
        System.out.println("Playing Guitar :) ");
    }

    @Override
    public void tune() 
    {
        System.out.println("Tuning Guitar :) ");
    }
}

public class Q3 {
    public static void main(String[] args) 
    {
        Instrument[] ins = new Instrument[2];
        ins[0] = new Piano();
        ins[1] = new Guitar();

        for (Instrument instrument : ins) 
        {
            instrument.play();
            instrument.tune();
        }
    }
}