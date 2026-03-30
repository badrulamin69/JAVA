package multithread.print;

public abstract class CharPrint implements Runnable {

    private char charToPrint;
    private int times;

    public CharPrint() {
    }

    public CharPrint(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint + " ");
        }

    }

}
