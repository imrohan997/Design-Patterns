/**
 * Singelton class with Early/Eager instantiation
 */
public class ClassA {

    private static ClassA A = new ClassA();

    private ClassA() {
        System.out.println("Instantiating Class A");
    }

    public static ClassA getInstance() {
        return A;
    }

    public void display() {
        System.out.println("Display Class A");
    }
}
