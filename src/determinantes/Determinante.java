/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantes;

/**
 *
 * @author House
 */
public class Determinante {


    public Determinante(int orden, Integer[][] matriz){
    }
    public static Integer calcularDeterminante(Integer orden, Integer[][] matriz){
        
        Integer det = 0;
        if(orden == 1){
            //System.out.printf("\nse cumple esta madre valor : %d\n",matriz[0][0]);
            return matriz[0][0];
        }else{
            
            for(int i=0; i<orden; i++){  
                if(i%2 ==0){           
                    det += matriz[0][i]*calcularDeterminante(orden-1, obtenerAdjunto(matriz, orden, i));
                }else{
                    det += matriz[0][i]*(-1)*calcularDeterminante(orden-1, obtenerAdjunto(matriz, orden, i));
                }
            }
            return det;
        }
        
        
    }
    public static Integer[][] obtenerAdjunto(Integer[][] A, Integer orden, int posicion){
        Integer[][] adjunto = new Integer[orden-1][orden-1];
        int aux1 = 0;
        int aux2 = 0;
        for(int i=1; i< orden; i++){
                    aux2 = 0;
                    for(int j=0; j< orden; j++){
                        if(j != posicion){
                            adjunto[aux1][aux2] = A[i][j];
                            aux2++;
                        }
                    }
                    aux1++;

        }
        System.out.println("");
        for(int i=0; i<orden-1; i++){
            for(int j=0; j<orden-1; j++){
                System.out.printf("[%d] ",adjunto[i][j]);
            }
            System.out.println("");
        }
        return adjunto;
    }
}
