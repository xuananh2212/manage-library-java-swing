/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.Model;

import book.Controller.DataInValidImplement;
import book.Controller.InValidAuthorException;
import book.Controller.InValidPriceException;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Book  {
    public static int ID = 1000;
    private String bookId;
    private String name;
    private String category;
    private String author;
    private String producer;
    private float price;
    private int amount;

    public Book() 
    {
    }

    public Book(String bookId, String name) 
    {
        this.bookId = bookId;
        this.name = name;
    }
     public Book(String bookid,String name, String category, String author, String producer,
            String price, int amount)
            throws InValidPriceException, InValidAuthorException {
        this.bookId = bookid;
        this.name = name;
        this.category = category;
        setAuthor(author);
        this.producer = producer;
        setPrice(price);
        this.amount = amount;
    }

   

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
       
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InValidAuthorException {
         DataInValidImplement datainvalid = new DataInValidImplement();
        if(datainvalid.inValidAuthorException(author)){
         this.author = author;
        }
       
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(String price) throws InValidPriceException {
         DataInValidImplement datainvalid = new DataInValidImplement();
        if(datainvalid.inVaildPriceException(price)){
          this.price = Float.parseFloat(price);
        }
       
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.bookId);
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
        final Book other = (Book) obj;
        return Objects.equals(this.bookId, other.bookId);
    }
    
    
}
