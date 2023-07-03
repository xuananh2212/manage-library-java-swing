/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.Controller;

import book.Model.Book;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class DataFuctionImplement implements DataFuction {

    @Override
    public SQLServerDataSource ketNoiSQL() {
        SQLServerDataSource data = new SQLServerDataSource();
        data.setUser(DataFuction.USER_NAME);
        data.setPassword(DataFuction.PASSWD);
        data.setDatabaseName(DataFuction.DB_NAME);
        data.setPortNumber(DataFuction.PORT);
        data.setServerName(DataFuction.SERVER_NAME);

        return data;
    }

    @Override
    public void readBookSQL(ArrayList<Book> listBook) {
        SQLServerDataSource data = ketNoiSQL();
        try ( var conn = data.getConnection()) {
            var sql = "SELECT * FROM book";
            var ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                var bookId = resultSet.getString(1);
                var nameb = resultSet.getString(2);
                var category = resultSet.getString(3);
                var author = resultSet.getString(4);
                var producer = resultSet.getString(5);
                var price = resultSet.getString(6);
                var count = resultSet.getInt(7);
                Book b = new Book(bookId, nameb, category, author, producer, price, count);
                listBook.add(b);
            }
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InValidPriceException ex) {
            ex.printStackTrace();
        } catch (InValidAuthorException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public int writeBookSQL(Book b) {
        SQLServerDataSource data = ketNoiSQL();
        try ( Connection conn = data.getConnection()) {
            var sql = "INSERT INTO BOOK VALUES(?,?,?,?,?,?,?)";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookId());
            ps.setString(2, b.getName());
            ps.setString(3, b.getCategory());
            ps.setString(4, b.getAuthor());
            ps.setString(5, b.getProducer());
            ps.setFloat(6, b.getPrice());
            ps.setInt(7, b.getAmount());
            int result = ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public int updateBookSQL(Book b) {
        SQLServerDataSource data = ketNoiSQL();
        try ( Connection conn = data.getConnection()) {
            var sql = "UPDATE book SET nameB = ? , category = ?,"
                    + " author = ?, producer = ? , price  = ?, count = ? WHERE bookID = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, b.getName());
            ps.setString(2, b.getCategory());
            ps.setString(3, b.getAuthor());
            ps.setString(4, b.getProducer());
            ps.setFloat(5, b.getPrice());
            ps.setInt(6, b.getAmount());
            ps.setString(7, b.getBookId());
            int result = ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;

    }

    @Override
    public int delBookSQL(Book b) {
        SQLServerDataSource data = ketNoiSQL();
        try ( var conn = data.getConnection()) {
            var sql = "DELETE FROM book WHERE bookId = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookId());
            int result = ps.executeUpdate();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public ArrayList<Book> seachByNameBook(ArrayList<Book> listBook, String bookName) {

        ArrayList<Book> listseach = new ArrayList<>();
        var regex = "^.*" + bookName + ".*$";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        for (var e : listBook) {
            Matcher m = p.matcher(e.getName());
            if (m.matches()) {
                listseach.add(e);
            }
        }
        return listseach;

    }

    @Override
    public ArrayList<Book> seachByAuthor(ArrayList<Book> listBook, String authorName) {
        ArrayList<Book> listseach = new ArrayList<>();
        for (var e : listBook) {
             var fullname = e.getAuthor().split("\\s+");
             var firstName = fullname[fullname.length-1];
            if (firstName.equalsIgnoreCase(authorName)) {
                listseach.add(e);
            }
        }
        return listseach;
    }

    @Override
    public Book seachBookId(ArrayList<Book> listBook, String bookid) {
        for (var e : listBook) {
            if (e.getBookId().equalsIgnoreCase(bookid)) {
                return e;
            }
        }
        return null;

    }

}
