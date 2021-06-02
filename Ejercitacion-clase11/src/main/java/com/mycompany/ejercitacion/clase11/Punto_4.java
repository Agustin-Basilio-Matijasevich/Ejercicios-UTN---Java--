package com.mycompany.ejercitacion.clase11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_4
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        double peso, altura, IMC;
        
        System.out.println("Ingrese el peso del paciente (KG): ");
        peso = entrada.nextDouble();
        System.out.println("Ingrese altura del paciente (m): ");
        altura = entrada.nextDouble();
        
        IMC = peso / Math.pow(altura, 2);
        
        if (IMC <= 16)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente critico IMC muy bajo, ingreso a hospital necesario");
        }
        else if (IMC > 16 && IMC <= 17)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con infrapeso");
        }
        else if (IMC > 17 && IMC <= 18)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con peso bajo");
        }
        else if (IMC > 18 && IMC <= 25)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente saludable");
        }
        else if (IMC > 25 && IMC <= 30)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con sobrepeso");
        }
        else if (IMC > 30 && IMC <= 35)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con sobrepeso cronico");
        }
        else if (IMC > 35 && IMC < 40)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con obesidad premorbida");
        }
        else if (IMC >= 40)
        {
            System.out.println("IMC = " + IMC);
            System.out.println("Paciente con obesidad morbida");
        }
        
    }
    
}
