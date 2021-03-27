package com.mycompany.experimentos.a;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Hola
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        
        int a;
        
        System.out.println("Hola Mundo\n");
        System.out.println("Que tal?");
        
        System.out.println("Ingrese a: ");
        
        a = entrada.nextInt();
        
        System.out.println("a=" + a);
    }
    
}
