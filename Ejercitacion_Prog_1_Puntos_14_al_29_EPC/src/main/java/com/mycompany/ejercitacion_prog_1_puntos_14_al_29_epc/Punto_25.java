package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_25
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        double KM;
        
        System.out.println("Ingrese los kilometros que va a recorrer: ");
        KM = entrada.nextDouble();
        
        if (KM<=10)
        {
            System.out.println("El precio del peaje es: $2");
        }
        else if (KM<=20)
        {
            System.out.println("El precio del peaje es: $3");
        }
        else if (KM<=40)
        {
            System.out.println("El precio del peaje es: $4");
        }
        else if (KM<=80)
        {
            System.out.println("El precio del peaje es: $5");
        }
    }
    
}
