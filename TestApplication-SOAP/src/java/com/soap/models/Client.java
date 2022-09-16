package com.soap.models;

/**
 *
 * @author jnizama
 */
public class Client {
    
    int CodCli;
    String FnmCli;
    String LnmCli;
    
    public Client(){
    }
    
    public Client(int CodCli,String FnmCli,String LnmCli){
        this.CodCli=CodCli;
        this.FnmCli=FnmCli;
        this.LnmCli=LnmCli;
        
        
    }

    public int getCodCli() {
        return CodCli;
    }

    public void setCodCli(int CodCli) {
        this.CodCli = CodCli;
    }

    public String getFnmCli() {
        return FnmCli;
    }

    public void setFnmCli(String FnmCli) {
        this.FnmCli = FnmCli;
    }

    public String getLnmCli() {
        return LnmCli;
    }

    public void setLnmCli(String LnmCli) {
        this.LnmCli = LnmCli;
    }
    
}


