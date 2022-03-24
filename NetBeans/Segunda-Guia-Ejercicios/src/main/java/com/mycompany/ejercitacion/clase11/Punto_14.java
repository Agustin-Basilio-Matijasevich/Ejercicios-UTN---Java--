package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_14
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        
        if (esPrimo(num))
        {
            System.out.println("El numero ingresado es primo");
        }
        else
        {
            System.out.println("El numero ingresado no es primo");
        }
    }
    
    private static boolean esPrimo(int numero)
    {
        if (numero == 0 || numero == 1 || numero == 4)
        {
            return false;
        }
        for (int x = 2; x < numero / 2; x++)
        {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
    
}
