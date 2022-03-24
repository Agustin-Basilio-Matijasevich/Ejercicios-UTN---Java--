package com.mycompany.ejercitacion_prog_1_puntos_14_al_29_epc;

/**
 *
 * @author agust
 */
public class Punto_16
{
    public static void main(String[] args)
    {
        String yo = "Durmiendo";
        
        System.out.println("--Salir de mi casa por la mañana--");
        
        System.out.println("Estado inicial: " + yo);
        
        System.out.println("Accion: Me levanto de mi cama");
        yo = "Despierto al lado de mi cama";
        System.out.println("Estado primero: " + yo);
        
        System.out.println("Accion: Me visto");
        yo = "Despierto y vestido";
        System.out.println("Estado segundo: " + yo);
        
        System.out.println("Accion: Me dirijo a la puerta de mi casa");
        yo = "Despierto y vestido en la puerta de mi casa";
        System.out.println("Estado tercero: " + yo);
        
        System.out.println("Accion: Abro la puerta y la cruzo");
        yo = "Fuera de mi casa";
        System.out.println("Estado Final: " + yo);
    }
    
}
