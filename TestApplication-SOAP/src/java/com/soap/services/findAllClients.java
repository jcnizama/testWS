package com.soap.services;

import com.soap.controllers.Controller;
import com.soap.models.Client;
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
@WebService(serviceName = "findAllClients")
public class findAllClients {
    
    Controller ctrl = new Controller();

    @WebMethod(operationName = "findAClients")
    public List<Client> findAClients() {
        try {
            return ctrl.findAClients();
        } catch (SQLException ex) {
            Logger.getLogger(findAllClients.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
