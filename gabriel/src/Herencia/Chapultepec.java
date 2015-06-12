/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;


public class Chapultepec {

   
    public static void main(String[] args) {
       // Animal raro=new Animal();
         //      raro.setEdad(2);
           //    raro.setNombre("rareza");
               
        Tortuga animal1=new Tortuga();
                animal1.setNombre("Japonesa");
                animal1.setEdad(12);
        Leon animal2=new Leon();
             animal2.setNombre("Mufasa");
             animal2.setEdad(20);
             
        Pollo p1=new Pollo();
              p1.setNombre("pollito pio");
              
        Delfin d1=new Delfin();
               d1.setNombre("Flipper");
        
        Leon l1=new Leon();
             l1.setNombre("Simba");
    
       ComportamientoRuido animales[]=new ComportamientoRuido[4];
       animales[0]=p1;
       animales[1]=d1;
       animales[2]=l1;
       animales[3]=animal2;
       
       for(ComportamientoRuido algo:animales )   
        System.out.println(algo.hacerRuido());           
    }
    
}
