package com.mycompany.parcial_1_blas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_1
{
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        // Variables locales
        int parcial_1[] = new int[10];
        int parcial_2[] = new int [10];
        String condicion[] = new String [10];
        int ID;
        int suma;
        int aprobados = 0;
        int reprobados;
        
        for (int i = 0; i < 10; i++)  //  Carga de notas
        {
            ID = i+1;
            
            do  //  Parcial 1
            {
                System.out.println("Ingrese la nota del parcial 1 del alumno " + ID + " (Valores entre 0 y 100):");
                
                try
                {
                    parcial_1[i] = entrada.nextInt();
                }
                catch (InputMismatchException ime)
                {
                    entrada.next();
                    parcial_1[i] = -1;
                }
                
                if (parcial_1[i] < 0 || parcial_1[i] > 100)
                {
                    System.out.println("Valor de nota invalido, por favor reintente");
                }
                
            } while (parcial_1[i] < 0 || parcial_1[i] > 100);
            
            do  //  Parcial 2
            {
                System.out.println("Ingrese la nota del parcial 2 del alumno " + ID + " (Valores entre 0 y 100):");
                
                try
                {
                    parcial_2[i] = entrada.nextInt();
                }
                catch (InputMismatchException ime)
                {
                    entrada.next();
                    parcial_2[i] = -1;
                }
                
                if (parcial_2[i] < 0 || parcial_2[i] > 100)
                {
                    System.out.println("Valor de nota invalido, por favor reintente");
                }
                
            } while (parcial_2[i] < 0 || parcial_2[i] > 100);
            
        }  //  Fin carga notas
        
        for (int i = 0; i < 10; i++)  //  Asignar Condicion
        {
            suma = 0;
            
            suma += parcial_1[i];
            suma += parcial_2[i];
            
            suma = suma/2;
            
            if (suma >= 60)
            {
                condicion[i] = "Aprobado";
            }
            else
            {
                condicion[i] = "Desaprobado";
            }
            
        }  //  Fin asignar condicion
        
        for (int i = 0; i < 10; i++)  //  Contar aprobados
        {
            if ("Aprobado".equals(condicion[i]))
            {
                aprobados++;
            }
        }
        
        reprobados = 10 - aprobados;
        
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
        
    }
    
}
