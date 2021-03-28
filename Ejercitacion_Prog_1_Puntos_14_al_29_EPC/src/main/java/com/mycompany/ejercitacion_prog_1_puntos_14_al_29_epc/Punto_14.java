package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_14
{
    public static void main(String[] args)
    {
        //Declaramos protocolo de entrada
        Scanner entrada=new Scanner(System.in);
        
        //Operacion A
        /*Se debe realizar (10x4+5)/2 una...
        ...operacion a la vez*/
        
        //Variables
        
        double a, b, c, d, resultado;
        a=10;
        b=4;
        c=5;
        d=2;
        
        System.out.println("Operacion a realizar paso a paso es igual a: (10x4+5)/2");
        System.out.println("--Inicia la Operacion ''A'' con sus valores pre-cargados--");
        //Operacion 1
        resultado=a*b;
        //Operacion 2
        resultado=resultado+c;
        //Operacion 3
        resultado=resultado/d;
        
        System.out.println("El resultado de la operacion ''A'' es: "+resultado);
        
        
        //Operacion B
        /*Se debe realizar (√[(A+B)*C]-D)/[a*(c-a)]ⁿ donde n=2
        una operacion a la vez*/
        
        //Variables
        
        //Reutilizamos "a", "c" y "resultado" de la operacion anterior
        double A, B, C, D, resultado2;
        
        //Constantes
        final int n=2;
        
        System.out.println("Operacion a realizar paso a paso igual a: (sqrt[(A+B)*C]-D)/[a*(c-a)]pow(n) donde n=2");
        System.out.println("--Inicia la operacion ''B'', por favor cargue las variables--");
        
        System.out.println("Ingrese el valor para A: ");
        A = entrada.nextFloat();
        
        System.out.println("Ingrese el valor para B: ");
        B = entrada.nextFloat();
        
        System.out.println("Ingrese el valor para C: ");
        C = entrada.nextFloat();
        
        System.out.println("Ingrese el valor para D: ");
        D = entrada.nextFloat();
        
        System.out.println("Ingrese el valor para a: ");
        a = entrada.nextFloat();
        
        System.out.println("Ingrese el valor para c: ");
        c = entrada.nextFloat();
        
        //Operacion 1
        resultado = A+B;
        //Operacion 2
        resultado = resultado*C;
        //Operacion 3
        resultado = sqrt(resultado);
        //Operacion 4
        resultado = resultado-D;
        //Operacion 5
        resultado2 = c-a;
        //Operacion 6
        resultado2 = resultado2*a;
        //Operacion 7
        resultado2 = pow(resultado2, n);
        //Operacion 8
        resultado = resultado/resultado2;
        
        System.out.println("El resultado de la operacion ''B'' es: "+resultado);
        
    }
    
}
