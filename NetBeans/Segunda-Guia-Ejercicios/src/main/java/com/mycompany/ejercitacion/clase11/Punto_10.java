package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_10
{
    public static void main(String[] args)
    {
        final int intentos = 5, numero = (int) (Math.random()*(100-1+1)+1);
        
        Scanner entrada = new Scanner (System.in);
        
        int valor, cont = 1;
        String mon;
        
        System.out.println("***Bienvenido al juego de adivinanzas, debe adivinar un numero entre 1 y 100***\n\n");
        
        System.out.println("Trate de adivinar, ingrese un primer numero: ");
        valor = entrada.nextInt();
        
        do 
        {
            mon = mayor_o_menor(numero, valor);
            System.out.println("El numero ingresado es " + mon + " que el numero a adivinar");
            System.out.printf("Le quedan %d intentos\n\n", intentos - cont);
            
            if (valor != numero)
            {
                System.out.println("Ingrese otro numero: ");
                valor = entrada.nextInt();
            }
            
            cont++;
        } while (intentos - cont > 0 && valor != numero);
        
        if (valor == numero)
        {
            System.out.println("Felicidades, adivino el numero");
        }
        else
        {
            System.out.println("No pudo adivinarlo, el numero era " + numero + " , Mejor suerte la proxima");
        }
    }
    
    private static String mayor_o_menor (int base, int numero)
    {
        if (numero > base)
        {
            return "Mayor";
        }
        else if (numero < base)
        {
            return "Menor";
        }
        else
        {
            return "Igual";
        }
    }
    
}
