package thirdterm;

import javax.swing.table.DefaultTableModel;

public class asyncHandsOn3 extends javax.swing.JFrame {
  
    public static void addRecords(Object[] record){
    DefaultTableModel model = (DefaultTableModel)tblrecords.getModel();
    model.addRow(record);
    }
    
  public asyncHandsOn3() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    btnaddnew = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblrecords = new javax.swing.JTable();
    value1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(153, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnaddnew.setBackground(new java.awt.Color(153, 204, 255));
    btnaddnew.setText("Add New Records");
    btnaddnew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnaddnewActionPerformed(evt);
      }
    });
    jPanel1.add(btnaddnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 30));

    tblrecords.setBackground(new java.awt.Color(204, 255, 255));
    tblrecords.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Student Number", "Student Name", "Course", "Year Level"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblrecords.setRowHeight(50);
    tblrecords.setRowMargin(1);
    tblrecords.setSelectionBackground(new java.awt.Color(204, 255, 255));
    tblrecords.setSelectionForeground(new java.awt.Color(204, 204, 255));
    tblrecords.setShowGrid(true);
    jScrollPane1.setViewportView(tblrecords);

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 483, 228));

    value1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
    value1.setText("Record Database");
    jPanel1.add(value1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnaddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewActionPerformed
    asyncHandsOn3frmAdder addnew = new asyncHandsOn3frmAdder();
    addnew.setVisible(true);  }//GEN-LAST:event_btnaddnewActionPerformed

    
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
      java.util.logging.Logger.getLogger(asyncHandsOn3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(asyncHandsOn3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(asyncHandsOn3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(asyncHandsOn3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new asyncHandsOn3().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnaddnew;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private static javax.swing.JTable tblrecords;
  private javax.swing.JLabel value1;
  // End of variables declaration//GEN-END:variables
}
