/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import student.model.InValidEmailException;
import student.model.InValidPhoneException;

/**
 *
 * @author DELL
 */
public class DataSTInValidException {

  public  boolean invalidPhone(String phone) throws InValidPhoneException {
        var regex = "^[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        if (m.matches()) {
            return true;
        } else {
            throw new InValidPhoneException("không hợp Lệ", phone);
        }

    }
  public boolean invalidEmail(String email) throws InValidEmailException{
  
   var regex = "^[a-zA-Z0-9_]+@gmail.com$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return true;
        } else {
            throw new InValidEmailException("không hợp Lệ", email);
        }
  
  }

}
