package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_1
{
    public static void main(String[] args)
    {
        int uno,dos;
        
        uno = 1;  //se carga un valor cualquiera en la primer variable
        dos = uno;  //se carga el valor de la primer variable en la segunda
        
        System.out.println("Variable uno: " + uno + " Variable dos: " + dos);  //se imprime el valor de la primer variable en la primera y la segunda
        
        dos = 2;  //se carga un valor cualquiera en la segunda
        
        System.out.println("Variable uno: " + uno + " Variable dos: " + dos);  //La primer variable muestra el valor dado inicialmente y la segunda variable muestra el ultimo valor asignado en este caso un 2
    }
    
}
