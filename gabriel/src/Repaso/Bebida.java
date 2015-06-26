/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author T-107
 */
class Bebida {
    String tipo;
    String [] bebidas;
    
     public String[] ObtenerRecomendaciones(){
        if(tipo.equals("alcoholicas")){
        String Alcohol[]={"cerveza","tequila","cognac","vino","ron"};
        return Alcohol;
         }
        else{
        String SinAlcohol[]={"cocacola","fanta","sprite","orange","agua"};
        return SinAlcohol;
         }   
    
    
         
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    
   
    
}
