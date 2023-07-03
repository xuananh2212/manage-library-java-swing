/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registerbook.model;

/**
 *
 * @author DELL
 */
public class OutOfDate {
    private String studentId;
    private String fullName;
    private String bookId;
    private String nameBook;
    private int Amount;
    private int countDate;
    private String giveBackBook;

    public OutOfDate() {
    }

    public OutOfDate(String studentId, String fullName, String bookId, 
            String nameBook, int Amount, int countDate,
            String giveBackBook) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.bookId = bookId;
        this.nameBook = nameBook;
        this.Amount = Amount;
        this.countDate = countDate;
        this.giveBackBook = giveBackBook;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getCountDate() {
        return countDate;
    }

    public void setCountDate(int countDate) {
        this.countDate = countDate;
    }


    public String getGiveBackBook() {
        return giveBackBook;
    }

    public void setGiveBackBook(String giveBackBook) {
        this.giveBackBook = giveBackBook;
    }
    
    
}
