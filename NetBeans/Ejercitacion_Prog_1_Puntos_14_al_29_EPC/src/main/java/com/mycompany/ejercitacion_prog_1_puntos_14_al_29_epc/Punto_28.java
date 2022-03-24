package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_28
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        int dia, mes, año, dian, mesn, añon, dias_vida;
        dias_vida = 0;
        
        System.out.println("Ingrese su fecha de nacimiento:");
        do
        {
            System.out.println("Ingrese el dia:");
            dian = entrada.nextInt();
            
            if (dian<1||dian>31)
            {
                System.out.println("El dia es invalido, por favor reintente");
            }
        }while (dian<1||dian>31);
        do
        {
            System.out.println("Ingrese el mes:");
            mesn = entrada.nextInt();
            
            if (mesn<1||mesn>12)
            {
                System.out.println("El mes es invalido, por favor reintente");
            }
        }while (mesn<1||mesn>12);
        System.out.println("Año");
        añon = entrada.nextInt();
        
        System.out.println("Ingrese la fecha actual");
        do
        {
            System.out.println("Ingrese el dia:");
            dia = entrada.nextInt();
            
            if (dia<1||dia>31)
            {
                System.out.println("El dia es invalido, por favor reintente");
            }
        }while (dia<1||dia>31);
        do
        {
            System.out.println("Ingrese el mes:");
            mes = entrada.nextInt();
            
            if (mes<1||mes>12)
            {
                System.out.println("El mes es invalido, por favor reintente");
            }
        }while (mes<1||mes>12);
        System.out.println("Año");
        año = entrada.nextInt();
        
        while (true)
        {
            dia--;
            
            if (dia==0)
            {
                mes--;
                dia = 31;
            }
            
            if (mes==0)
            {
                año--;
                mes = 12;
            }
            
            dias_vida++;
            if (dian == dia && mesn == mes && añon == año)
            {
                break;
            }
        }
        
        System.out.println("Su edad es: " + dias_vida/365 + " años");
        
    }
    
}
