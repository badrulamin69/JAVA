package crudemp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudEmp {

    public static void main(String[] args) {
        
        saveEmp("Emon", "IT", 50000);
        saveEmp("Tanvir", "DDD", 40000);
        saveEmp("Badrul", "IT", 40000);
        
        showEmp();
        
        updateEmp(1, "PK", "IT", 50000);
        
        showEmp();
        
        deleteEmp(2);

    }

    public static Connection getCon() {

        String url = "jdbc:mysql://localhost:3306/practice?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrudEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void saveEmp(String name, String department, float salary) {

        String Sql = "insert into Employee(name,department, salary) values(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            ps.setString(1, name);
            ps.setString(2, department);
            ps.setFloat(3, salary);
            
            ps.executeUpdate();
            
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmp.class.getName()).log(Level.SEVERE, null, ex);
        
        }   

    }
    
    public static void showEmp() {

        String Sql = "select * from employee";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("name: "+ rs.getString("name"));
                System.out.println("department: "+ rs.getString("department"));
                System.out.println("salary: "+ rs.getFloat("salary"));
                
                System.out.println("==============================");
            }
            
            ps.close();
            rs.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmp.class.getName()).log(Level.SEVERE, null, ex);
        
        }   

    }
    
    public static void updateEmp(int id, String name, String department, float salary) {

        String Sql = "update Employee set name = ?, department = ?, salary = ? where id = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            ps.setString(1, name);
            ps.setString(2, department);
            ps.setFloat(3, salary);
            
            ps.setInt(4, id);
            
            ps.executeUpdate();
            
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmp.class.getName()).log(Level.SEVERE, null, ex);
        
        }   

    }
    
     public static void deleteEmp(int id) {

        String Sql = "delete from employee where id = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmp.class.getName()).log(Level.SEVERE, null, ex);
        
        }   

    }
    
}
