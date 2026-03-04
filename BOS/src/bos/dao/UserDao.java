package bos.dao;

import bos.model.User;
import bos.service.DaoService;
import bos.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao implements DaoService<User> {

    DbUtil util= new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;

    @Override
    public void save(User e) {
        sql = "insert into user(userName, password) values(?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getUserName());
            ps.setString(2, e.getPassword());

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User e) {
        sql = "update user set userName=?, password=? where id=? ";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getUserName());
            ps.setString(2, e.getPassword());
            ps.setInt(3, e.getId());

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<User> findAll() {

        sql = "select * from user";
        List<User> list = new ArrayList<>();

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                User u = new User(rs.getString("userName"), rs.getString("password"));

                list.add(u);
            }
            ps.close();
            rs.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void delete(int id) {
        try {
            sql = "delete from user where id = ?";
            
            ps = util.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
