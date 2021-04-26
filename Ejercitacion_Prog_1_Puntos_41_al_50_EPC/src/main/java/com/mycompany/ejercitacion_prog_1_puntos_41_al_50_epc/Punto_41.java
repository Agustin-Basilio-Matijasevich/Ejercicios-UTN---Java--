package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */

public class Punto_41
{
    public static int busqueda_binaria_array (int buscar, int array[])
    {
        //Busqueda binaria de un entero en una lista ordenada, pide lista ordenada y numero a buscar, devuelve la posicion en la lista del numero o -1 si no existe
        
        //variables
        int posicion = 0, min = 0, max = array.length -1, master = 0;
        
        //determinar como esta ordenada la lista
        posicion = (min+max)/2;
        
        if (array[posicion] < array[posicion+1])  //Orden de menor a mayor
        {
            while (master == 0)
            {
                posicion = (min+max)/2;
            
                if (array[posicion] == buscar)
                {
                    master = 1;
                    
                }
                else
                {
                    if (array[posicion] < buscar)
                    {
                        min = posicion+1;
                        
                    }
                    else
                    {
                        max = posicion-1;
                        
                    }
                    
                }
                
                if (min == max)
                {
                    master = -1;
                    
                }
            
            }
            
        }
        else  //Orden de mayor a menor
        {
            while (master == 0)
            {
                posicion = (min+max)/2;
            
                if (array[posicion] == buscar)
                {
                    master = 1;
                    
                }
                else
                {
                    if (array[posicion] < buscar)
                    {
                        max = posicion-1;
                        
                    }
                    else
                    {
                        min = posicion+1;
                        
                    }
                    
                }
                
                if (min == max)
                {
                    master = -1;
                    
                }
            
            }
            
        }
        
        if (master == 1)
        {
            return posicion;
        }
        else
        {
            return master;
        }
        
    }
    
    public static void main(String[] args)
    {
        //Metodo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int lista[] = {43146475, 42146475, 41146475, 40146475, 39146475};
        int telefono[] = {163568, 518040, 102013, 456897, 123548};
        String apellido[] = {"Basilio", "Matijasevich", "Gonzales", "Fernandez", "Pintos"};
        String nombres[] = {"Agustin", "Lucas", "Evangelina", "Roberto", "Matias"};
        int buscar = 0;
        int resultado;
        boolean inputerror = false;
        
        do
        {
            inputerror = false;
            
            System.out.println("Ingrese el DNI que desea buscar: ");
        
            try
            {
                buscar = entrada.nextInt();
                
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Un DNI no puede tener letras o simbolos, Por favor, reintente");
                inputerror = true;
                entrada.next();
                
            }
            
        } while (inputerror);
        
        resultado = busqueda_binaria_array (buscar, lista);
        
        if (resultado == -1)
        {
            System.out.println("No existe el DNI especificado en la lista");
            
        }
        else
        {
            System.out.println("El DNI fue localizado en la posicion: " + resultado);
            System.out.println("El nombre asociado es: " + nombres[resultado]);
            System.out.println("El apellido asociado es: " + apellido[resultado]);
            System.out.println("El numero de telefono asociado es: " + telefono[resultado]);
            
        }
        
    }
}
