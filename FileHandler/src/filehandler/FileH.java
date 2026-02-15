
package filehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileH {
    
    private String FilePath;
    private File file;

    public FileH(String FilePath) {
        this.FilePath = FilePath;
    }
    
    public void createfile(){
        file = new File(FilePath);
        try {
            if(file.createNewFile()){
                System.out.println("Successful");    
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FileH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writefile(){
        file = new File(FilePath);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Tanvir is now in dual account");
            
            printWriter.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileH.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void readfile(){
        file = new File(FilePath);
        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String next = s.nextLine();
                System.out.println(next); 
            }
            
            s.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletefile(){
        file =  new File(FilePath);
        if(file.delete()){
            System.out.println("Deleted");
        }
    
    }
    
}
