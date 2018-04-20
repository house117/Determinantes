/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author House
 */
public class LectorDeArchivos {
    
    public static Integer[][] lee (String ruta) throws FileNotFoundException, IOException{
        
        File file = new File(ruta);
        
        FileReader lector = new FileReader(file);
        
        
        BufferedReader lectorLinea = new BufferedReader(lector);
        
        Boolean enterosLeidos = false;
        
        String linea =  lectorLinea.readLine();
        
        Scanner sc = new Scanner(linea);
        int orden;
        orden = sc.nextInt();
        
        Integer[][] matriz = new Integer[orden][orden];
        for(int i=0; i<orden; i++){
            linea = lectorLinea.readLine();
            Scanner temp = new Scanner(linea);
            for(int j=0; j<orden; j++){
                matriz[i][j] = temp.nextInt();
                System.out.printf("matriz[%d][%d]=%d\n",i, j, matriz[i][j]);
            }
            
        }
        lector.close();
        lectorLinea.close();
        
        
        return matriz;
        
    }
   
   


    
}
