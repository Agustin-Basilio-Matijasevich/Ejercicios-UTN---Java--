package newpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Coleccion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        List nombres = new LinkedList<>();
        // Agregamos los nombres.
        System.out.println("Ingrese los nombres de a uno, 5 en total:");
        
        for (int i = 0; i < 5; i++)
        {
            nombres.add(in.nextLine());
        }
         
        // Ordenamos la lista.
        Collections.sort(nombres); 
        Collections.reverse(nombres);
        
        // Imprimimos
        for (int i = 0; i < nombres.size(); i++)
        {
            System.out.println(nombres.get(i));
        }
    }
}
