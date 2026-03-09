
package studentcrud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {
    
    String url = "jdbc:mysql://localhost:3306/jeestore?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user = "root";
    String password = "1234";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con ;
    
    public Connection getCon(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    
    }
}
