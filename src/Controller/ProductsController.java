/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UpdateDeleteProducts;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductsController {
    
public static void Products(String productID, String productName, String iSQ, 
        String category, String perUnitSellingPrice) {
    new Model.AddProducts().Products(productID, productName, iSQ, category, perUnitSellingPrice);
    JOptionPane.showMessageDialog(null, "New Record has been inserted", 
            "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean updateProduct(String productID, String productName, 
            String iSQ, String category, String perUnitSellingPrice) throws 
            SQLException {boolean success = false;
            success = UpdateDeleteProducts.updateProduct(productID, productName, iSQ, category, perUnitSellingPrice);
            return success;
        }
    
    public static boolean deleteProduct(String productID) throws SQLException {
        boolean success = false;
        success = UpdateDeleteProducts.deleteProduct(productID);
        return success;
    }
    
}
