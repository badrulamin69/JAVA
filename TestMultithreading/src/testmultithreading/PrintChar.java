package testmultithreading;

public class PrintChar implements Runnable {

    private char chatToPrint;
    private int times;

    public PrintChar() {
    }

    public PrintChar(char chatToPrint, int times) {
        this.chatToPrint = chatToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(chatToPrint + "");
        }
    }

}
