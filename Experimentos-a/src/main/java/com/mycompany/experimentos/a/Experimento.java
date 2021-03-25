/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.experimentos.a;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Experimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        int a;
        
        System.out.println("Hola Mundo\n");
        System.out.println("Que tal?");
        
        System.out.println("Ingrese a: ");
        
        a = entrada.nextInt();
        
        System.out.println("a=" + a);
    }
    
}
