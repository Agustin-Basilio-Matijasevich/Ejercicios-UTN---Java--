package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_2
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        final double PI = Math.PI;
        double radio, volumen, superficie;
        
        System.out.println("Ingrese el radio de una esfera: ");
        radio = entrada.nextDouble();
        
        volumen = (4/3) * PI * Math.pow(radio, 3);
        superficie = 4 * PI * Math.pow(radio, 2);
        
        System.out.println("La superficie de la esfera es: " + superficie);
        System.out.println("El volumen de la esfera es: " + volumen);
        
    }
    
}
