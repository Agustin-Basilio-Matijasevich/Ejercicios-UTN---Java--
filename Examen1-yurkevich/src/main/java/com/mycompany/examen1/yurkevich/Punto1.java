package com.mycompany.examen1.yurkevich;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto1
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Constantes
        final int base = 20;
        
        //Variables
        int KM;
        double precio;
        
        System.out.println("Ingrese los kilometros que va a recorrer: ");
        KM = entrada.nextInt();
        precio = base;
        
        if (KM<50)
        {
            for (int i = 0; i < KM; i++)
            {
                precio = precio + 2;
            }
        }
        else if (KM>=50&&KM<=500)
        {
            for (int i = 0; i < KM; i++)
            {
                precio = precio + 3;
            }
        }
        else if (KM>500)
        {
            for (int i = 0; i < KM; i++)
            {
                precio = precio + 2.5;
            }
        }
        
        System.out.println("El precio del pasaje es: " + precio);
    }
    
}
