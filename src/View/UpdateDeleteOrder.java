/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.OrdersController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class UpdateDeleteOrder extends javax.swing.JFrame {

    /** Creates new form Orders */
    private DBSearch dbSearch;

    public UpdateDeleteOrder() {
        initComponents();
        dbSearch = new DBSearch();

    }
    
    private String getSelectedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // Set to yyyy-MM-dd format
        if (ODInput.getDate() != null) {
            return sdf.format(ODInput.getDate());
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid date.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
      
    public void clearField() {
        orderIDInput.setText("");
        customerNameInput.setText("");
        QuantityInput.setText("");
        ProductInput.setText("");
        ODInput.setDate(null);
        PriceInput.setText("");
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
        CloseBtn = new javax.swing.JLabel();
        getOrderDataBtn = new javax.swing.JButton();
        DeleteOrderBtn = new javax.swing.JButton();
        UpdateOrderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orderIDInput = new javax.swing.JTextField();
        customerNameInput = new javax.swing.JTextField();
        ProductInput = new javax.swing.JTextField();
        QuantityInput = new javax.swing.JTextField();
        PriceInput = new javax.swing.JTextField();
        orderIDLabel = new javax.swing.JLabel();
        OrderNameLable = new javax.swing.JLabel();
        ProductLable = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        OrderDateLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ODInput = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(153, 51, 0));
        CloseBtn.setText("X");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });
        jPanel1.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 13, -1, 21));

        getOrderDataBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getOrderDataBtn.setText("Get Data");
        getOrderDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOrderDataBtnActionPerformed(evt);
            }
        });
        jPanel1.add(getOrderDataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        DeleteOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DeleteOrderBtn.setText("Delete Order Details");
        DeleteOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        UpdateOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UpdateOrderBtn.setText("Update Order Details");
        UpdateOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crochet Items Management System - Update & Delete Order");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 678, -1));
        jPanel1.add(orderIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 80, 140, -1));

        customerNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(customerNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 260, -1));

        ProductInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductInputActionPerformed(evt);
            }
        });
        jPanel1.add(ProductInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 290, -1));
        jPanel1.add(QuantityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 290, -1));
        jPanel1.add(PriceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 290, -1));

        orderIDLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        orderIDLabel.setText("Order ID ");
        jPanel1.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        OrderNameLable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OrderNameLable.setText("Customer Name ");
        jPanel1.add(OrderNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        ProductLable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ProductLable.setText("Product");
        jPanel1.add(ProductLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        QuantityLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        QuantityLabel.setText("Quantity");
        jPanel1.add(QuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PriceLabel.setText("Price");
        jPanel1.add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        OrderDateLable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OrderDateLable.setText("Order Date");
        jPanel1.add(OrderDateLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bg-image2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 500));

        ODInput.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(ODInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 290, -1));

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

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        dispose();
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void getOrderDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOrderDataBtnActionPerformed
        try {
            String orderID = orderIDInput.getText().trim();

            if (orderID == null) {
                JOptionPane.showMessageDialog(this, "Please Type a orderID.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ResultSet resultSet = dbSearch.searchOrdersDetailsByID(orderID);

            if (resultSet != null && resultSet.next()) {
                customerNameInput.setText(resultSet.getString("customerName"));
                ProductInput.setText(resultSet.getString("product"));
                QuantityInput.setText(resultSet.getString("quantity"));
                PriceInput.setText(resultSet.getString("price"));
                
                String dateString = resultSet.getString("orderDate");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                try {
                    Date date = dateFormat.parse(dateString);
                    ODInput.setDate(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Invalid date format in database.", "Error", JOptionPane.ERROR_MESSAGE);
                }


            } else {
                JOptionPane.showMessageDialog(this, "No Order found for the Typed orderID.", "No Data", JOptionPane.INFORMATION_MESSAGE);
            }

            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while searching for Orders.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_getOrderDataBtnActionPerformed

    private void DeleteOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderBtnActionPerformed
            String orderID = orderIDInput.getText().trim();

        if (orderID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Orders OrderID must be filled out",
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Confirm with the user before deleting
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Order Details?",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            // If user confirms deletion
            if (confirmation == JOptionPane.YES_OPTION) {
                try {
                    boolean success = OrdersController.deleteOrder(orderID);

                    if (success) {
                        JOptionPane.showMessageDialog(null, "Order Details deleted successfully",
                            "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
                        // Clear the input fields after successful deletion
                        clearField();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete Order",
                            "Deletion Failed", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    // Handle SQL exception
                    JOptionPane.showMessageDialog(null, "An error occurred while deleting Order",
                        "Deletion Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_DeleteOrderBtnActionPerformed

    private void UpdateOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOrderBtnActionPerformed
        // Get the values from the fields
        String orderID = orderIDInput.getText().trim();
        String customerName = customerNameInput.getText().trim();
        String product = ProductInput.getText().trim();
        String quantity = QuantityInput.getText().trim();
        String price = PriceInput.getText().trim();
        String orderDate = getSelectedDate();

        // Check if any of the fields are blank
        if (orderID.isEmpty() || customerName.isEmpty() || product.isEmpty() 
                || quantity.isEmpty() || price.isEmpty() || orderDate.isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {

            boolean success = false;
            try {
                success = OrdersController.updateOrder(orderID, customerName, product, 
                    quantity, price, orderDate);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            if (success) {
                JOptionPane.showMessageDialog(null, "Order information updated successfully",
                    "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                clearField();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update Order information",
                    "Update Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UpdateOrderBtnActionPerformed

    private void customerNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInputActionPerformed

    private void ProductInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductInputActionPerformed
    
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
            java.util.logging.Logger.getLogger(UpdateDeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton DeleteOrderBtn;
    private com.toedter.calendar.JDateChooser ODInput;
    private javax.swing.JLabel OrderDateLable;
    private javax.swing.JLabel OrderNameLable;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField ProductInput;
    private javax.swing.JLabel ProductLable;
    private javax.swing.JTextField QuantityInput;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JButton UpdateOrderBtn;
    private javax.swing.JTextField customerNameInput;
    private javax.swing.JButton getOrderDataBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField orderIDInput;
    private javax.swing.JLabel orderIDLabel;
    // End of variables declaration//GEN-END:variables

}
