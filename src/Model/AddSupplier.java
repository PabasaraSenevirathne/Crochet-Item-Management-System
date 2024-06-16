/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

public class AddSupplier {
    Statement stmt;

    public void addsupplier(String supplierID, String supplierName, String contactNumber, 
        String email, String address) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate(
                "INSERT INTO suppliers (supplierId, supplierName, contactNumber, email, "
                        + "address) VALUES('"+ supplierID + "', '"
                        + supplierName + "', '"+ contactNumber + "', '"+ email + "', '"
                + address + "')"
            );
        System.out.println("Supplier Record added Successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
