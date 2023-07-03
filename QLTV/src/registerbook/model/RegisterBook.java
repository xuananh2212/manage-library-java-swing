/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registerbook.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import registerbook.controller.DataRegisterBookimp;

/**
 *
 * @author DELL
 */
public class RegisterBook {

    private String studentId;
    private String bookId;
    private int amountBook;
    private Date borrowDate;
    private Date appointDate;
    private Date payDate;
    private String giveBookBack = "chưa trả";
    private String payMoney = "";

    public RegisterBook() {
    }

    public RegisterBook(String studentId, String bookId) {
        this.studentId = studentId;
        this.bookId = bookId;
    }

    public RegisterBook(String studentId, String bookId, int amountBook,
            String borrowDate, String appointDate, String payDate, String giveBookBack) 
           {
        this.studentId = studentId;
        this.bookId = bookId;
        this.amountBook = amountBook;
        this.giveBookBack = giveBookBack;
        setBorrowDate(borrowDate);
        setPayDate(payDate);
        setAppointDate(appointDate);
    }

    public RegisterBook(String studentId, String bookId, int amountBook,
            String borrowDate, Date appointDate, String giveBookBack) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.amountBook = amountBook;
        this.appointDate = appointDate;
        this.giveBookBack = giveBookBack;
        setBorrowDate(borrowDate);

    }

    public RegisterBook(String studentId, String bookId, int amountBook, String borrowDate,String appointDate) 
           {
        this.studentId = studentId;
        this.bookId = bookId;
        this.amountBook = amountBook;
        setBorrowDate(borrowDate);
        setAppointDate(appointDate);
    }
    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(int amountBook) {
        this.amountBook = amountBook;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        try {
            this.borrowDate = df.parse(borrowDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public Date getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(String appointDate){
       
       
          
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.appointDate = df.parse(appointDate);
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
            
            
        
       
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (!payDate.isEmpty()) {
            try {
                this.payDate = df.parse(payDate);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

        }

    }

    public String getGiveBookBack() {
        return giveBookBack;
    }

    public void setGiveBookBack(String giveBookBack) {
        this.giveBookBack = giveBookBack;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegisterBook other = (RegisterBook) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return Objects.equals(this.bookId, other.bookId);
    }

   
    

}
