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
public class Antro {

    
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Juan", 42, "jcampos@gmail.com", new Direccion("Ecatepec", 55130));
        System.out.println(u1.getDireccion().getMunicipio());
        
        
        Bebida bebida=new Bebida();
        bebida.setTipo("alcoholicas");
        String []reco= bebida.ObtenerRecomendaciones();
        for(String be:reco){
            System.out.println("Bebida: "+be);}
    }
    
}
