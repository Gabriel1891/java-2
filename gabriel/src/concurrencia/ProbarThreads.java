/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class ProbarThreads {

  
    public static void main(String[] args) {
        //PASO 1: Creamos el thread
        PrimerThread t1= new PrimerThread();
        SegundoThread t2= new SegundoThread();
        TercerThread t3= new TercerThread();
        //PASO 2: Lo ponemos en estado inicializado
        t1.start();
        t2.start();
        t3.start();
        //PASO 3 y 4: Viene el resultado dados por le metodo run
        
        
        
    }
    
}
