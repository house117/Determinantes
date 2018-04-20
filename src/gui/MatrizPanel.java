/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author House
 */
public class MatrizPanel extends JPanel{
    public MatrizPanel(){
        super();
        super.setBackground(Color.yellow);
        super.setLayout(null);  
    }
    public void drawMatriz(Integer[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                JLabel casilla = new JLabel();
                System.out.printf("[%d] ", matriz[i][j]);
                casilla.setText("["+matriz[i][j]+"]");
                casilla.setBounds(j*60+40, i*60+40, 100, 100);
                casilla.setForeground(Color.RED);
                casilla.setFont(new Font("Comic Sans MS", 1, 20));
                super.add(casilla);
            }
            System.out.println("");
        }
    }
}
