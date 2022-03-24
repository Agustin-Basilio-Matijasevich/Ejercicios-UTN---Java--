package com.mycompany.ejercitacion_prog_1_puntos_30_al_40_epc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_35
{
    public static void main(String[] args)
    {
        //protocolo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int array[] = new int[4];
        int aux;
        
        System.out.println("Ingrese el primer numero");
        array[0] = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        array[1] = entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        array[2] = entrada.nextInt();
        System.out.println("Ingrese el cuarto numero");
        array[3] = entrada.nextInt();
        
        System.out.println("Usted ingreso");
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(" " + array[i] + " ");
        }
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] < array[j+1])
                {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
                
            }
            
        }
        
        System.out.println("Los numeros ordenados de mayor a menor son: " + Arrays.toString(array));
        
    }
    
}
