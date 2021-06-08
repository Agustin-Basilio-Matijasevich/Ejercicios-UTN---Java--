package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_15
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int tempF, tempC;
        
        System.out.println("Ingrese una temperatura en grados Fahrenheit: ");
        tempF = entrada.nextInt();
        
        tempC = (int) ((5.0/9) * (tempF - 32));
        
        System.out.println("La temperatura ingresada en grados Celcius es: " + tempC);
    }
    
}
