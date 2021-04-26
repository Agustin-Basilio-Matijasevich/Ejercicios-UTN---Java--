package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_46
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int numerospares = 0;
        int hastaquenum;
        
        System.out.println("Por favor ingrese hasta que numero quiere buscar pares");
        hastaquenum = entrada.nextInt();
        
        for (int i = 51; i <= hastaquenum; i++)
        {
            if (i%2 == 0)
            {
                numerospares++;
            }
        }
        
        System.out.println("Existen " + numerospares + " numeros pares desde el 51 hasta el " + hastaquenum);
        
    }
    
}
