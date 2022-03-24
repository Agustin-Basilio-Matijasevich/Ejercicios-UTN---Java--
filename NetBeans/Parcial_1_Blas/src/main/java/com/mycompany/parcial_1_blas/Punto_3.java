package com.mycompany.parcial_1_blas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_3
{
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        // Variables Locales
        int suma = 0, ingreso = 0, cont = -1, promedio;
        
        do
        {
            cont++;
            suma += ingreso;
            
            System.out.println("Ingrese un sueldo:");
            
            try
            {
                ingreso = entrada.nextInt();
            }
            catch (InputMismatchException ime)
            {
                entrada.next();
                ingreso = -1;
            }
            
        } while (ingreso >= 20000 && ingreso <= 100000);
        
        promedio = suma / cont;
        
        System.out.println("El promedio de sueldos es: " + promedio);
        
    }
    
}
