/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package registerbook.controller;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.util.ArrayList;
import registerbook.model.RegisterBook;

/**
 *
 * @author DELL
 */
public interface DataRegisterBookFuction {
   void readRegisterBookSQL(ArrayList<RegisterBook> listRb);
   int writeRegisterBookSQL(RegisterBook rb);
   int updateRegisterBookSQL(RegisterBook rb,String bookId, String studentId);
   int deleteRegisterBookSQL(RegisterBook rb);
   ArrayList<RegisterBook> seachByStudentId(ArrayList<RegisterBook> listRb,String studentId);
   ArrayList<RegisterBook> seachByBookId(ArrayList<RegisterBook> listRb, String bookId);
   ArrayList<RegisterBook> seachByGiveBookBack(ArrayList<RegisterBook> listRb, String gbb);
  
   
   
   
   
    
}
