package studentcrud.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentcrud.model.Student;
import studentcrud.util.DbUtil;

public class StudentDao {

    DbUtil du = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    public void save(Student s) {
        sql = "insert into studentcrud (name, email) values(?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Student s) {
        sql = "update studentcrud set name=?, email = ? where id =?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getId());
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {
        sql = "delete from studentcrud where id = ?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Student> ShowAll() {
        sql = "select * from studentcrud";

        List<Student> list = new ArrayList<>();

        try {
            ps = du.getCon().prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
                list.add(s);
            }
            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
