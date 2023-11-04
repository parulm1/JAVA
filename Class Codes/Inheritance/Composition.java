package Inheritance;

class Engine {
    private String model;
    private int horsepower;

    public Engine(String model, int horsepower) 
    {
        this.model = model;
        this.horsepower = horsepower;
    }
    public String getModel() 
    {
        return model;
    }
    public int getHorsepower()
    {
        return horsepower;
    }
}
class Car 
{  
    private String model;
    private Engine engine; 

    public Car(String model, Engine engine) {
       
        this.model = model;
        this.engine = engine;
    }
    public String getModel() 
    {
        return model;
    }
    public Engine getEngine()
    {
        return engine;
    }
    public void displayCarInfo() 
    { 
        System.out.println("Car Model: " + model);
        System.out.println("Engine Details:");
        System.out.println("   Engine Model: " + engine.getModel());
        System.out.println("   Engine Horsepower: " + engine.getHorsepower());
    }
}
public class Composition 
{
    public static void main(String[] args) {
 
        Engine carEngine = new Engine("V6", 300);

        Car c = new Car("Audi", carEngine);

        c.displayCarInfo();
    }
}
