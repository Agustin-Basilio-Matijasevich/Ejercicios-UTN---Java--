package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_7
{
    public static void main(String[] args)
    {
        int fahrenheit;
        
        for (fahrenheit = 0; fahrenheit <= 300; fahrenheit = fahrenheit + 20)
        {
            System.out.printf("Fº = %d / Cº = %.2f\n", fahrenheit, (5.0/9)*(fahrenheit - 32));
        }
        
    }
    
}
