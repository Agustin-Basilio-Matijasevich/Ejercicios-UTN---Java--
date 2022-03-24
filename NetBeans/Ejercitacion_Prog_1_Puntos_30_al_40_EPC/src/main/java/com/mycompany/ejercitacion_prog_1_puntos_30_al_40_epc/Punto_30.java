package com.mycompany.ejercitacion_prog_1_puntos_30_al_40_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_30
{
    public static void main(String[] args)
    {
        //Declaraamos protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        int bas, exp, res;
        
        System.out.println("--Bienvenido a la calculadora de potencias (enteros positivos)--");
        
        System.out.println("Ingrese la base:");
        bas = entrada.nextInt();
        System.out.println("Ingrese el exponente:");
        exp = entrada.nextInt();
        
        res = bas;
        
        for (int i = 1; i < exp; i++)
        {
            res = res*bas;
        }
        
        if (exp == 0)
        {
            res = 1;
        }
        
        System.out.println("El resultado de la potencia es: " + res);
        
    }
    
}
