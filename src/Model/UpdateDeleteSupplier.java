/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateDeleteSupplier {
    
    // Method to update Supplier information in the database
    public static boolean updateSupplier(String supplierID, String supplierName, String contactNumber, String email, String address) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            
            String query = "UPDATE suppliers SET supplierName=?, contactNumber=?, email=?, address=? WHERE supplierId=?";
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, supplierName);
            pstmt.setString(2, contactNumber);
            pstmt.setString(3, email);
            pstmt.setString(4, address);
            pstmt.setString(5, supplierID);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
        
        return success;
    }
    
    // Method to delete a supplier from the database
    public static boolean deleteSuppier(String suppierID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            String query = "DELETE FROM suppliers WHERE supplierId=?";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, suppierID);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return success;
    }
    
}
