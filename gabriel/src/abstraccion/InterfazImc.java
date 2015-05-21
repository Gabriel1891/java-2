/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
    public static void main (String []oso){
    
        float peso=84;
        float altura=1.68f;
        
        // apliamos formula
        float imc=peso/(altura*altura);
        
        System.out.println("Tu imc es:" + imc);
               
    
    }
}
