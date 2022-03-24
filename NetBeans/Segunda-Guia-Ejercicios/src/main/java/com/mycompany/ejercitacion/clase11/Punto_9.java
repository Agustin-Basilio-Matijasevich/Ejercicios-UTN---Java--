package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_9
{
    public static void main(String[] args)
    {
        double cont = 2, num1 = 0, num2 = 1, aux;
        
        System.out.println("***Serie Fibonacci***\n\n");
        
        System.out.print("{0, 1");
        
        while (cont < 49)
        {
            System.out.printf(", %.0f", num1 + num2);
            aux = num2;
            num2 = num1 + num2;
            num1 = aux;
            cont++;
        }
        System.out.println("}");
    }
    
}
