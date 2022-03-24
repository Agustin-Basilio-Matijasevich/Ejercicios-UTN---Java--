package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_47
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        char texto[] = new char [20];
        char aux[] = new char [20];
        
        for (int i = 0; i < texto.length; i++)  //Inicializa array
        {
            texto[i] = '&';
        }
        
        System.out.println("Ingrese la frase caracter por caracter (max 20), si termino ingrese &, si completo los 20 caracteres no es necesario ingresar &");
        
        for (int i = 0; i < texto.length; i++)
        {
            texto[i] = entrada.next().charAt(0);
            
            if (texto[i] == '&')
            {
                break;
            }
            
        }
        
        int j = 0;
        for (int i = texto.length-1; i >= 0; i--)
        {
            aux[j] = texto[i];
            j++;
            
        }
        
        int caracteresrelevantes = 0;
        for (int i = 0; i < texto.length; i++)
        {
            if (texto[i] != '&')
            {
                caracteresrelevantes++;
                
            }
        }
        
        char texto2[] = new char [caracteresrelevantes];
        char aux2[] = new char [caracteresrelevantes];
        
        int posicion = 0;
        for (int i = 0; i < texto.length; i++)
        {
            if (texto[i] != '&')
            {
                texto2[posicion] = texto[i];
                posicion++;
                
            }
            
        }
        
        int posicion2 = 0;
        for (int i = 0; i < aux.length; i++)
        {
            if (aux[i] != '&')
            {
                aux2[posicion2] = aux[i];
                posicion2++;
                
            }
            
        }
        
        System.out.println("Texto al derecho: " + Arrays.toString(texto2));
        System.out.println("Texto al revez: " + Arrays.toString(aux2));
        
        int palindromo = 0;
        for (int i = 0; i < texto2.length; i++)
        {
            if (texto2[i] == aux2[i])
            {
                palindromo++;
                
            }
            
        }
        
        if (palindromo == texto2.length)
        {
            System.out.println("El texto ingresado es Palindromo");
            
        }
        else
        {
            System.out.println("El texto ingresado No es Palindromo");
            
        }
        
    }
    
}
