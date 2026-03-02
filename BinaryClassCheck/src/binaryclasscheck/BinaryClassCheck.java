package binaryclasscheck;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryClassCheck {

    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Binary.dat");
            for (int i = 1; i <= 20; i++) {
                try {
                    output.write(i);
                } catch (IOException ex) {
                    Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileOutputStream input = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Binary.dat");
            int value;
            while(){
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryClassCheck.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
