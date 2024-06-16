/*
 * To change this
license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateDeleteProducts {
         
    // Method to update a Product from the database
    public static boolean updateProduct(String productID, String productName, 
            String iSQ, String category, String perUnitSellingPrice)
            throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            
            String query = "UPDATE products SET productName=?, initialStockQuantity=?, category=?, sellingPrice=? WHERE productId=?";
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, productName);
            pstmt.setString(2, iSQ);
            pstmt.setString(3, category);
            pstmt.setString(4, perUnitSellingPrice);
            pstmt.setString(5, productID);
            
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
    
        // Method to delete a Product from the database
    public static boolean deleteProduct(String productID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            String query = "DELETE FROM products WHERE productId=?";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, productID);
            
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
