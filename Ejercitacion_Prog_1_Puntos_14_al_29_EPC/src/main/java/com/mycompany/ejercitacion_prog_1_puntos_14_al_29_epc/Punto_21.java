package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_21
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Formato para decimales
        DecimalFormat df = new DecimalFormat("#0.00");
        
        //Variables
        double VP1, VP2, VP3, VP4, VP5, VI, VT;
        
        System.out.println("Ingrese los votos del Partido 1:");
        VP1 = entrada.nextDouble();
        System.out.println("Ingrese los votos del Partido 2:");
        VP2 = entrada.nextDouble();
        System.out.println("Ingrese los votos del Partido 3:");
        VP3 = entrada.nextDouble();
        System.out.println("Ingrese los votos del Partido 4:");
        VP4 = entrada.nextDouble();
        System.out.println("Ingrese los votos del Partido 5:");
        VP5 = entrada.nextDouble();
        System.out.println("Ingrese los votos Indecisos:");
        VI = entrada.nextDouble();
        
        VT = VP1+VP2+VP3+VP4+VP5+VI;
        
        System.out.println("La cantidad de votos ingresados es: " + VT);
        
        System.out.println("El pocentaje de votos del Partido 1 es: %" + df.format(VP1*100/VT));
        System.out.println("El pocentaje de votos del Partido 2 es: %" + df.format(VP2*100/VT));
        System.out.println("El pocentaje de votos del Partido 3 es: %" + df.format(VP3*100/VT));
        System.out.println("El pocentaje de votos del Partido 4 es: %" + df.format(VP4*100/VT));
        System.out.println("El pocentaje de votos del Partido 5 es: %" + df.format(VP5*100/VT));
        System.out.println("El pocentaje de votos Indecisos es: %" + df.format(VI*100/VT));
        
    }
    
}
