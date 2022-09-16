
package com.soap.services;

import com.soap.controllers.Controller;
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
@WebService(serviceName = "findOneProducts")
public class findOneProducts {

    Controller ctrl = new Controller();

    @WebMethod(operationName = "findOProducts")
    public Product findOProducts(@WebParam(name = "CodPrd") int CodPrd) {
        try {
            return ctrl.findOProducts(CodPrd);
        } catch (SQLException ex) {
            Logger.getLogger(findOneProducts.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
