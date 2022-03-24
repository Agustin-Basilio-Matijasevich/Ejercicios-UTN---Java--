package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_18
{
    public static int cucharadas_azucar ()
    {
        Scanner entrada=new Scanner(System.in);
        int cucharadas;
        
        do
        {
            System.out.println("Puede una dos o tres cucharadas de azucar");
            System.out.println("Por favor indique cuantas cucharadas de azucar quiere:");
            cucharadas = entrada.nextInt();
            
            if (cucharadas<1||cucharadas>3)
            {
                System.out.println("Valor ingresado invalido, intente nuevamente");
            }
        }while (cucharadas<1||cucharadas>3);
        
        return cucharadas;
    }
    
    public static int elegir_merienda ()
    {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        
        do
        {
            System.out.println("Por favor seleccione que desea merendar, las opciones son las siguientes:");
            
            System.out.println("Opcion 1: Te. Opcion 2: Cafe. Opcion 3: Cafe con leche. Opcion 4: Te con leche. Opcion 5: Como diria Santos, ¿Earl Grey no tiene?");
            opcion = entrada.nextInt();
            
            if (opcion<1||opcion>5)
            {
                System.out.println("Valor ingresado invalido, intente nuevamente");
            }
        }while (opcion<1||opcion>5);
        
        
        return opcion;
    }
    
    public static boolean quiere_azucar ()
    {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        boolean azucar = false;
        
        do
        {
             System.out.println("¿Quiere azucar?");
             System.out.println("Opcion 1: SI. Opcion 2: NO");
             opcion = entrada.nextInt();
             
             if (opcion!=1&&opcion!=2)
             {
                 System.out.println("Valor ingresado invalido, intente nuevamente");
             }
        }while (opcion!=1&&opcion!=2);
       
        if (opcion == 1)
        {
            azucar = true;
        }
        
        return azucar;
    }
    
    public static void main(String[] args)
    {
        //Variables
        int tipo_merienda, cuanta_azucar;
        boolean azucar;
        String merienda;
        
        System.out.println("--Bienvenido a *Merendando con Java*--");
        
        tipo_merienda = elegir_merienda();
        
        if (tipo_merienda == 5)
        {
            System.out.println("No, Te comun nomas");
        }
        
        azucar = quiere_azucar();
        
        switch (tipo_merienda)
        {
            case 1 ->             {
                merienda = "Te";
            }
            case 2 ->             {
                merienda = "Cafe";
            }
            case 3 ->             {
                merienda = "Cafe con leche";
            }
            case 4 ->             {
                merienda = "Te con leche";
            }
            case 5 ->             {
                merienda = "Te";
            }
            default ->             {
                merienda = "&&&Fatal Error in switch tipo_merienda&&&";
            }
        }
        
        if (azucar)
        {
            cuanta_azucar = cucharadas_azucar();
            
            merienda = merienda + " con " + cuanta_azucar + " cucharadas de azucar";
        }
        else
        {
            merienda = merienda + " sin azucar";
        }
        
        System.out.println("Su merienda sera: " + merienda);
        
    }
    
}
