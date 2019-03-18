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
public class ex4Cap2 {
    public static void main(String[] args){
        String s="";
        
        float v1,v2,soma,sub,mult,div;
        
        s= JOptionPane.showInputDialog("Digite o primeiro numero: ");
        v1=Float.parseFloat(s);
        
        s=JOptionPane.showInputDialog("Digite o segundo numero: ");
        v2=Float.parseFloat(s);
        
        soma=v1+v2;
        mult=v1*v2;
        div=v1/v2;
        sub=v1-v2;
        JOptionPane.showMessageDialog(null,"A 4 operacoes entre os 2 numeros: \nSoma: "+
                soma+"\nSubtracao: "+sub+"\nMultiplicacao: "+mult+"\nDivisao: "+div);
        
    }
}
