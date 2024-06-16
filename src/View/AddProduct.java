/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ProductsController;
import javax.swing.JOptionPane;

public class AddProduct extends javax.swing.JFrame {

    /** Creates new form Products */
    public AddProduct() {
        initComponents();
    }
    
    private void sendDataToController() {
        // Get the values from the fields
        String productID = productIdInput.getText().trim();
        String productName = productNameInput.getText().trim();
        String iSQ = initialStockQuantityInput.getText().trim();
        String category = (String) productCategoryCB.getSelectedItem();
        String perUnitSellingPrice = perUnitSellingPriceInput.getText().trim();

        // Check if any of the fields are blank
        if (productID.isEmpty() || productName.isEmpty() || iSQ.isEmpty() || category == null || perUnitSellingPrice.isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Send data to the controller
            ProductsController.Products(productID, productName, iSQ, category, perUnitSellingPrice);
        }
    }
    
    public void clearField() {
        productIdInput.setText("");
        productNameInput.setText("");
        initialStockQuantityInput.setText("");
        perUnitSellingPriceInput.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productIdLabel = new javax.swing.JLabel();
        productIdInput = new javax.swing.JTextField();
        productNameLable = new javax.swing.JLabel();
        productNameInput = new javax.swing.JTextField();
        initialStockQuantityLabel = new javax.swing.JLabel();
        initialStockQuantityInput = new javax.swing.JTextField();
        categoryLable = new javax.swing.JLabel();
        productCategoryCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        perUnitSellingPriceInput = new javax.swing.JTextField();
        addProductBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crochet Items Management System - Add Product  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 676, -1));

        productIdLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productIdLabel.setText("Product ID");
        jPanel1.add(productIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
        jPanel1.add(productIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 240, -1));

        productNameLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productNameLable.setText("Product Color");
        jPanel1.add(productNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        productNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(productNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 240, -1));

        initialStockQuantityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        initialStockQuantityLabel.setText("Initial Stock Quantity");
        jPanel1.add(initialStockQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));
        jPanel1.add(initialStockQuantityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 180, 160, -1));

        categoryLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoryLable.setText("Category");
        jPanel1.add(categoryLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        productCategoryCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productCategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sweaters", "Coasters", "Amigurumi", "Bags", "Blankets", "Scarves", "Hats", "Ice Caps", "Baby Frocks", "Key Tags", "Crop tops", "Dream catchers" }));
        productCategoryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCategoryCBActionPerformed(evt);
            }
        });
        jPanel1.add(productCategoryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Per Unit Selling Price (Rs.)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        perUnitSellingPriceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perUnitSellingPriceInputActionPerformed(evt);
            }
        });
        jPanel1.add(perUnitSellingPriceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 220, 160, -1));

        addProductBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addProductBtn.setText("Add Product");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(153, 0, 0));
        CloseBtn.setText("X");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });
        jPanel1.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 13, -1, 21));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg-image1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 500));

        jMenuBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu3.setText("Bashi's boutique");
        jMenuBar2.add(jMenu3);
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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

    private void productNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameInputActionPerformed

    private void productCategoryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCategoryCBActionPerformed
        // TODO add your handling code here:
        String title = (String) productCategoryCB.getSelectedItem();
    }//GEN-LAST:event_productCategoryCBActionPerformed

    private void perUnitSellingPriceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perUnitSellingPriceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perUnitSellingPriceInputActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        sendDataToController();
        clearField();
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        dispose();
    }//GEN-LAST:event_CloseBtnMouseClicked
    
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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JLabel categoryLable;
    private javax.swing.JTextField initialStockQuantityInput;
    private javax.swing.JLabel initialStockQuantityLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField perUnitSellingPriceInput;
    private javax.swing.JComboBox<String> productCategoryCB;
    private javax.swing.JTextField productIdInput;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JTextField productNameInput;
    private javax.swing.JLabel productNameLable;
    // End of variables declaration//GEN-END:variables

}
