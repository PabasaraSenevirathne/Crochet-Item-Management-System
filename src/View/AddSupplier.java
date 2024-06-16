/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SuppliersController;
import javax.swing.JOptionPane;

public class AddSupplier extends javax.swing.JFrame {

    /**
     * Creates new form AddSupplier
     */
    public AddSupplier() {
        initComponents();
    }
    
    private void sendDataToController() {
        // Get the values from the fields
        String supplierID = supplierIdInput.getText().trim();
        String supplierName = supplierNameInput.getText().trim();
        String contactNumber = contactNumberInput.getText().trim();
        String email = emailInput.getText().trim();
        String address = addressInput.getText().trim();

        // Check if any of the fields are blank
        if (supplierID.isEmpty() || supplierName.isEmpty() || contactNumber.isEmpty() || 
                email.isEmpty() || address.isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "All fields must be filled out", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Send data to the controller
            SuppliersController.Suppliers(supplierID, supplierName, contactNumber, email, address);
        }
    }

    public void clearField() {
        supplierIdInput.setText("");
        supplierNameInput.setText("");
        contactNumberInput.setText("");
        emailInput.setText("");
        addressInput.setText("");
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
        closeBtn = new javax.swing.JLabel();
        supplierIdLable = new javax.swing.JLabel();
        supplierIdInput = new javax.swing.JTextField();
        supplierNameLable = new javax.swing.JLabel();
        contactNumberLable = new javax.swing.JLabel();
        supplierNameInput = new javax.swing.JTextField();
        emailLable = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        phoneNumberLable = new javax.swing.JLabel();
        addSupplierBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contactNumberInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressInput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(153, 0, 0));
        closeBtn.setText("X");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 13, -1, 21));

        supplierIdLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierIdLable.setText("Supplier ID");
        jPanel1.add(supplierIdLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        supplierIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierIdInputActionPerformed(evt);
            }
        });
        jPanel1.add(supplierIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 280, -1));

        supplierNameLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierNameLable.setText("Supplier Name");
        jPanel1.add(supplierNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        contactNumberLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberLable.setText("Conatct Number");
        jPanel1.add(contactNumberLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        supplierNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(supplierNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 280, -1));

        emailLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLable.setText("Email Address");
        jPanel1.add(emailLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
        jPanel1.add(emailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 280, -1));

        phoneNumberLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneNumberLable.setText("Address");
        jPanel1.add(phoneNumberLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        addSupplierBtn.setText("Add Supplier");
        addSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addSupplierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crochet Items Management System - Add Supplier  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 669, -1));

        contactNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberInputActionPerformed(evt);
            }
        });
        jPanel1.add(contactNumberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 280, -1));

        addressInput.setColumns(20);
        addressInput.setRows(5);
        jScrollPane1.setViewportView(addressInput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 310, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg-image1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 500));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Bashi's boutique");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameInputActionPerformed

    private void addSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierBtnActionPerformed
        sendDataToController();
        clearField();

    }//GEN-LAST:event_addSupplierBtnActionPerformed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void supplierIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierIdInputActionPerformed

    private void contactNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberInputActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSupplierBtn;
    private javax.swing.JTextArea addressInput;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField contactNumberInput;
    private javax.swing.JLabel contactNumberLable;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel phoneNumberLable;
    private javax.swing.JTextField supplierIdInput;
    private javax.swing.JLabel supplierIdLable;
    private javax.swing.JTextField supplierNameInput;
    private javax.swing.JLabel supplierNameLable;
    // End of variables declaration//GEN-END:variables
}
