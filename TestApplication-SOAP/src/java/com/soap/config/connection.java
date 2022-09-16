package com.soap.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jnizama
 */
public class connection {
    Connection con = null;


    public Connection cont() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Jc73049642.");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE,null,ex);
        }

            return con;
    }    
    
    public static void main(String []args) throws SQLException{
        connection con =new connection();
        System.out.println("Successful connection"+con.cont());
    
    }
}

//             

//            System.out.println("Conection failed: " + e.getMessage());