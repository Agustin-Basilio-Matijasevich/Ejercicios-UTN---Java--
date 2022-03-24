package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        char operacion;
        int valor1, valor2, resultado;
        
        System.out.println("Seleccione una opcion ingresando el valor indicado.");
        System.out.println("Ingrese 'S' o 's' para realizar una suma.");
        System.out.println("Ingrese 'R' o 'r' para realizar una resta.");
        System.out.println("Ingrese 'P' o 'p' o 'M' o 'm' para realizar una multiplicacion");
        System.out.println("Ingrese 'D' o 'd' para realizar una division");
        operacion = entrada.next().charAt(0);
        
        switch (operacion)
        {
            case 'S', 's' ->
            {
                System.out.println("Ingrese el primer numero a sumar: ");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero a sumar: ");
                valor2 = entrada.nextInt();
                resultado = valor1 + valor2;
                System.out.println("El primer numero mas el segundo numero da como resultado: " + resultado);
            }
            case 'R', 'r' ->
            {
                System.out.println("Ingrese el primer numero a restar: ");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero a restar: ");
                valor2 = entrada.nextInt();
                resultado = valor1 - valor2;
                System.out.println("El primer numero menos el segundo numero da como resultado: " + resultado);
            }
            case 'P', 'p', 'M', 'm' ->
            {
                System.out.println("Ingrese el primer numero a multiplicar: ");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero a multiplicar: ");
                valor2 = entrada.nextInt();
                resultado = valor1 * valor2;
                System.out.println("El primer numero multiplicado por el segundo numero da como resultado: " + resultado);
            }
            case 'D', 'd' ->
            {
                System.out.println("Ingrese el primer numero a dividir: ");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero a dividir: ");
                valor2 = entrada.nextInt();
                resultado = valor1 / valor2;
                System.out.println("El primer valor dividido por el segundo valor da como resultado: " + resultado);
            }
            default ->
            {
                System.out.println("Opcion invalida.");
            }
        }
        
    }
    
}
