package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_26
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Formateo de salida
        DecimalFormat df = new DecimalFormat ("#0.00");
        
        //Constrantes
        final int precio_base = 2;
        
        //Variables
        int destino;
        double precio, extra;
        
        do
        {
            System.out.println("Ingrese el destino:");
            destino = entrada.nextInt();
            
            if (destino<1 || destino>8)
            {
                System.out.println("Valor no valido, intente nuevamente.");
            }
        }while (destino<1 || destino>8);
        
        if (destino == 1)
        {
            System.out.println("El precio del pasaje es: " + df.format(precio_base));
        }
        else
        {
            precio = precio_base;
            
            for (int i = 1;i<=8;i++)
            {
                extra = 15*precio/100;
                precio += extra;
            }
            
            System.out.println("El precio del pasaje es: " + df.format(precio));
        }
        
    }
    
}
