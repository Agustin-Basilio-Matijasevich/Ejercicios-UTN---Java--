package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

//Importamos Metodos Necesarios
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_15
{
    public static void main(String[] args)
    {
        //Declaramos Protocolo de entrada
        Scanner entrada=new Scanner(System.in);
        
        //Variables
        int a,b,c;
        
        System.out.println("--Que tipo de triangulo es--");
        
        System.out.println("Ingrese longitud del primer lado: ");
        a = entrada.nextInt();
        
        System.out.println("Ingrese longitud del segundo lado: ");
        b = entrada.nextInt();
        
        System.out.println("Ingrese longitud del tercer lado: ");
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
