/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.model;

import book.Controller.DataInValidException;
import java.util.Date;
import student.controller.DataSTInValidException;

/**
 *
 * @author DELL
 */
public class Person {
  
    private String name;
    private Date dob;
    private String address;
    private String phone;
    private String gender;

    public Person() {
    }

    public Person(String name, Date dob, String address, String phone, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws InValidPhoneException {
        DataSTInValidException stvalid = new DataSTInValidException();
        if(stvalid.invalidPhone(phone)){
        this.phone = phone;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
