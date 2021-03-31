package com.mycompany.ejercicios_simples_blas;

/**
 *
 * @author agust
 */
public class Operaciones_aritmetico_logicas
{
    public static void main(String[] args)
    {
        //Variables
        boolean OP;
        
        System.out.println("--Operaciones Aritmetico-Logicas--");
        System.out.println("Operacion 1: 2*6-30/50 >= 15");
        OP = 2*6-30/50 >= 15;
        System.out.println("Resultado: " + OP);
        System.out.println("Operacion 2: 15*60/20<20*60");
        OP = 15*60/20<20*60;
        System.out.println("Resultado: " + OP);
        System.out.println("Operacion 3: 14*3-10==(14*6-10)/2 AND 6/2*2 != 6*2/2");
        OP = 14*3-10==(14*6-10)/2 || 6/2*2 != 6*2/2;
        System.out.println("Resultado: " + OP);
        
    }
    
}
