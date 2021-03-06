
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Life
 */
public class editDeleteDrug extends javax.swing.JFrame {

    /**
     * Creates new form editDeleteDrug
     */
    drugs d = new drugs();
    public editDeleteDrug() {
        initComponents();
        
        d.fillDrugJtable(jTable1,"");
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.BLUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jTextField_SoldDrugs = new javax.swing.JTextField();
        jButtonRemove = new javax.swing.JButton();
        jButtonEditDrug = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField_PharmacistId = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_StockId = new javax.swing.JTextField();
        jButtonAddDrug = new javax.swing.JButton();
        jTextField_Price = new javax.swing.JTextField();
        jTextField_Quantity = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setText("Edit /Delete Medicine ");
        jLabel17.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Sold Drugs:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Stock Id:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane3.setViewportView(jTextArea_Description);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Description:");

        jTextField_SoldDrugs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonEditDrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditDrug.setText("Edit");
        jButtonEditDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDrugActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Pharmacist Id:");

        jTextField_PharmacistId.setEditable(false);
        jTextField_PharmacistId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pharmacist Id", "Stock Id", "Sold Drugs", "Description", "Price", "Quantity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jTextField_StockId.setEditable(false);
        jTextField_StockId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonAddDrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddDrug.setText("Add");
        jButtonAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDrugActionPerformed(evt);
            }
        });

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField_Quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Unit Price:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Quantity:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_Quantity)
                        .addGap(121, 121, 121)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonEditDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAddDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_SoldDrugs)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jTextField_PharmacistId)
                            .addComponent(jTextField_StockId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField_PharmacistId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField_StockId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_SoldDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
       int Pid = Integer.valueOf(jTextField_PharmacistId.getText());
          int Sid = Integer.valueOf(jTextField_StockId.getText());
          
          d.insertUpdateDeletePharmacist('d', Pid, Sid, null, null,null,null);
           editDeleteDrug.jTable1.setModel(new DefaultTableModel(null,new Object []{"Pharmacist Id","Stock Id","  Sold Drugs","Description","Price","Quantity"}));
          d.fillDrugJtable(jTable1,"");
          

        //        if(!jTextField_PharmacistId.getText().equals("")){
            //            int id  = Integer.valueOf(jTextField_PharmacistId.getText());
            //            s.insertUpdateDeletePharmacist('d',id,null, null, null, null, null, null, null);
            //            manageStockForm.jTable1.setModel(new DefaultTableModel(null,new Object []{"Id","Name","Category","Description","Status","Manufacture Date","Expiry Date","Time Received"}));
            //            s.fillStockJtable(manageStockForm.jTable1, null);
            //            jTextField_PharmacistId.setText("");
            //            jTextField_DrugName.setText("");
            //            jTextField_DrugCategory.setText("");
            //            jTextArea_DrugDescription.setText("");
            //            jTextField_DrugStatus.setText("");
            //            jTextField_MDate.setText("");
            //            jTextField_EDate.setText("");
            //            jSpinner1.setValue(0);
            //        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonEditDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDrugActionPerformed

          int Pid = Integer.valueOf(jTextField_PharmacistId.getText());
          int Sid = Integer.valueOf(jTextField_StockId.getText());
          double tdr = Double.valueOf(jTextField_SoldDrugs.getText());
          String descp = jTextArea_Description.getText();
          String price = jTextField_Price.getText();
          String quantity = jTextField_Quantity.getText();
          try{
          
          d.insertUpdateDeletePharmacist('u', Pid, Sid, tdr, descp, price, quantity);
           }catch(Exception ex){ 
              Logger.getLogger(managePharmacistForm.class.getName()).log(Level.SEVERE, null, ex);
          }
          editDeleteDrug.jTable1.setModel(new DefaultTableModel(null,new Object []{"Pharmacist Id","Stock Id","Sold Drugs","Description","Price","Quantity"}));
          d.fillDrugJtable(jTable1,"");
          JOptionPane.showMessageDialog(null, "Medicine Updated");
         try{
         editDeleteDrug.jTable1.setModel(new DefaultTableModel(null,new Object []{"Pharmacist Id","Stock Id","Sold Drugs","Description","Price","Quantity"}));
          d.fillDrugJtable(jTable1,"");
         }catch(Exception ex){
         
         System.out.println(ex.getMessage());
         }
    
          
          


//        int pstId = Integer.valueOf(jTextField_PharmacistId.getText());
//        int stkId = s.getStockId(jComboBoxStockId.getSelectedItem().toString());
//        double tdr = Double.valueOf(jTextField_SoldDrugs.getText());
//
//        System.out.print(stkId);
//        d.insertUpdateDeletePharmacist('i', pstId,stkId, tdr,jTextArea_Description.getText());

        //        addStockForm AddSt = new addStockForm();
        //        AddSt.setVisible(true);
        //        AddSt.pack();
        //        AddSt.setLocationRelativeTo(null);
        //        AddSt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonEditDrugActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int rowIndex = jTable1.getSelectedRow();
        jTextField_PharmacistId.setText(jTable1.getValueAt(rowIndex, 0).toString());
         jTextField_StockId.setText(jTable1.getValueAt(rowIndex, 1).toString());
         jTextField_SoldDrugs.setText(jTable1.getValueAt(rowIndex, 2).toString());
         jTextArea_Description.setText(jTable1.getValueAt(rowIndex, 3).toString());
         jTextField_Price.setText(jTable1.getValueAt(rowIndex, 4).toString());
         jTextField_Quantity.setText(jTable1.getValueAt(rowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

        //        if(evt.getKeyCode() == KeyEvent.VK_UP||evt.getKeyCode() == KeyEvent.VK_DOWN)
        //        {
            //            rowIndex = jTable1.getSelectedRow();
            //            jTextField_PST_ID.setText(model.getValueAt(rowIndex, 0).toString());
            //            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            //            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            //            jTextField_BirthDate.setText(model.getValueAt(rowIndex,4).toString());
            //            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            //            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            //            if(model.getValueAt(rowIndex,3).toString().equals("Male"))
            //            {
                //                jRadioButtonMale.setSelected(true);
                //                jRadioButtonFemale.setSelected(false);
                //            }else{
                //
                //                jRadioButtonFemale.setSelected(true);
                //                jRadioButtonMale.setSelected(false);
                //            }
            //        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButtonAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDrugActionPerformed
               addDrugForm AddDrf = new addDrugForm();
               AddDrf .setVisible(true);
               AddDrf .pack();
               AddDrf .setLocationRelativeTo(null);
               AddDrf .setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddDrugActionPerformed

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
            java.util.logging.Logger.getLogger(editDeleteDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDeleteDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDeleteDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDeleteDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDeleteDrug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDrug;
    private javax.swing.JButton jButtonEditDrug;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_PharmacistId;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Quantity;
    private javax.swing.JTextField jTextField_SoldDrugs;
    private javax.swing.JTextField jTextField_StockId;
    // End of variables declaration//GEN-END:variables
}
