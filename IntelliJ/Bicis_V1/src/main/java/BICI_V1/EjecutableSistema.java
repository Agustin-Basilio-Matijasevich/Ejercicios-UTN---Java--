package BICI_V1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Archivo Ejecutable principal del sistema BICIS
 * @version 1.0
 * @author agust
 */
public class EjecutableSistema
{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        InicSystemArch.main(args); //Inicializa el sistema de archivos
        
        System.out.println("\n\nBienvenido a BICIS V1.0");
        System.out.println("-----------------------");
        
        /**
         * Variables locales
         **/
        Scanner in = new Scanner (System.in);
        SystemData Datos = new SystemData();
        Lista lista = new Lista (Datos.leer());
        int opcion; //Contiene la opcion seleccionada menu principal
        boolean flag = false; //Bandera para bucle sistema
        
        /**
         * Menu Principal
         **/
        while(true)
        {
            System.out.println("\n\nSeleccione una opcion ingresando el numero correspondiente por teclado");
            System.out.println("Ingrese 1 para Agregar Bicis al sistema");
            System.out.println("Ingrese 2 para Buscar una Bici en el sistema");
            System.out.println("Ingrese 3 para eliminar rapidamente una Bici del sistema");
            System.out.println("Ingrese 4 para SALIR del sistema");
            
            try
            {
                opcion = in.nextInt();
            } catch (InputMismatchException ime)
            {
                opcion = 0;
                in.next();
            }
            
            switch (opcion)
            {
                case 1:
                {
                    lista.añadirBicicleta();
                    
                    Datos.escribir(lista.getArrayList());
                    break;
                }
                case 2:
                {
                    Interactuar.main(args, lista);
                    
                    Datos.escribir(lista.getArrayList());
                    break;
                }
                case 3:
                {
                    lista.eliminarBicicleta();
                    
                    Datos.escribir(lista.getArrayList());
                    break;
                }
                case 4:
                {
                    System.out.println("Gracias, vuelva prontos");
                    flag = true;
                    break;
                }
                default:
                {
                    System.out.println("Ingreso Invalido, Reintente");
                    break;
                }
            }
            
            if (flag)
            {
                break;
            }
            
        }
        
    }
    
}
