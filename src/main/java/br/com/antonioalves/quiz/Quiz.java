/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.antonioalves.quiz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author professor
 */
public class Quiz {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Bora jogar!");
        FrmJogo jogo = new FrmJogo();
        jogo.setLocationRelativeTo(jogo);
        jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jogo.setVisible(true);
    }
}
