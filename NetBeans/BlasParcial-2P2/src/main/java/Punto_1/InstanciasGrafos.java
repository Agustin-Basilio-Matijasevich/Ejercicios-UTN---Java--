package Punto_1;

import Ejemplos.Grafo;

/**
 *
 * @author agust
 */
public class InstanciasGrafos
{
    public static void main(String[] args)
    {
        Grafo uno, dos;
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H"};
        
        //Carga del primer grafo
        uno = new Grafo(vertices);
        
        uno.conectar("A", "B", 3);
        uno.conectar("A", "C", 1);
        uno.conectar("B", "G", 5);
        uno.conectar("B", "D", 1);
        uno.conectar("C", "D", 2);
        uno.conectar("C", "F", 5);
        uno.conectar("D", "F", 2);
        uno.conectar("D", "E", 4);
        uno.conectar("E", "G", 2);
        uno.conectar("E", "H", 1);
        uno.conectar("F", "H", 3);
        
        
        //Carga del segundo grafo
        dos = new Grafo(vertices, uno.getmatriz());
        
        //Impresion grafo 1
        System.out.println("Grafo uno:");
        uno.imprimir();
        
        //Impresion grafo 2
        System.out.println("Grafo dos:");
        dos.imprimir();
        
        System.out.println("Nodo mas cercano a C:");
        System.out.println(uno.masCercano("C"));
        
        System.out.println("Nodos Proximos a B:");
        uno.nodosProximos("B");
        
    }
    
}
