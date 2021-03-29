package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_22
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double N1, N2, N3, NF;
        NF = 0;
        
        System.out.println("Ingrese la nota del primer examen:");
        N1 = entrada.nextDouble();
        System.out.println("Ingrese la nota del segundo examen:");
        N2 = entrada.nextDouble();
        System.out.println("Ingrese la nota conceptual del profesor:");
        N3 = entrada.nextDouble();
        
        NF += 30*N1/100;
        NF += 50*N2/100;
        NF += 20*N3/100;
        
        System.out.println("La nota final es: " + NF);
        
    }
    
}
