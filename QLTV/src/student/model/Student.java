/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.model;

import java.util.Date;
import java.util.Objects;
import student.controller.DataSTInValidException;

/**
 *
 * @author DELL
 */
public class Student extends Person {

    public static int ID = 1000;
    private String studentId;
    private String classRoon;
    private String major;
    private String email;
    private String password = "kma123";

    public Student() {
    }

    public Student(String studentId, String classRoon, String major, String email) {
        this.studentId = studentId;
        this.classRoon = classRoon;
        this.major = major;
        this.email = email;
        this.password = password;
    }

    public Student(String studentId, String classRoon, String major, String email,
            String name, Date dob,
            String address, String phone, String gender, String password) {
        super(name, dob, address, phone, gender);
        this.studentId = studentId;
        this.classRoon = classRoon;
        this.major = major;
        this.email = email;
        this.password = password;
    }

    public Student(String studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassRoon() {
        return classRoon;
    }

    public void setClassRoon(String classRoon) {
        this.classRoon = classRoon;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InValidEmailException {
        DataSTInValidException sTInValid = new DataSTInValidException();
        if (sTInValid.invalidEmail(email)) {
            this.email = email;
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId.toLowerCase(), other.studentId.toLowerCase())) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

}
