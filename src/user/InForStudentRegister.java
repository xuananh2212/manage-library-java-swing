/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import book.Controller.DataFuctionImplement;
import book.Model.Book;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registerbook.controller.DataRegisterBookimp;
import registerbook.model.RegisterBook;
import student.model.Student;

/**
 *
 * @author DELL
 */
public class InForStudentRegister extends javax.swing.JFrame {

    private Student st;
    private ArrayList<Book> listBook;
    private ArrayList<RegisterBook> listRB;
    private DefaultTableModel tableModelBook;
    private DefaultTableModel tableModeRB;
    private int sttBook;
    private int sttRB;
    private int edit;
    SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat dfAppointDate = new SimpleDateFormat("dd/MM/yyyy");
    private ArrayList<RegisterBook> listThis;

    /**
     * Creates new form InForStudentRegister
     */
    public InForStudentRegister(Student st) {
        this();
        this.st = st;
        tableModeRB = (DefaultTableModel) tableRegisterBook.getModel();
        tableModelBook = (DefaultTableModel) tableBook.getModel();
        sttRB = 1;
        edit = -1;
        showInforST();
        readList();
        readTableModelBook(listBook);
        readTableModelRB();

    }

    private InForStudentRegister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Student getSt() {
        return st;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JLabel();
        txtFullName = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        txtMajor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRegisterBook = new javax.swing.JTable();
        btnPayBook = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtseach = new javax.swing.JTextField();
        btnseach = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_anh-dai-dien-hacker-dep_104206058.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 100, 145));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã SV:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ Và Tên:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 81, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lớp:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 64, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Chuyên Ngành:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 26));

        txtStudentId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStudentId.setText("* Mã Sinh Viên");
        jPanel1.add(txtStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 186, 27));

        txtFullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFullName.setText("* Họ Và Tên");
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 211, 25));

        txtClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtClass.setText("* Lớp");
        jPanel1.add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 113, 28));

        txtMajor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMajor.setText("*Chuyên Ngành");
        jPanel1.add(txtMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 208, 36));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_inforst.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 280));

        tableBook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Thể Loại", "Tác giả", "Nhà Sản Xuât", "giá Sách", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBook);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Những quyển Sách Đã Mượn"));

        tableRegisterBook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableRegisterBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "mã Sách", "Tên Sách", "Ngày Mượn", "Hẹn Trả", "Ngày Trả", "quá Hạn(ngày)", "Số Lượng", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableRegisterBook);
        if (tableRegisterBook.getColumnModel().getColumnCount() > 0) {
            tableRegisterBook.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnPayBook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPayBook.setText("Trả Sách");
        btnPayBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Mượn Sách");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel7.setText("Tìm Kiếm:");

        txtseach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnseach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnseach.setText("Tìm Kiếm");
        btnseach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnseach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseachActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/setting (1).png"))); // NOI18N
        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jMenuItem1.setText("Đổi Mật Khẩu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown.png"))); // NOI18N
        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnseach, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnseach, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtseach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(rootPane, "bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (this.listBook.size() > 0) {
            edit = tableBook.getSelectedRow();
            if (edit != -1) {
                String bookId = (String) tableModelBook.getValueAt(edit, 1);
                Book book = checkBookId(bookId);
                 boolean flag = checkBookId(book);
                if (!flag) {
                    BorrowBooks bB = new BorrowBooks(this, true, book);
                    bB.setVisible(true);
                    readTableModelBook(listBook);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "sách này đã được mượn "
                            + "vui lòng chọn sách khác!");

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "vui lòng chọn sách cần mượn!");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "thư viện không có sách!");

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ChangePasswd cpasswd = new ChangePasswd(this, rootPaneCheckingEnabled);
        cpasswd.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBookActionPerformed
        edit = tableRegisterBook.getSelectedRow();
        if (tableModeRB.getRowCount() != 0) {
            var choic = JOptionPane.showConfirmDialog(rootPane, "bạn chắn chắn muốn trả sách");
            if (choic == JOptionPane.YES_OPTION) {
                if (edit != -1) {
                    String giveBackBook = (String) tableModeRB.getValueAt(edit, 8);
                    if (giveBackBook.equalsIgnoreCase("chưa trả")) {
                        String bookId = (String) tableModeRB.getValueAt(edit, 1);
                        payBook(bookId);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Trả sách thất bại "
                                + "(vì sách này đã được Trả trước đó!)");

                    }

                } else {

                    JOptionPane.showMessageDialog(rootPane, "vui lòng chọn sách muốn trả");
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "sinh viên chưa sách!");
        }
    }//GEN-LAST:event_btnPayBookActionPerformed

    private void btnseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseachActionPerformed
        var seach = txtseach.getText();
        if (!seach.isEmpty()) {
            ArrayList<Book> listSeachBook = checkSeach(seach);
            if(listSeachBook.size() != 0){
                readTableModelBook(listSeachBook);
                txtseach.setText("");
            }else{
            
                  JOptionPane.showMessageDialog(rootPane, "không tìm thấy!");
            }

        } else {
            readTableModelBook(listBook);

        }
    }//GEN-LAST:event_btnseachActionPerformed

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
            java.util.logging.Logger.getLogger(InForStudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InForStudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InForStudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InForStudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InForStudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPayBook;
    private javax.swing.JButton btnseach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable tableBook;
    private javax.swing.JTable tableRegisterBook;
    private javax.swing.JLabel txtClass;
    private javax.swing.JLabel txtFullName;
    private javax.swing.JLabel txtMajor;
    private javax.swing.JLabel txtStudentId;
    private javax.swing.JTextField txtseach;
    // End of variables declaration//GEN-END:variables

    private void showInforST() {
        txtStudentId.setText(st.getStudentId());
        var fullName = st.getName();
        txtFullName.setText(fullName);
        txtClass.setText(st.getClassRoon());
        txtMajor.setText(st.getMajor());
    }

    private void readList() {
        this.listBook = new ArrayList<>();
        this.listRB = new ArrayList<>();
        DataFuctionImplement dFbook = new DataFuctionImplement();
        dFbook.readBookSQL(listBook);
        DataRegisterBookimp dFRegisterBook = new DataRegisterBookimp();
        dFRegisterBook.readRegisterBookSQL(listRB);
    }

   
    private void readTableModelBook(ArrayList<Book> listBook) {
        sttBook = 1;
        tableModelBook.setRowCount(0);
        for (var e : listBook) {
            addTableModelBook(e);

        }

    }

    private void readTableModelRB() {
        for (var e : listRB) {
            if (e.getStudentId().equalsIgnoreCase(st.getStudentId())) {
                addTableModelRB(e);

            }

        }

    }

    private String takeNameBook(String bookId) {
        for (var e : listBook) {
            if (e.getBookId().equalsIgnoreCase(bookId)) {
                return e.getName();
            }

        }
        return null;
    }

    private Boolean checkBookId(Book book) {
        int count = tableModeRB.getRowCount();
        for (int i = 0; i < count; i++) {
            if (book.getBookId().equalsIgnoreCase(tableModeRB.getValueAt(i, 1).toString())) {
                return true;

            }

        }
        return false;
    }

    private void addTableModelBook(Book e) {
       
        var row = new Object[]{sttBook++, e.getBookId(), e.getName(), e.getCategory(),
            e.getAuthor(), e.getProducer(), e.getPrice(), e.getAmount()};
        tableModelBook.addRow(row);
        tableModelBook.fireTableDataChanged();
    }

    private void addTableModelRB(RegisterBook e) {
        String nameBook = takeNameBook(e.getBookId());
        if (e.getPayDate() == null) {
            int outOfDate = handleDate(e.getAppointDate());
            var row = new Object[]{sttRB++, e.getBookId(), nameBook,
                dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
                "", outOfDate, e.getAmountBook(), e.getGiveBookBack()};
            tableModeRB.addRow(row);
        } else {
            int outOfDate = handleDate(e.getAppointDate(), e.getPayDate());
            var row = new Object[]{sttRB++, e.getBookId(), nameBook,
                dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
                dF.format(e.getPayDate()), outOfDate, e.getAmountBook(), e.getGiveBookBack()};
            tableModeRB.addRow(row);
        }

        tableModeRB.fireTableStructureChanged();
    }

    void addRegisterBook(Date appointdate, Book book, int amount) {
        SimpleDateFormat dfAppointDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dfnow = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dateNow = new Date();
        RegisterBook rb = new RegisterBook(st.getStudentId(), book.getBookId(),
                amount, dfnow.format(dateNow), dfAppointDate.format(appointdate));
        this.listRB.add(rb);
        DataRegisterBookimp dRegisterBook = new DataRegisterBookimp();
        dRegisterBook.writeRegisterBookSQL(rb);
        addTableModelRB(rb);

    }

    void editAmountBook(Book book) {
        tableModelBook.removeRow(edit);
        var row = new Object[]{edit + 1, book.getBookId(), book.getName(), book.getCategory(),
            book.getAuthor(), book.getProducer(), book.getPrice(), book.getAmount()};
        tableModelBook.insertRow(edit, row);
        tableModelBook.fireTableDataChanged();

    }

    private int handleDate(Date appointDate) {
        Date date = new Date();
        int count = (int) ((date.getTime() - appointDate.getTime()) / (1000 * 60 * 60 * 24));
        if (count > 0) {
            return count;
        }
        return 0;
    }

    private int handleDate(Date appointDate, Date payDate) {
        int count = (int) ((payDate.getTime() - appointDate.getTime()) / (1000 * 60 * 60 * 24));
        if (count > 0) {
            return count;
        }
        return 0;
    }

    private void payBook(String bookId) {
        RegisterBook registerBook = null;
        RegisterBook rb = new RegisterBook(st.getStudentId(), bookId);
        for (var e : listRB) {
            if (e.equals(rb)) {
                registerBook = e;

            }

        }
        if (registerBook != null) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            registerBook.setGiveBookBack("đã trả");
            registerBook.setPayDate(df.format(date));
            DataRegisterBookimp dateRb = new DataRegisterBookimp();
            if (dateRb.updateRegisterBookSQL(registerBook,
                    registerBook.getBookId(), registerBook.getStudentId()) != 0) {
                insertTableModelRB(registerBook);
                JOptionPane.showMessageDialog(rootPane, "trả sách thành công");
            } else {
                System.out.println("thất bại");
            }
        }

    }

    private void insertTableModelRB(RegisterBook e) {
        String nameBook = takeNameBook(e.getBookId());
        tableModeRB.removeRow(edit);
        int outOfDate = handleDate(e.getAppointDate(), e.getPayDate());
        var row = new Object[]{sttRB++, e.getBookId(), nameBook,
            dF.format(e.getBorrowDate()), dfAppointDate.format(e.getAppointDate()),
            dF.format(e.getPayDate()), outOfDate, e.getAmountBook(), e.getGiveBookBack()};
        tableModeRB.insertRow(edit, row);
    }

    private ArrayList<Book> checkSeach(String seach) {
        ArrayList<Book> listSeachBook = new ArrayList<>();
        for (var e : listBook) {
            var fullAuthor = e.getAuthor().split("\\s+");
            if (e.getBookId().equalsIgnoreCase(seach) || e.getName().equalsIgnoreCase(seach)
                    || fullAuthor[fullAuthor.length-1].equalsIgnoreCase(seach) || 
                    e.getCategory().equalsIgnoreCase(seach)) {

                listSeachBook.add(e);

            }

        }
        return listSeachBook;
    }

    private Book checkBookId(String bookId) {
        for(var e : listBook){
            if(e.getBookId().equalsIgnoreCase(bookId)){
             
                    return e;
            }
        
        
        }
        return null;
    }

}
