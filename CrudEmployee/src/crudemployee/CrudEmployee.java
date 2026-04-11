
package crudemployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CrudEmployee {


    public static void main(String[] args) {
        
    }
    
    public static Connection getCon(){
        
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return con;
    
    }
    
    public static void createEmployee(String id, String name, String department, float salary){
        
         String createSql= "insert into employee(String id, String name, String department, float salary) values(?,?,?,?)";
         ps = getCon().prepareStatement(updateSql);
    
    }
    
}
