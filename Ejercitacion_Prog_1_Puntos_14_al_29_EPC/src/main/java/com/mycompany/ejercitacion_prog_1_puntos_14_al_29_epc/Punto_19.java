package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_19 
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int tipo_empresa, tipo_comprador;
        
        System.out.println("--Bienvenido al sistema de registracion de IVA--");
        
        do
        {
        System.out.println("Ingrese que tipo de empresa es:");
        System.out.println("Ingrese 1 para: RNI. Ingrese 2 para: M. Ingrese 3 para: E. Ingrese 4 para: RI");
        tipo_empresa = entrada.nextInt();
        if (tipo_empresa<1||tipo_empresa>4)
        {
            System.out.println("Valor ingresado invalido, por favor reintente");
        }
        }while (tipo_empresa<1||tipo_empresa>4);
        
        if (tipo_empresa>=1&&tipo_empresa<=3)
        {
            System.out.println("Se debe emitir comprobante ''C''");
        }
        else
        {
            do
            {
            System.out.println("Ingrese que tipo de comprador es:");
            System.out.println("Ingrese 1 para: RNI. Ingrese 2 para: M. Ingrese 3 para: E. Ingrese 4 para: RI");
            tipo_comprador = entrada.nextInt();
            if (tipo_comprador<1||tipo_comprador>4)
            {
                System.out.println("Valor ingresado invalido, por favor reintente");
            }
            }while (tipo_comprador<1||tipo_comprador>4);
            
            if (tipo_comprador==1||tipo_comprador==4)
            {
                System.out.println("Se debe emitir comprobante ''A''");
            }
            else
            {
                System.out.println("Se debe emitir comprobante ''B''");
            }
        }
        
    }
    
}
