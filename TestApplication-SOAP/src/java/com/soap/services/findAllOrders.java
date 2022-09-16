
package com.soap.services;

import com.soap.controllers.Controller;
import com.soap.models.Order;
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
@WebService(serviceName = "findAllOrders")
public class findAllOrders {
    
Controller ctrl = new Controller();
    
    @WebMethod(operationName = "findAOrders")
    public List<Order> findAOrders() {
        try {
            return ctrl.findAOrders();
        } catch (SQLException ex) {
            Logger.getLogger(findAllOrders.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

