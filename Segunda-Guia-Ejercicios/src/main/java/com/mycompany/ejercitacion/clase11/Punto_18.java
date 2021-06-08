package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_18
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        Cuenta cuenta1 = new Cuenta ();
        Cuenta cuenta2 = new Cuenta ();
        
        System.out.println("Ingrese su primer deposito para la cuenta 1");
        cuenta1.Ingresar_Dinero(entrada.nextDouble());
        System.out.println("Ingrese su primer deposito para la cuenta 2");
        cuenta2.Ingresar_Dinero(entrada.nextDouble());
        
        System.out.println("La cuenta 1 tiene " + cuenta1.Consulta() + " Unidades monetarias");
        System.out.println("La cuenta 2 tiene " + cuenta2.Consulta() + " Unidades monetarias");
        
        System.out.println("Retire dinero de la cuenta 1");
        if (cuenta1.Retirar_Dinero(entrada.nextDouble()))
        {
            System.out.println("Retiro exitoso");
        }
        else
        {
            System.out.println("Fondos insuficientes");
        }
        System.out.println("Retire dinero de la cuenta 2");
        if (cuenta2.Retirar_Dinero(entrada.nextDouble()))
        {
            System.out.println("Retiro exitoso");
        }
        else
        {
            System.out.println("Fondos insuficientes");
        }
        
        System.out.println("La cuenta 1 tiene " + cuenta1.Consulta() + " Unidades monetarias");
        System.out.println("La cuenta 2 tiene " + cuenta2.Consulta() + " Unidades monetarias");
        
        System.out.println("Transfiera dinero de la cuenta 1 a la cuenta 2");
        if (cuenta1.Transferir_dinero(entrada.nextDouble(), cuenta2))
        {
            System.out.println("Transferencia exitosa");
        }
        else
        {
            System.out.println("Fondos insuficientes");
        }
        
        System.out.println("La cuenta 1 tiene " + cuenta1.Consulta() + " Unidades monetarias");
        System.out.println("La cuenta 2 tiene " + cuenta2.Consulta() + " Unidades monetarias");
    }
    
}

class Cuenta
{
    private double dinero = 0;

    public Cuenta()
    {
        
    }

    public void Ingresar_Dinero (double dinero)
    {
        this.dinero = this.dinero + dinero;
    }
    
    public boolean Retirar_Dinero (double dinero)
    {
        if (dinero <= this.dinero)
        {
            this.dinero = this.dinero - dinero;
            return true;
        }
        else
        {
            return false;
        }
    }

    public double Consulta ()
    {
        return dinero;
    }
    
    public boolean Transferir_dinero (double monto, Cuenta receptor)
    {
        if (monto <= this.dinero)
        {
            this.dinero = this.dinero - monto;
            receptor.Ingresar_Dinero(monto);
            return true;
        }
        else
        {
            return false;
        }
    }
}
