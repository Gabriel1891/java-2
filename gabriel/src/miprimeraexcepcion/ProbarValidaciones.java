/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;



public class ProbarValidaciones {

    
    public static void main(String[] args) {
        
        int edad=15;
        System.out.println("vamos a validar tu edad");
        try {
            ValidarEdad.validar(edad);
            System.out.println("si tu te ves no se lanzo la excepcion");
        } 
        catch (MenordeEdadException ex) {
            System.out.println(ex.getMessage());
        }
        catch (NumberFormatException ex) {
                System.out.println("metiste letras y no numeros TONTO");
                }
        }
        
    }
    

