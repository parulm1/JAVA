package Interface;
public class StudentImple implements Interface{

    @Override
    public void showName(String name) {
        System.out.println("Name is: "+name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("Age is: "+age);
    }
}

