/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import determinantes.Determinante;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author House
 */
public class MainFrame extends JFrame{
    private MatrizPanel matrix;
    private JPanel pnlPrueba;
    public MainFrame(Integer [][] matriz){
        super("Determinantes");
        super.setLayout(new BorderLayout());
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(350, 400);
        super.setLocationRelativeTo(null);
        
        
        
        matrix = new MatrizPanel();
        matrix.drawMatriz(matriz);
        
        
        pnlPrueba = new JPanel();
        pnlPrueba.setPreferredSize(new Dimension(350, 50));
        pnlPrueba.setBackground(Color.BLACK);
        
        JLabel respuesta = new JLabel("La respuesta es: "+Determinante.calcularDeterminante(matriz.length, matriz));
        respuesta.setFont(new Font("Arial", 1, 20));
        respuesta.setForeground(Color.WHITE);
        pnlPrueba.add(respuesta);
        super.add(matrix, BorderLayout.CENTER);
        super.add(pnlPrueba, BorderLayout.SOUTH);
        
        super.setVisible(true);
    }
}
