/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package student.controller;

import java.util.ArrayList;
import student.model.Student;

/**
 *
 * @author DELL
 */
public interface DataStudentFunction {

    void readStudentSQL(ArrayList<Student> listst);

    int insertStudent(Student s);

    int updateStudent(Student s);

    int delStudent(Student s);

    ArrayList<Student> searchByName(ArrayList<Student> listStudent,
            String nameStudent);

    ArrayList<Student> searchByClass(ArrayList<Student> listStudent,
            String clss);

    Student searchStudentById(ArrayList<Student> listStudent,
            String studentId);

}
