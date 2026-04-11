
package crudsystem;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


public class CrudSystem {

    public static void main(String[] args) {

    }
    
     public static Connection getCon(){
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/jeestore";
    String user="root";
    String password="1234";
        try {
            //        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);    
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudSystem.class.getName()).log(Level.SEVERE, null, ex);
        
            return con;
        }
        
        
    }
    
}
