package com.mycompany.experimentos.a;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Que_tipo_de_triangulo_es
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Ingrese primer valor");
        a = entrada.nextInt();
        
        System.out.println("Ingrese segundo valor");
        b = entrada.nextInt();
        
        System.out.println("Ingrese tercer valor");
        c = entrada.nextInt();
        
        if (a==b&&b==c)
        {
            System.out.println("Es un triangulo Equilatero");
        }
        else if (a==b||b==c||a==c)
        {
            System.out.println("Es un triangulo Isoceles");
        }
        else
        {
            System.out.println("Es un triangulo Escaleno");
        }
    }
    
}
