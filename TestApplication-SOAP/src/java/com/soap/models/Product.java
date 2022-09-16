package com.soap.models;

/**
 *
 * @author jnizama
 */
public class Product {
    
    int CodPro;
    String NmePro;
    String CtgPro;
    float PrcPro;
    String StsPro;
    
    public Product(){
    }
    
    public Product(int CodPro,String NmePro,String CtgPro,float PrcPro,String StsPro){
        this.CodPro=CodPro;
        this.NmePro=NmePro;
        this.CtgPro=CtgPro;
        this.PrcPro=PrcPro;
        this.StsPro=StsPro;         
    }

    public int getCodPro() {
        return CodPro;
    }

    public void setCodPro(int CodPro) {
        this.CodPro = CodPro;
    }

    public String getNmePro() {
        return NmePro;
    }

    public void setNmePro(String NmePro) {
        this.NmePro = NmePro;
    }

    public String getCtgPro() {
        return CtgPro;
    }

    public void setCtgPro(String CtgPro) {
        this.CtgPro = CtgPro;
    }

    public float getPrcPro() {
        return PrcPro;
    }

    public void setPrcPro(float PrcPro) {
        this.PrcPro = PrcPro;
    }

    public String getStsPro() {
        return StsPro;
    }

    public void setStsPro(String StsPro) {
        this.StsPro = StsPro;
    }
    
    
}
