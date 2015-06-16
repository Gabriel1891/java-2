/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chekedexceptions;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Probarcheked {


    public static void main(String[] args) throws  Exception{
        File f=new File("archivaldo");                //crea un archivo
        
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
      
    }
    
}
