package exceptionh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionH {

    public static void main(String[] args) {

        File f = new File("Tanvir.txt");
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
