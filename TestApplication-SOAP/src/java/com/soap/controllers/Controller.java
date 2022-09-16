package com.soap.controllers;

import com.soap.config.connection;
import com.soap.models.Client;
import com.soap.models.Order;
import com.soap.models.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jnizama
 */
public class Controller extends connection {
    
    Connection con =null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Client>findAClients () throws SQLException{
        try {
            String sql = "select * from clients";
            List<Client> findAClients = new ArrayList<>();

            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Client cli=new Client(rs.getInt(1),rs.getString(2),rs.getString(3));
                findAClients.add(cli);
            
            }
            return findAClients;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

            
    }
    
    public Client findOClients (int CodCli) throws SQLException{
        try {
            String sql = "select * from clients where CodCLi="+CodCli+"";

            Client cli=null;
            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                cli=new Client(rs.getInt(1),rs.getString(2),rs.getString(3));
           
            }
            return cli;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

        
    }
    
    public List<Product>findAProducts () throws SQLException{
        try {
            String sql = "select * from products";
            List<Product> findAProducts = new ArrayList<>();

            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Product pro=new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getString(5));
                findAProducts.add(pro);
          
            }
            return findAProducts;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

            
    }
    
    public Product findOProducts (int CodPro) throws SQLException{
        try {
            String sql = "select * from products where CodPro="+CodPro+"";

            Product pro=null;
            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                pro=new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getString(5));
           
            }
            return pro;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

        
    }
 
    public List<Order>findAOrders () throws SQLException{
        try {
            String sql = "select * from orders";
            List<Order> findAOrders = new ArrayList<>();

            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Order ord=new Order(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4),rs.getFloat(5));
                findAOrders.add(ord);
            
            }
            return findAOrders;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

            
    }
    
    public Order findOOrders (int CodOrd) throws SQLException{
        try {
            String sql = "select * from orders where CodOrd="+CodOrd+"";

            Order ord=null;
            con = cont();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                ord=new Order(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDate(4),rs.getFloat(5));
           
            }
            return ord;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        finally{
        rs.close();
        ps.close();
        con.close();
        }

        
    }
}
