package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_6
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int valor;
        
        System.out.println("Ingrese un valor al cual calcularle el factorial: ");
        valor = entrada.nextInt();
        
        System.out.println("El factorial de " + valor + " es: " + factorial(valor));
        
    }
    
    private static int factorial (int valor)
    {
        if (valor == 1 || valor == 0)
        {
            return 1;
        }
        else
        {
            return valor * factorial(valor - 1);
        }
    }
    
}
