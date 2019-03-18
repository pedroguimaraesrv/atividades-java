/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ex3Cap2 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            float altura,peso,imc;
            
            System.out.println("Qual sua altura? ");
            altura=sc.nextFloat();
            System.out.println("Qual seu peso? ");
            peso=sc.nextFloat();
            
            imc=peso/(altura*altura);
            
            if(imc < 18.5)
                System.out.println("Peso abaixo do normal!");
            if(imc >= 18.5 && imc <= 24.4)
                System.out.println("Peso ideal!");
            if(imc >= 24.5 && imc <= 29.9 )
                System.out.println("Pré-obesidade!");
            if(imc >= 30 && imc <= 34.9)
                System.out.println("Obesidade classe I");
            if(imc >= 35 && imc <= 39.9)
                System.out.println("Obesidade classe II (severa)");
            if(imc >= 39.9)
                System.out.println("Obesidade classe III (morbida)");
            
            
        }
                
}
