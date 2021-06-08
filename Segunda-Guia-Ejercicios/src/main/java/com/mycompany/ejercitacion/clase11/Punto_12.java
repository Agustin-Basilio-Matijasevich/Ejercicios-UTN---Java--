package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_12
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        String word, word2;
        
        System.out.println("Ingrese una palabra, el sistema le dira si esa palabra es palindromo\n");
        word = entrada.nextLine();
        
        StringBuilder wordc = new StringBuilder(word);
        
        word2 = wordc.reverse().toString();
        
        System.out.println("La palabra inversa es: " + word2 + "\n\n");
        
        if (word.equals(word2))
        {
            System.out.println("La palabra es palindromo");
        }
        else
        {
            System.out.println("La palabra no es palindromo");
        }
        
    }
    
}
