package com.soap.models;

import java.sql.Date;

/**
 *
 * @author jnizama
 */
public class Order {
    
    int CodOrd;
    int CodCli;
    String StsOrd;
    Date DteOrd;
    Float TotOrd ;
   
    
    public Order(){
    }
    
    public Order(int CodOrd,int CodCli,String StsOrd,Date DteOrd,Float TotOrd){
        this.CodOrd=CodOrd;
        this.CodCli=CodCli;
        this.StsOrd=StsOrd;
        this.DteOrd=DteOrd;
        this.TotOrd=TotOrd;
        
    }
}
