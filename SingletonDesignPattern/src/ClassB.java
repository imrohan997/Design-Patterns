/**
 * Singleton class developed using static method
 */
public class ClassB {
    private static ClassB classB;

    private ClassB() {
        System.out.println("Instantiating Class B");
    }

    public static ClassB getInstance() {
            if (classB == null) {
                classB = new ClassB();
            }
        return classB;
    }

    public void display() {
        System.out.println("Display Class B");
    }
}
