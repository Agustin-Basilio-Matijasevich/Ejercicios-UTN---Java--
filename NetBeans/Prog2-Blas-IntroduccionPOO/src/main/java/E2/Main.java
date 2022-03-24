package E2;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        Libro libro1;
        Libro libro2;
        
        System.out.println("Ingrese los datos del libro en el siguiente orden separados por enter:");
        System.out.println("ISBN/Titulo/Autor/Numero de paginas");
        
        libro1 = new Libro (entrada.nextLine(), entrada.nextLine(), entrada.nextLine(), entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Ingrese los datos del libro en el siguiente orden separados por enter:");
        System.out.println("ISBN/Titulo/Autor/Numero de paginas");
        
        libro2 = new Libro (entrada.nextLine(), entrada.nextLine(), entrada.nextLine(), entrada.nextInt());
        entrada.nextLine();
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if (libro1.getNDP() > libro2.getNDP())
        {
            System.out.println("El libro con mas paginas es " + libro1.getTitulo() + " de " + libro1.getAutor());
        }
        else if (libro2.getNDP() > libro1.getNDP())
        {
            System.out.println("El libro con mas paginas es " + libro2.getTitulo() + " de " + libro2.getAutor());
        }
        else
        {
            System.out.println("Ambos libros tienen la misma cantidad de paginas");
        }
        
    }
    
}