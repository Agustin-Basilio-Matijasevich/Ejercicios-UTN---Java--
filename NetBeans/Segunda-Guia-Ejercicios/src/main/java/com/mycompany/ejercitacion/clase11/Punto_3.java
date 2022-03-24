package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_3
{
    public static void main(String[] args)
    {
        double num1, num2;
        num1 = Math.random();
        num2 = Math.random();
        
        if (num1 > num2)
        {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        }
        else if (num1 < num2)
        {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        }
        else
        {
            System.out.println("Son iguales");
        }
        
    }
    
}
