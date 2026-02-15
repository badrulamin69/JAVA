
package filehandler;


public class AllFileHandler {


    public static void main(String[] args) {
        
        FileH fh = new FileH("Captain.txt");
        fh.createfile();
        fh.writefile();
        fh.readfile();
        
    }
    
}
