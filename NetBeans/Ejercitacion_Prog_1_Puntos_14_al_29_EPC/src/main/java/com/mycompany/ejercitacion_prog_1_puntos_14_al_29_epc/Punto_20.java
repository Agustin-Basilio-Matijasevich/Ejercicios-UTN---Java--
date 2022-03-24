package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_20
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        int numeros;
        numeros = 3;
        double array [], aux;
        array = new double[numeros];
        
        System.out.println("Ingrese el primer numero:");
        array [0] = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        array [1] = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero:");
        array [2] = entrada.nextDouble();
        
        for (int i = 0;i<numeros;i++)
        {   
            for (int j = i+1;j<numeros;j++)
            {
                if (array[i]<array[j])
                {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        
        System.out.println("Los numeros ordenados de manera decreciente son: ");
        System.out.println(Arrays.toString(array));
        
    }
    
}
