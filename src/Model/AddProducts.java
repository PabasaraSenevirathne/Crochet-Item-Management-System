/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

public class AddProducts {
    Statement stmt;
    
    public void Products(String productID, String productName, String iSQ, 
        String category, String perUnitSellingPrice)
    {
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO products (productId, productName, initialStockQuantity,"
                    + "category, sellingPrice) VALUES('"+ productID +"', '"+ 
                    productName +"', '"+ iSQ +"', '"+ 
                    category +"', '"+ perUnitSellingPrice +"')");
            System.out.println("Product Record added Successfull");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
