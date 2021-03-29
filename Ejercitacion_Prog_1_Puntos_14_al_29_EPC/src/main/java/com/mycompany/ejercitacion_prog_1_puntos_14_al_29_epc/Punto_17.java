package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

//Importamos metodos necesarios
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_17
{
    public static void main(String[] args)
    {
        //Definimos el protocolo de entrada
        Scanner entrada=new Scanner (System.in);
        
        //Variables
        double a, b, c, d;
        
        System.out.println("--El mayor de cuatro valores--");
        
        System.out.println("Ingrese primer valor: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese segundo valor: ");
        b = entrada.nextDouble();
        
        System.out.println("Ingrese tercer valor: ");
        c = entrada.nextDouble();
        
        System.out.println("Ingrese cuarto valor: ");
        d = entrada.nextDouble();
        
        if (a>b&&a>c&&a>d)
        {
            System.out.println("El numero mas grande es: " + a);
        }
        else if (b>c&&b>d)
        {
            System.out.println("El numero mas grande es: " + b);
        }
        else if (c>d)
        {
            System.out.println("El numero mas grande es: " + c);
        }
        else
        {
            System.out.println("El numero mas grande es: " + d);
        }
        
    }
    
}
