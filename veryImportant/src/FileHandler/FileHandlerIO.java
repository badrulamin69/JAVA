
package FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileHandlerIO {
    
    public static void main(String[] args) {
        
        File f = new File("./badrul.txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.write("My name is Badrul Amin");
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandlerIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner s = new Scanner(f);
            
            System.out.println(s.nextLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandlerIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
