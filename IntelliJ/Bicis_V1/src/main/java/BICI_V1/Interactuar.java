package BICI_V1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase que permite buscar e interactuar con los objetos Bicicleta de la lista
 * @version 1.0
 * @author agust
 */
public class Interactuar
{
    public static void main(String[] args, Lista lista)
    {
        //Variables
        Tipo tipo = Tipo.VACIO;
        ArrayList filtrada;
        
        //Busqueda de elemento para interactuar
        System.out.println("\n\nIngrese el Tipo de Bicicleta que esta buscando:");
        tipo = tipo.selectTipo();
        
        filtrada = lista.busquedaPorTipo(tipo);
        
        if (filtrada.isEmpty())
        {
            System.out.println("No exixten Bicicletas en la base de datos que sean del tipo solicitado");
        }
        else
        {
            //Seleccion de elemento especifico
            int i = 0, select;
            Iterator it = filtrada.iterator();
            Scanner in = new Scanner (System.in);
            Bicicleta bicicleta;
            
            System.out.println("");
            System.out.println("");
            System.out.println("Lista de Elementos:");
            
            while (it.hasNext())
            {
                System.out.println("Elemento " + i + " " + it.next().toString());
                i++;
            }
            
            System.out.println("");
            System.out.println("");
            
            do
            {
                System.out.println("\n\nSeleccione un elemento de la lista:");
                
                try
                {
                    select = in.nextInt();
                } catch (InputMismatchException ime)
                {
                    select = -1;
                    in.next();
                }
                
            } while (select < 0 || select > (i-1));
            
            bicicleta = (Bicicleta) filtrada.get(select);
            
            //Interaccion con la bicicleta
            int option;
        
            do
            {
                do
                {   System.out.println("");
                    System.out.println("Ingrese 1 para Usar la bicicleta");
                    System.out.println("Ingrese 2 para realizar Mantenimiento a la bicicleta");
                    System.out.println("Ingrese 3 para Limpiar la bicicleta");
                    
                    try
                    {
                        option = in.nextInt();
                    } catch (InputMismatchException ime)
                    {
                        option = 0;
                        in.next();
                    }
                    
                } while (option < 1 || option > 3);
            
                switch(option)
                {
                    case 1: bicicleta.usar();break;
                    case 2: bicicleta.mantenimiento();break;
                    case 3: bicicleta.lavar();break;
                }
                
                System.out.println("");
                System.out.println("Ingrese 1 para realizar otra tarea sobre la misma bici o ingrese otro NUMERO para volver al menu principal");
                
                try
                {
                    option = in.nextInt();
                } catch (InputMismatchException ime)
                {
                    option = 0;
                    in.next();
                }
                
            }while(option == 1);
            
            lista.setBicicleta(bicicleta, bicicleta.getId());
            
        }
        
    }
    
}
