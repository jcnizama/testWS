package com.soap.services;

import com.soap.controllers.Controller;
import com.soap.models.Order;
import com.soap.models.Product;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jnizama
 */
@WebService(serviceName = "findOneOrders")
public class findOneOrders {

     Controller ctrl = new Controller();

    @WebMethod(operationName = "findOOrders")
    public Order findOOrders(@WebParam(name = "CodOrd") int CodOrd) {
        try {
            return ctrl.findOOrders(CodOrd);
        } catch (SQLException ex) {
            Logger.getLogger(findOneProducts.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
