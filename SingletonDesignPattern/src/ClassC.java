/**
 * Singleton class developed using method with thread-safe method.
 */
public class ClassC {
    private static ClassC classC;

    private ClassC() {
        System.out.println("Instantiating Class C");
    }

    public static synchronized ClassC getInstance(int id) {
        if (classC == null) {
            classC = new ClassC();
        }
        return classC;
    }

    public void display() {
        System.out.println("Display Class C");
    }
}
