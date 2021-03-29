package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_23
{
    public static void main(String[] args)
    {
        //Protocolo de entrda
        Scanner entrada = new Scanner(System.in);
        
        //Constantes
        final double interes_dia = 0.05;
        final double gastos = 0.5;
        
        //Variables
        double capital_inicial, capital_interes, diferencia, interes_dia_plata;
        int dias_anticipo;
        
        System.out.println("Ingrese el capital inicial:");
        capital_inicial = entrada.nextDouble();
        
        System.out.println("Ingrese el capital con intereses:");
        capital_interes = entrada.nextDouble();
        
        System.out.println("Ingrese los dias de anticipo:");
        dias_anticipo = entrada.nextInt();
        
        interes_dia_plata = interes_dia * capital_inicial / 100;
        diferencia = capital_interes - capital_inicial;
        
        diferencia -= interes_dia_plata * dias_anticipo;
        diferencia -= gastos;
        
        System.out.println("El monto a liquidar es: " + diferencia);
        
    }
    
}
