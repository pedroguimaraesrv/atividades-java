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
public class ex5Cap2 {
    public static void main(String[] args){
        String s="";
        float bytes,segundos;
        
        s=JOptionPane.showInputDialog("Digite qual o tamanho do arquivo em bytes: ");
        bytes=Float.parseFloat(s);
        segundos=bytes/262144;
        JOptionPane.showMessageDialog(null,"Tamanho do arquivo em bytes: "+bytes+"\nLevara: "+segundos+""
                + " segundos para baixar o arquivo!");
    }
    
}
