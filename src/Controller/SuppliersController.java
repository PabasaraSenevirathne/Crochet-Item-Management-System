/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UpdateDeleteSupplier;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SuppliersController {
    
    public static void Suppliers(String supplierID, String supplierName, String contactNumber, 
        String email, String address) {
    new Model.AddSupplier().addsupplier(supplierID, supplierName, contactNumber, email, address);
    JOptionPane.showMessageDialog(null, "New Record has been inserted", 
            "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }    
    
    public static boolean updateSuppier(String supplierID, String supplierName, String contactNumber, String email, String address) {
        boolean success = false;
        try {
            success = UpdateDeleteSupplier.updateSupplier(supplierID, supplierName, contactNumber, email, address);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return success;
    }
    
    public static boolean deleteSuppier(String suppierID) throws SQLException {
        boolean success = false;
        success = UpdateDeleteSupplier.deleteSuppier(suppierID);
        return success;
    }
    
}  
