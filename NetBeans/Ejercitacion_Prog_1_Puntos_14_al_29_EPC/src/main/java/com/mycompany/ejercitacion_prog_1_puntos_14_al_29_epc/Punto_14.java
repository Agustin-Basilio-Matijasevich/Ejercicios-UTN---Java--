package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

//Importamos Metodos Necesarios
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
        //Se debe realizar (10x4+5)/2 una operacion a la vez
        
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
        System.out.println("Resultado de la Operacion 1: " + resultado);
        
        //Operacion 2
        resultado=resultado+c;
        System.out.println("Resultado de la Operacion 2: " + resultado);
        
        //Operacion 3
        resultado=resultado/d;
        System.out.println("Resultado de la Operacion 3: " + resultado);
        
        System.out.println("El resultado de la operacion ''A'' es: " + resultado);
        
        
        //Operacion B
        //Se debe realizar (√[(A+B)*C]-D)/[a*(c-a)]ⁿ donde n=2 una operacion a la vez
        
        //Variables
        //Reutilizamos "a", "c" y "resultado" de la operacion anterior
        double A, B, C, D, resultado2;
        
        //Constantes
        final int n=2;
        
        System.out.println("Operacion a realizar paso a paso igual a: (sqrt[(A+B)*C]-D)/[a*(c-a)]pow(n) donde n=2");
        System.out.println("--Inicia la operacion ''B'', por favor cargue las variables--");
        
        System.out.println("Ingrese el valor para A: ");
        A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para B: ");
        B = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para C: ");
        C = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para D: ");
        D = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para c: ");
        c = entrada.nextDouble();
        
        //Operacion 1
        resultado = A+B;
        System.out.println("Resultado de la Operacion 1: " + resultado);
        
        //Operacion 2
        resultado = resultado*C;
        System.out.println("Resultado de la Operacion 2: " + resultado);
        
        //Operacion 3
        resultado = sqrt(resultado);
        System.out.println("Resultado de la Operacion 3: " + resultado);
        
        //Operacion 4
        resultado = resultado-D;
        System.out.println("Resultado de la Operacion 4: " + resultado);
        
        //Operacion 5
        resultado2 = c-a;
        System.out.println("Resultado de la Operacion 5: " + resultado);
        
        //Operacion 6
        resultado2 = resultado2*a;
        System.out.println("Resultado de la Operacion 6: " + resultado);
        
        //Operacion 7
        resultado2 = pow(resultado2, n);
        System.out.println("Resultado de la Operacion 7: " + resultado);
        
        //Operacion 8
        resultado = resultado/resultado2;
        System.out.println("Resultado de la Operacion 8: " + resultado);
        
        System.out.println("El resultado de la operacion ''B'' es: " + resultado);
        
    }
    
}
