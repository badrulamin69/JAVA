package testmultithreading;

public class TestMultithreading {

    public static void main(String[] args) {

        Runnable PrintA = new PrintChar('A', 20);
        Runnable PrintB = new PrintChar('B', 20);
        Runnable PrintC = new PrintChar('C', 20);

        Thread t1 = new Thread(PrintA);
        Thread t2 = new Thread(PrintB);
        Thread t3 = new Thread(PrintC);

        t1.start();
        t2.start();
        t3.start();

    }

}
