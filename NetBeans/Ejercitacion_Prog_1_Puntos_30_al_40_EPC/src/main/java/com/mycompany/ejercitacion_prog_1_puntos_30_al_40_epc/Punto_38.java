package com.mycompany.ejercitacion_prog_1_puntos_30_al_40_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_38
{
    public static void main(String[] args)
    {
        //Metodo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int lista[] = {43146475, 42146475, 41146475, 40146475, 39146475};
        int telefono[] = {163568, 518040, 102013, 456897, 123548};
        String apellido[] = {"Basilio", "Matijasevich", "Gonzales", "Fernandez", "Pintos"};
        String nombres[] = {"Agustin", "Lucas", "Evangelina", "Roberto", "Matias"};
        int buscar;
        int min = 0;
        int max = lista.length - 1;
        int promedio;
        int band = 0;
        
        System.out.println("Ingrese el DNI que desea buscar en la lista");
        buscar = entrada.nextInt();
        
        
        
        do
        {
            promedio = (min + max)/2;
        
            if (lista[promedio] == buscar)
            {
                band = 1;
            }
            else
            {
                if (lista[promedio] < buscar)
                {
                    max = promedio - 1;
                }
                else
                {
                    min = promedio + 1;
                }
            }
            
            if (max == min)
            {
                band = 2;
            }
            
        } while (band == 0);
        
        switch (band)
        {
            case 1:
            {
                System.out.println("El DNI fue localizado en la posicion: " + promedio);
                System.out.println("El nombre asociado es: " + nombres[promedio]);
                System.out.println("El apellido asociado es: " + apellido[promedio]);
                System.out.println("El numero de telefono asociado es: " + telefono[promedio]);
                break;
            }
            case 2:
            {
                System.out.println("El DNI no existe en la lista");
                break;
            }
        }
        
    }
    
}
