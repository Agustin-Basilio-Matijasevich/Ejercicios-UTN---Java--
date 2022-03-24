package com.mycompany.ejercicios_simples_blas;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Saludo
{
    public static void main(String[] args)
    {
        //Variables
        String saludo;
        
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un saludo");
        saludo = entrada.nextLine();
        
        System.out.println("Su saludo es: ");
        System.out.println(saludo);
        
    }
    
}
