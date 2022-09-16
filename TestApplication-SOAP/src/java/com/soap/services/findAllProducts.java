package com.soap.services;

import com.soap.controllers.Controller;
import com.soap.models.Product;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author jnizama
 */
@WebService(serviceName = "findAllProducts")
public class findAllProducts {

    Controller ctrl = new Controller();
    
    @WebMethod(operationName = "findAProducts")
    public List<Product> findAProducts() {
        try {
            return ctrl.findAProducts();
        } catch (SQLException ex) {
            Logger.getLogger(findAllProducts.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
