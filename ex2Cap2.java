/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class ex2Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="";
        float saldoatual,deposito,debito;

        String nome=JOptionPane.showInputDialog("Digite seu nome: ");
        
        JOptionPane.showMessageDialog(null,"\nConta criada!\nNome: "+nome+"\nSeu saldo eh de 0 reais!");
        s=JOptionPane.showInputDialog("\nDigite o valor para ser depositado: ");
        deposito= Float.parseFloat(s);
        saldoatual=deposito;
        JOptionPane.showMessageDialog(null,"\nSeu saldo atual eh de:"+saldoatual+" reais");
        s=JOptionPane.showInputDialog("\nDigite a quantia para retirar: ");
        debito= Float.parseFloat(s);
        saldoatual=deposito-debito;
        JOptionPane.showMessageDialog(null,"\nSaldo atual de: "+saldoatual+" reais");

    }
    
}
