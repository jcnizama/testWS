package com.soap.services;

import com.soap.controllers.Controller;
import com.soap.models.Client;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author shoes
 */
@WebService(serviceName = "findOneClients")
public class findOneClients {

     Controller ctrl = new Controller();

    @WebMethod(operationName = "findOClients")
    public Client findOClients(@WebParam(name = "CodCli") int CodCli) {
        try {
            return ctrl.findOClients(CodCli);
        } catch (SQLException ex) {
            Logger.getLogger(findOneClients.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
