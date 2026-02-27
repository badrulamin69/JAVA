package bos.dao;

import bos.model.User;
import bos.service.DaoService;
import bos.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao implements DaoService<User> {

    DbUtil util;
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(User e) {
        sql = "insert into User(userName, password, role) values(?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getUserName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getRole());
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User findAll(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
