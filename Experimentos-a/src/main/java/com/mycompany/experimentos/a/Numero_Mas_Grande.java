package com.mycompany.experimentos.a;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Numero_Mas_Grande
{
    public static void main(String[] args) 
    {
        Scanner entrada=new Scanner(System.in);
        
        int a,b;
        
        System.out.println("Ingrese primer valor");
        a = entrada.nextInt();
        
        System.out.println("Ingrese segundo valor");
        b = entrada.nextInt();
        
        if (a<b)
        {
            System.out.println("El numero mas grande de los que ingreso es: " + b);
        }
        else
        {
            System.out.println("El numero mas grande de los que ingreso es: " + a);
        }
    }
    
}
