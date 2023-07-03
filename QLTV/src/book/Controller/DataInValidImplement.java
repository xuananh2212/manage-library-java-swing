/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class DataInValidImplement implements DataInValidException  {

    /**
     *
     * @param author
     * @return
     * @throws InValidAuthorException
     */
    @Override
    public Boolean inValidAuthorException(String author) throws InValidAuthorException{
        var regex = "^[^0-9!@#$%^&*()-=<>/;?':_]{2,40}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(author);
        if(matcher.matches()){
           return true;
        }else{
            throw  new InValidAuthorException(author, "ten tac gia kh học le");
           
        }
    }

    @Override
    public Boolean inVaildPriceException(String price) throws InValidPriceException{
         var regex = "^[0-9]+.[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);
        if(matcher.matches()){
           return true;
        }else{
            throw  new InValidPriceException(price, "ten tac gia kh học le");
           
        }
    }
    
}
