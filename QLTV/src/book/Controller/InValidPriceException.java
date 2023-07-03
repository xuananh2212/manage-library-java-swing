/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.Controller;

/**
 *
 * @author DELL
 */
public class InValidPriceException extends Exception{
    private String price;

    public InValidPriceException(String price, String message) {
        super(message);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
