
package advancejavaexam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdvanceJavaExam {


//    public static void main(String[] args) {
//        
////        Emp  id empName joining date designation salary
//
//    }
    
    public static void main(String[] args) {
        
        saveEmp("Emran", "2026-04-12", "Java Dev", 50000);
        saveEmp("Tanvir", "2026-04-12", "Java Dev", 30000);
        
        showEmp();
        
        updateEmp(1, "Shimul Updated", "2026-04-12", "Senior Developer", 60000);
        
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
            System.out.println(ex);
        }
        return con;
    }

    public static void saveEmp(String name, String joiningDate, String designation, float salary) {

    String sql = "INSERT INTO empl(name, date, designation, salary) VALUES (?, ?, ?, ?)";

    try {
        Connection con = getCon();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, name);
        ps.setDate(2, Date.valueOf(joiningDate));
        ps.setString(3, designation);
        ps.setFloat(4, salary);

        ps.executeUpdate();

        System.out.println("Employee Inserted!");

        ps.close();
        con.close();

    } catch (SQLException ex) {
        System.out.println(ex);
    }
}
    
    public static void showEmp() {

        String Sql = "select * from empl";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("Name: "+ rs.getString("name"));
                System.out.println("joiningDate: "+ rs.getDate("date"));
                System.out.println("Designation: "+ rs.getString("designation"));
                System.out.println("Salary: "+ rs.getFloat("salary"));
                
                System.out.println("==============================");
            }
            
            ps.close();
            rs.close();
            getCon().close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        
        }   

    }
    
public static void updateEmp(int id, String name, String joiningDate, String designation, float salary) {

    String sql = "UPDATE Employee SET name=?, date=?, designation=?, salary=? WHERE id=?";

    try {
        PreparedStatement ps = getCon().prepareStatement(sql);

        ps.setString(1, name);
        ps.setDate(2, Date.valueOf(joiningDate));
        ps.setString(3, designation);
        ps.setFloat(4, salary);
        ps.setInt(2, id);

        ps.executeUpdate();

        System.out.println("Employee Updated!");

        ps.close();
        getCon().close();

    } catch (SQLException ex) {
        System.out.println(ex);
    }
}
    
     public static void deleteEmp(int id) {

        String Sql = "delete from empl where id = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(Sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        
        }   

    }    
    
}
