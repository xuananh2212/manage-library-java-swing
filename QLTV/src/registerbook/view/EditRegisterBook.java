/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package registerbook.view;

import book.Controller.DataFuctionImplement;
import book.Model.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import registerbook.controller.DataRegisterBookimp;

import registerbook.controller.DataRegisterBookFuction;
import registerbook.model.RegisterBook;
import student.model.Student;

/**
 *
 * @author DELL
 */
public class EditRegisterBook extends javax.swing.JDialog {

    private RegisterBook rb;
    private HomeRegisterBookForm hRBF;
    private ArrayList<RegisterBook> listRb;
    private ArrayList<Student> listSt;
    private ArrayList<Book> listB;

    /**
     * Creates new form EditRegisterBook
     */
    public EditRegisterBook(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hRBF = (HomeRegisterBookForm) parent;
    }

    public EditRegisterBook(java.awt.Frame parent, boolean modal, RegisterBook rb) {
        this(parent, modal);
        this.rb = rb;
        listRb = hRBF.getListRb();
        listSt = hRBF.getListSt();
        listB = hRBF.getListB();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txtStudentId.setText(rb.getStudentId());
        txtBookId.setText(rb.getBookId());
        spinnerAmount.setValue(rb.getAmountBook());
        txtAppointDate.setText(df.format(rb.getAppointDate()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtBookId = new javax.swing.JTextField();
        spinnerAmount = new javax.swing.JSpinner();
        txtAppointDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa Thông Tin Mượn Sách");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Mượn Trả"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã Sinh Viên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã Sách:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số Lượng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Hẹn Trả");

        txtStudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtBookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        spinnerAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAppointDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentId)
                    .addComponent(txtBookId)
                    .addComponent(spinnerAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(txtAppointDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spinnerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAppointDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClose.setText("Hủy");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClose))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        var studentId = txtStudentId.getText();
        var bookId = txtBookId.getText();
        int amount = (int) spinnerAmount.getValue();
        var appointDateText = txtAppointDate.getText();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dfbd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (!studentId.isEmpty() && !bookId.isEmpty() && amount > 0
                && !appointDateText.isEmpty()) {
            try {

                var st = checkSt(studentId);
                var book = checkBookId(bookId);
                if (st != null) {
                    if (book != null) {
                        if (amount < book.getAmount()) {
                            if (amount <= 3) {
                                Date appointDate = df.parse(appointDateText);
                                if (appointDate.getTime() > this.rb.getBorrowDate().getTime()) {
                                    var rbtext = new RegisterBook(st.getStudentId(), book.getBookId());
                                    if (this.rb.getBookId().equalsIgnoreCase(bookId)
                                            && this.rb.getStudentId().equalsIgnoreCase(studentId)){
                                        this.rb.setAppointDate(appointDateText);
                                        var amountBook = rb.getAmountBook() + book.getAmount() - amount;
                                        this.rb.setAmountBook(amount);
                                        book.setAmount(amountBook);
                                        DataFuctionImplement dfBook = new DataFuctionImplement();
                                        dfBook.updateBookSQL(book);
                                        DataRegisterBookimp dfRB = new DataRegisterBookimp();
                                        dfRB.updateRegisterBookSQL(this.rb, bookId, studentId);
                                        this.hRBF.editTableModelRB(this.rb);
                                        JOptionPane.showMessageDialog(rootPane, "cập nhật thành công");
                                        this.dispose();

                                    } else {

                                        if (!listRb.contains(rbtext)) {
                                            var bookidOld = this.rb.getBookId();
                                            var studentIdOld = this.rb.getStudentId();
                                            this.rb.setStudentId(studentId);
                                            this.rb.setBookId(bookId);
                                            this.rb.setAppointDate(appointDateText);
                                            if (this.rb.getBookId().equalsIgnoreCase(bookidOld)) {
                                                var amountBook = rb.getAmountBook() + book.getAmount() - amount;
                                                this.rb.setAmountBook(amount);
                                                book.setAmount(amountBook);

                                            } else {
                                                var bookOld = checkBookId(bookidOld);
                                                var amountBookOld = bookOld.getAmount() + this.rb.getAmountBook();
                                                bookOld.setAmount(amountBookOld);
                                                DataFuctionImplement dfBook = new DataFuctionImplement();
                                                dfBook.updateBookSQL(bookOld);
                                                var amountBook = book.getAmount() - amount;
                                                this.rb.setAmountBook(amount);
                                                book.setAmount(amountBook);

                                            }
                                            DataFuctionImplement dfBook = new DataFuctionImplement();
                                            dfBook.updateBookSQL(book);
                                            DataRegisterBookimp dfRB = new DataRegisterBookimp();
                                            dfRB.updateRegisterBookSQL(this.rb, bookidOld, studentIdOld);
                                            this.hRBF.editTableModelRB(this.rb);
                                            JOptionPane.showMessageDialog(rootPane, "cập nhật thành công");
                                            this.dispose();

                                        } else {

                                            JOptionPane.showMessageDialog(rootPane, "mã sinh viên: "
                                                    + st.getStudentId() + " đã mượn sách với "
                                                    + "mã sách:" + book.getBookId());
                                        }

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "ngày hẹn trả phải "
                                            + "lớn hơn ngày hiện thời");
                                }

                            } else {
                                JOptionPane.showMessageDialog(rootPane, "  chỉ mượn tối đa 3 quyển");

                            }

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "số lượng sách trong "
                                    + "thư viên không đủ cho "
                                    + "bạn mượn(số sách còn lại là: "
                                    + book.getAmount() + ")");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "mã sách không tồn tại");

                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "mã sinh viên không tồn tại");
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "vui lòng nhập đúng định dạng (vd: 22/12/2022)!");
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "vui lòng không để trống thông tin!)");

        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private Student checkSt(String studentId) {
        for (var e : listSt) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;

            }

        }
        return null;
    }

    private Book checkBookId(String bookId) {
        for (var e : listB) {

            if (e.getBookId().equalsIgnoreCase(bookId)) {

                return e;
            }

        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditRegisterBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRegisterBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRegisterBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRegisterBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditRegisterBook dialog = new EditRegisterBook(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinnerAmount;
    private javax.swing.JTextField txtAppointDate;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
