package com.mycompany.ejercitacion.clase11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_11
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        int array[] = new int[5];
        int arrayc[] = new int [5];
        
        System.out.println("Ingrese un arreglo de 5 numeros enteros numero por numero, el sistema le dira si el arreglo es capicua\n");
        
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Ingrese el numero %d del arreglo\n", i+1);
            array[i] = entrada.nextInt();
        }
        
        System.out.println("El arreglo es: " + Arrays.toString(array));
        
        int cont = 4;
        
        for (int i = 0; i < 5; i++)
        {
            arrayc[i] = array[cont];
            cont--;
        }
        
        System.out.println("El arreglo invertido es: " + Arrays.toString(arrayc));
        
        if (Arrays.equals(array, arrayc))
        {
            System.out.println("\n\nEl arreglo es capicua");
        }
        else
        {
            System.out.println("\n\nEl arreglo no es capicua");
        }
    }
    
}
