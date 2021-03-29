package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_24
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double I, C, S;
        
        System.out.println("Ingrese la corriente que pasara por el conductor:");
        I = entrada.nextDouble();
        System.out.println("Ingrese la conductivilidad del material");
        C = entrada.nextDouble();
        
        S = I/C;
        
        S += 25*S/100;
        
        System.out.println("La seccion del conductor debe ser: " + S);
        
    }
    
}
