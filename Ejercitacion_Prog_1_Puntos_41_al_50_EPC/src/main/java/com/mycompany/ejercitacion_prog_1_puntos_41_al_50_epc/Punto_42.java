package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_42
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int fact;
        long resultado;
        
        System.out.println("Ingrese el numero del que quiera calcular el factorial");
        fact = entrada.nextInt();
        
        resultado = fact;
        
        for (int i = fact; i > 1; i--)
        {
            resultado = resultado * (i-1);
        }
        
        System.out.println("El factorial es: " + resultado);
        
    }
    
}
