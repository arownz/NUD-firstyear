package StudentLister;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableGroup9 extends javax.swing.JFrame {

  public TableGroup9() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstudent = new javax.swing.JTextField();
        txtfirst = new javax.swing.JTextField();
        txtmiddle = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrecords = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Student List");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Middle Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel1.add(txtstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 120, 30));

        txtfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstActionPerformed(evt);
            }
        });
        jPanel1.add(txtfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, 30));
        jPanel1.add(txtmiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 30));
        jPanel1.add(txtlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, 30));

        add.setBackground(new java.awt.Color(204, 255, 255));
        add.setText("ADD");
        add.setBorder(new javax.swing.border.MatteBorder(null));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 90, 30));

        update.setBackground(new java.awt.Color(51, 255, 102));
        update.setText("UPDATE");
        update.setBorder(new javax.swing.border.MatteBorder(null));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 90, 30));

        delete.setBackground(new java.awt.Color(255, 0, 51));
        delete.setText("DELETE");
        delete.setBorder(new javax.swing.border.MatteBorder(null));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 30));

        clear.setBackground(new java.awt.Color(255, 153, 255));
        clear.setText("CLEAR");
        clear.setBorder(new javax.swing.border.MatteBorder(null));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 90, 30));

        tblrecords.setBorder(new javax.swing.border.MatteBorder(null));
        tblrecords.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "First Name", "Middle Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblrecords.setColumnSelectionAllowed(true);
        tblrecords.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tblrecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblrecordsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblrecords);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 460, 280));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Student Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      String student = txtstudent.getText();
      String first = txtfirst.getText();
      String middle = txtmiddle.getText();
      String last = txtlast.getText();
      DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
      model.addRow(new Object[]{student, first, middle, last});
  }//GEN-LAST:event_addActionPerformed

  private void tblrecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblrecordsMouseClicked
DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
  String student = model.getValueAt(tblrecords.getSelectedRow(), 0).toString();
  String first = model.getValueAt(tblrecords.getSelectedRow(), 1).toString();
    String middle = model.getValueAt(tblrecords.getSelectedRow(), 2).toString();
      String last = model.getValueAt(tblrecords.getSelectedRow(), 3).toString();
      txtstudent.setText(student);
      txtfirst.setText(first);
      txtmiddle.setText(middle);
      txtlast.setText(last);
  }//GEN-LAST:event_tblrecordsMouseClicked

  private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
String student = txtstudent.getText();
String first = txtfirst.getText();
String middle = txtmiddle.getText();
String last = txtlast.getText();
DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
model.setValueAt(student, tblrecords.getSelectedRow(), 0);
model.setValueAt(first, tblrecords.getSelectedRow(), 1);
model.setValueAt(middle, tblrecords.getSelectedRow(), 2);
model.setValueAt(last, tblrecords.getSelectedRow(), 3);
JOptionPane.showMessageDialog(null,"Record updated successfully!");
  }//GEN-LAST:event_updateActionPerformed

  private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
model.removeRow(tblrecords.getSelectedRow());
JOptionPane.showMessageDialog(null, "Record deleted successfully!");
  }//GEN-LAST:event_deleteActionPerformed

  private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
int rows = model.getRowCount()-1;
for(int i=rows; i>=0; i--){
  model.removeRow(i);
}
JOptionPane.showMessageDialog(null, "The table is now empty!"); 
  }//GEN-LAST:event_clearActionPerformed

  private void txtfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstActionPerformed

  }//GEN-LAST:event_txtfirstActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TableGroup9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TableGroup9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TableGroup9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TableGroup9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TableGroup9().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblrecords;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtmiddle;
    private javax.swing.JTextField txtstudent;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
