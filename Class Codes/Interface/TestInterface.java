package Interface;
public class TestInterface {
    public static void main(String[] args) {
        Interface si;
        si=new StudentImple();
        si.showAge(22);
        si.showName("Parul");
        si.Course();
        Interface.institute();
    }
}
