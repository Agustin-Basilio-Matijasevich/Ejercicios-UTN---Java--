package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_13
{
    public static void main(String[] args)
    {
        int num1 = 1, num2 = 2, num3 = 3;
        
        System.out.println("Funcion 1: " + funcion (num1, num2));
        System.out.println("Funcion 2: " + funcion (num1, num2, num3));
    }
    
    private static int funcion (int num1, int num2)
    {
        if (num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    
    private static int funcion (int num1, int num2, int num3)
    {
        if (num3 > funcion (num1, num2))
        {
            return num3;
        }
        else
        {
            return funcion (num1, num2);
        }
    }
    
}
