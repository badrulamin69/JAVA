package userexceptionhandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserExceptionHandler {
    
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\Admin\\Desktop\\asd.txt");
        
        try {
            PrintWriter pw = new PrintWriter(file);

//            pw.write("Hello PK \n");
//            pw.println("Hi Hasan");
//            pw.print("I'm Badrul Amin ");
            for (int i = 1; i <= 100; i++) {
                pw.print(i + ",");
            }
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceptionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s = new Scanner(file);

//            while (s.hasNext()) {
//                System.out.println(s.nextLine());
//            }
            while (s.hasNext()) {
                String next = s.next();
                System.out.println(next);
            }
            
            s.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceptionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
