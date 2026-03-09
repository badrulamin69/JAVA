package pos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.model.Catagory;
import pos.service.DaoService;
import pos.util.DbUtil;

public class CatagoryDao implements DaoService<Catagory> {

    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;

    @Override
    public void save(Catagory e) {
        sql = "insert into catagory (name) values(?)";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            System.out.println("Data Save ");

        } catch (SQLException ex) {
            Logger.getLogger(CatagoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Catagory> showAll() {
        sql = "select * from catagory ";
        List<Catagory> list = new ArrayList<>();
        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Catagory user = new Catagory();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));

                list.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CatagoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(Catagory e) {
        sql = "update catagory set name = ? where id = ? ";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setInt(2, e.getId());

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CatagoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        sql = "delete from catagory where id = ?";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CatagoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
