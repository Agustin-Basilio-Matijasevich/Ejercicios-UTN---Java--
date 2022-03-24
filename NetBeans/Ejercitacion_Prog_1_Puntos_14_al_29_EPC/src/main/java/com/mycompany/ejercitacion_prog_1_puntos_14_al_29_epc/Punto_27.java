package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_27
{
    public static String mes_a_texto (int mes)
    {
        String mes_texto;
        
        switch (mes)
        {
            case 1:
            {
                mes_texto = "Enero";
                break;
            }
            case 2:
            {
                mes_texto = "Febrero";
                break;
            }
            case 3:
            {
                mes_texto = "Marzo";
                break;
            }
            case 4:
            {
                mes_texto = "Abril";
                break;
            }
            case 5:
            {
                mes_texto = "Mayo";
                break;
            }
            case 6:
            {
                mes_texto = "Junio";
                break;
            }
            case 7:
            {
                mes_texto = "Julio";
                break;
            }
            case 8:
            {
                mes_texto = "Agosto";
                break;
            }
            case 9:
            {
                mes_texto = "Septiembre";
                break;
            }
            case 10:
            {
                mes_texto = "Octubre";
                break;
            }
            case 11:
            {
                mes_texto = "Noviembre";
                break;
            }
            case 12:
            {
                mes_texto = "Diciembre";
                break;
            }
            default:
            {
                mes_texto = "Falatl Error";
                System.out.println("Fatal Error");
                break;
            }
        }
        
        return mes_texto;
    }
    
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        int dia,mes,año;
        String mes_texto;
        
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
        
        System.out.println("Ingrese el año: ");
        año = entrada.nextInt();
        
        mes_texto = mes_a_texto (mes);
        
        System.out.println("La fecha que ingreso es: " + dia + " de " + mes_texto + " de " + año);
        
    }
    
}
