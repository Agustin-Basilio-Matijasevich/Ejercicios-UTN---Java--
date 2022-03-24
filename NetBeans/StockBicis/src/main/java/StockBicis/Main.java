package StockBicis;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        //Variables
        Scanner in = new Scanner(System.in);
        Tools tools = new Tools();
        Lista lista = new Lista();
        
        //Logica Sistema
        System.out.println("Bienvenido al sistema de control de Stock y Estado de Bicicletas");
        
        while(true) //Ciclo principal de trabajo
        {
            //Variables de menu
            int opcion;
            
            //Menu Principal
            System.out.println("");
            System.out.println("Ingrese 1 para Añadir una bicicleta");
            System.out.println("Ingrese 2 para Eliminar una bicicleta");
            System.out.println("Ingrese 3 para Usar o Mantener una bicicleta");
            System.out.println("Ingrese 4 para Listar las bicicletas en Stock");
            System.out.println("Ingrese 5 para Salir");
            
            //Lectura de teclado
            try
            {
                opcion = in.nextInt();
            } catch (Exception InputMismatchException)
            {
                opcion = 0;
                in.next();
            }
            
            switch(opcion)  //Derivacion
            {
                case 1:
                {
                    System.out.println("");
                    lista.añadirBici(tools.generarBici());
                    break;
                }
                case 2:
                {
                    System.out.println("");
                    lista.eliminarBici(tools.selecListElement(lista));
                    break;
                }
                case 3:
                {
                    System.out.println("");
                    if (lista.getSize() == 0)
                    {
                        System.out.println("No hay bicis en stock");
                    }
                    else
                    {
                        Bicicleta bici = lista.getBici(tools.selecListElement(lista));
                    
                        tools.useOrMaintance(bici);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("");
                    int cantE;
                    
                    cantE = lista.listar();
                    
                    System.out.println("La cantidad de bicicletas en Stock es: " + cantE);
                    
                    break;
                }
                case 5: break;
                default:
                {
                    System.out.println("Valor ingresado invalido, por favor reintente");
                    break;
                }
            }
            
            if (opcion == 5)
            {
                System.out.println("");
                System.out.println("Gracias, vuelva prontos");
                break;
            }
            
        }
        
    }
    
}
