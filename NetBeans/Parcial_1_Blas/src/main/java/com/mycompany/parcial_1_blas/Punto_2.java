package com.mycompany.parcial_1_blas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_2
{
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        // Variables locales
        int dia, bkp;
        String dia_semana = "NULL";
        
        do  //  Conseguir el dia
        {
            System.out.println("Ingrese el dia del año:");
            
            try
            {
                dia = entrada.nextInt();
            }
            catch (InputMismatchException ime)
            {
                entrada.next();
                dia = -1;
            }
            
            if (dia < 1 || dia > 366)
            {
                System.out.println("Dia invalido, por favor reintente");
            }
            
        } while (dia < 1 || dia > 366);
        
        bkp = dia;
        dia = dia%7;
        
        switch (dia)
        {
            case 1:
            {
                dia_semana = "Lunes";
                break;
            }
            case 2:
            {
                dia_semana = "Martes";
                break;
            }
            case 3:
            {
                dia_semana = "Miercoles";
                break;
            }
            case 4:
            {
                dia_semana = "Jueves";
                break;
            }
            case 5:
            {
                dia_semana = "Viernes";
                break;
            }
            case 6:
            {
                dia_semana = "Sabado";
                break;
            }
            case 0:
            {
                dia_semana = "Domingo";
                break;
            }
        }
        
        System.out.println("El dia " + bkp + " sera un " + dia_semana);
        
    }
    
}
