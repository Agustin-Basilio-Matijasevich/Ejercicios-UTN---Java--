package com.mycompany.experimentos.a;

import java.util.Arrays;

/**
 *
 * @author agust
 */
public class Experimentos
{
    public static void main(String[] args)
    {
        int pares [] = new int [50];
        int pos = 0;
        int cantpar = 0;
        int aux = 0;
        
        do
        {
            aux++;
            
            if (aux % 2 == 0)
            {
                pares[pos] = aux;
                pos++;
                cantpar++;
            }
            
        } while (cantpar < 50);
        
        System.out.println(Arrays.toString(pares));
        
    }
    
}
