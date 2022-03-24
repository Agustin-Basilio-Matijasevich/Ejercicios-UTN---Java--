package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_17
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        Punto punto = new Punto (5, 4);
        
        System.out.println("El valor de x es: " + punto.getx() + "\nEl valor de y es: " + punto.gety());
        
        System.out.println("Ingrese un nuevo valor para x");
        punto.setx(entrada.nextDouble());
        
        System.out.println("Ingrese un nuevo valor para y");
        punto.sety(entrada.nextDouble());
        
        System.out.println("Ingrese dos coordenadas de un punto");
        
        if (punto.igual(entrada.nextDouble(), entrada.nextDouble()))
        {
            System.out.println("Los puntos son iguales");
        }
        else
        {
            System.out.println("Los puntos son diferentes");
        }
        
        System.out.println("La distancia del punto al origen de coordenadas es: " + punto.distancia());
        System.out.println("Ingrese dos coordenadas de un punto");
        System.out.println("La distancia entre el punto ingresado y el punto del objeto es: " + punto.distancia(entrada.nextDouble(), entrada.nextDouble()));
    }
    
}

class Punto
{
    private double x, y;
    
    Punto (double a, double b)
    {
        x = a;
        y = b;
    }
    
    double getx ()
    {
        return x;
    }
    
    double gety ()
    {
        return y;
    }
    
    void setx (double a)
    {
        x = a;
    }
    
    void sety (double b)
    {
        y = b;
    }
    
    boolean igual (double a, double b) //0 si no hay igual 1 si es igual a x 2 si es igual a y
    {
        return (a == x) && (b == y);
    }
    
    double distancia ()
    {
        return Math.sqrt((Math.pow(x - 0, 2)) + Math.pow(y - 0, 2));
    }
    
    double distancia (double a, double b)
    {
        return Math.sqrt((Math.pow(x - a, 2)) + Math.pow(y - b, 2));
    }
}
