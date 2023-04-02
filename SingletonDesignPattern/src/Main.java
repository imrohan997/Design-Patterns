public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           ClassB classB = ClassB.getInstance();
           classB.display();
        });

        Thread thread2 = new Thread(() -> {
            ClassB classB = ClassB.getInstance();
            classB.display();
        });

        thread1.start();
        thread2.start();


    }
}