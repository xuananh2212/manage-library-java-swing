/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.Controller;

import book.Controller.InValidAuthorException;
import book.Controller.InValidPriceException;

/**
 *
 * @author DELL
 */
public interface DataInValidException {

    /**
     *
     * @param author
     * @return
     */
    Boolean inValidAuthorException(String author)  throws InValidAuthorException;

    /**
     *
     * @param price
     * @return
     */
    Boolean inVaildPriceException(String price) throws InValidPriceException;
    
}
