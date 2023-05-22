/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.Controller;

import book.Model.Book;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface DataFuction  {
    String USER_NAME = "sa";
    String PASSWD = "Tuan123a";
    String DB_NAME = "QLTV";
    int PORT = 1433;
    String SERVER_NAME = "DESKTOP-BGMRVPM\\SQLEXPRESS";
    SQLServerDataSource ketNoiSQL();
    void readBookSQL(ArrayList<Book> listBook);
    int writeBookSQL(Book b);
    int updateBookSQL(Book b);
    int delBookSQL(Book b);
    ArrayList<Book> seachByNameBook(ArrayList<Book> listBook,String bookName);
    ArrayList<Book> seachByAuthor(ArrayList<Book> listBook, String authorName);
    Book seachBookId(ArrayList<Book> listBook,String bookId); 
}
