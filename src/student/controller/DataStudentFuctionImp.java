/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.controller;

import book.Controller.DataFuctionImplement;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import student.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DataStudentFuctionImp implements DataStudentFunction {
    
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    @Override
    public void readStudentSQL(ArrayList<Student> listst) {
        DataFuctionImplement data = new DataFuctionImplement();
        SQLServerDataSource ds = data.ketNoiSQL();
        try ( var cn = ds.getConnection()) {
            var sql = "SELECT * FROM student";
            var ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                var studentId = rs.getString(1);
                var nameS = rs.getString(2);
                var gender = rs.getString(3);
                var birthdayS = rs.getString(4);
                var classRoom = rs.getString(5);
                var address = rs.getString(6);
                var major = rs.getString(7);
                var phone = rs.getString(8);
                var mail = rs.getString(9);
                var password = rs.getString(10);
                
                Student st = new Student(studentId, classRoom, major, mail,
                       nameS, df.parse(birthdayS),
                        address, phone, gender,password);
                listst.add(st);
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
    }
     @Override
    public int insertStudent(Student s) {
        DataFuctionImplement data_1 = new DataFuctionImplement();
        SQLServerDataSource data = data_1.ketNoiSQL();
        try ( var conn = data.getConnection()) {
            var sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?,?,?)";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGender());
            ps.setString(4, df.format(s.getDob()));
            ps.setString(5, s.getClassRoon());
            ps.setString(6, s.getAddress());
            ps.setString(7, s.getMajor());            
            ps.setString(8, s.getPhone());
            ps.setString(9, s.getEmail());
            ps.setString(10,s.getPassword());
            return ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    } 
    
    @Override  
    public int updateStudent(Student s) {
        DataFuctionImplement data_1 = new DataFuctionImplement();
        SQLServerDataSource data = data_1.ketNoiSQL();
        try ( var conn = data.getConnection()) {
            var sql = "UPDATE Student SET nameS = ? , gender = ?,"
                    + " birthdayS = ?, class = ? , address  = ?, marjor = ?,"
                    + " phone=?, mail=?, passwd=? WHERE studentId = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGender());
            ps.setString(3, df.format(s.getDob()));
            ps.setString(4, s.getClassRoon());
            ps.setString(5, s.getAddress());
            ps.setString(6, s.getMajor());            
            ps.setString(7, s.getPhone());
            ps.setString(8, s.getEmail());
            ps.setString(9,s.getPassword());
            ps.setString(10,s.getStudentId());
           return ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    @Override
    public int delStudent(Student s) {
        DataFuctionImplement data_1 = new DataFuctionImplement();
        SQLServerDataSource data = data_1.ketNoiSQL();
        try ( var conn = data.getConnection()) {
            var sql = "DELETE FROM student WHERE studentId = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            ps.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    @Override
    public ArrayList<Student> searchByName (ArrayList<Student> listStudent,
            String nameStudent) {
        ArrayList<Student> listSearch = new ArrayList<>();
         for (var e : listStudent) {
             var name = e.getName().split("\\s+");
             var firstName = name[name.length-1];
            if(firstName.equalsIgnoreCase(nameStudent)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    @Override
    public ArrayList<Student> searchByClass (ArrayList<Student> listStudent,
            String clss) {
        ArrayList<Student> listSearch = new ArrayList<>();
         for (var e : listStudent) {
            if(e.getClassRoon().equalsIgnoreCase(clss)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    @Override
    public Student searchStudentById(ArrayList<Student> listStudent, 
            String studentId) {
        for (var e : listStudent) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;
            }
        }
        return null;
    }

   
    
}
