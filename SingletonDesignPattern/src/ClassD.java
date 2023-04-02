/**
 * Singleton class developed using static method with thread-safe block using synchronised keyword.
 */
public class ClassD {
    private static ClassD classD;

    private ClassD() {
        System.out.println("Instantiating Class D");
    }

    public static synchronized ClassD getInstance() {
        if (classD == null) {
            classD = new ClassD();
        }
        return classD;
    }

    public void display() {
        System.out.println("Display Class D");
    }
}
