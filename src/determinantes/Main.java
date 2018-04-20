/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantes;

import gui.MainFrame;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author House
 */
public class Main {
    public static void main(String[] args) {
        //pichon();
        grafico();
    }
    public static void grafico(){
        Integer [][] matriz;
        Integer resultado;
        try {
            matriz = LectorDeArchivos.lee("prueba.txt");
            MainFrame ventana = new MainFrame(matriz);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void pichon(){
        Scanner sc = new Scanner(System.in);
        
        Integer resultado;
        System.out.println("Ingresa el orden: ");
        Integer orden = sc.nextInt();
        Integer[][] prueba = new Integer[orden][orden];
        for(int i=0; i<orden;i++){
            for(int j=0; j<orden; j++){
                System.out.printf("\nIngresa dato a[%d][%d]: ", i, j);
                prueba[i][j] = sc.nextInt();
            }
        }
 
        resultado = Determinante.calcularDeterminante(orden, prueba);
        System.out.printf("\nresultado = %d", resultado);
    }
}
