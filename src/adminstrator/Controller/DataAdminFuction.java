/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminstrator.Controller;

import adminstrator.model.Employee;
import book.Controller.DataFuctionImplement;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DataAdminFuction {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public void readListAdmin(ArrayList<Employee> listE) {
        DataFuctionImplement data = new DataFuctionImplement();
        SQLServerDataSource ds = data.ketNoiSQL();
        try ( var conn = ds.getConnection()) {
            var sql = "SELECT * FROM employee";
            var per = conn.prepareStatement(sql);
            ResultSet rs = per.executeQuery();
            while (rs.next()) {
                var tk = rs.getString(1);
                var passwd = rs.getString(2);
                var name = rs.getString(3);
                var gender = rs.getString(4);
                var date = rs.getString(5);
                var address = rs.getString(6);
                var phone = rs.getString(7);
                Employee e = new Employee(tk, passwd, name, df.parse(date), address, phone, gender);
                listE.add(e);

            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    public int updateAdmin(Employee emp) {
        DataFuctionImplement data = new DataFuctionImplement();
        SQLServerDataSource ds = data.ketNoiSQL();
        try ( var conn = ds.getConnection()) {
            var sql = "UPDATE employee SET passwd = ? WHERE tk = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getPassword());
            ps.setString(2, emp.getNameTK());
            return ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;

    }

}
