package CuartoPunto;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Menu
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int opcion = 0;
        
        System.out.println("Ingrese 1 para opcion 1");
        System.out.println("Ingrese 2 para opcion 2");
        System.out.println("Ingrese 3 para opcion 3");
        
        do
        {            
            try
        {
            opcion = in.nextInt();
        } catch (Exception InputMismatchException)
        {
            in.next();
            System.out.println("Intente nuevamente");
        }
        
            if (opcion < 1 || opcion > 3)
            {
                System.out.println("Intente nuevamente");
            }
            else
            {
                break;
            }
            
        } while (true);
        
        switch (opcion)
        {
            case 1: System.out.println("Eligio Opcion 1"); break;
            case 2: System.out.println("Eligio Opcion 2"); break;
            case 3: System.out.println("Eligio Opcion 3"); break;
                default: System.out.println("Error"); break;
        }
        
    }
    
}
