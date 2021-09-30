package StockBicis;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Tools
{
    public Bicicleta generarBici()
    {
        //Variables
        Scanner in = new Scanner(System.in);
        
        //Menu
        while (true)
        {
            //Variables menu
            int opcion;
            
            System.out.println("Ingrese 1 para Cargar una bicicleta nueva");
            System.out.println("Ingrese 2 para Cargar una bicicleta usada");
            
            //Lectura de teclado
            try
            {
                opcion = in.nextInt();
            } catch (Exception InputMismatchException)
            {
                opcion = 0;
                in.next();
            }
            
            switch(opcion)
            {
                case 1:
                {
                    Bicicleta bici;
                    
                    while(true)
                    {
                        String Tipo, Marca, Rodado, Cuadro, Cambios;
                        
                        do
                        {                            
                            System.out.println("Ingrese Tipo, Puede ser {MTB/Ruta/City/Utilitaria}");
                            Tipo = in.nextLine();
                        } while (!"MTB".equals(Tipo) && !"Ruta".equals(Tipo) && !"City".equals(Tipo) && !"Utilitaria".equals(Tipo));
                        
                        System.out.println("Ingrese Marca");
                        Marca = in.nextLine();
                        
                        do
                        {                            
                            System.out.println("Ingrese Rodado, Puede ser {26/27,5/29}");
                            Rodado = in.nextLine();
                        } while (!"26".equals(Rodado) && !"27,5".equals(Rodado) && !"29".equals(Rodado));
                        
                        do
                        {                            
                            System.out.println("Ingrese Tamaño del Cuadro, Puede ser {XS/S/M/L/XL}");
                            Cuadro = in.nextLine();
                        } while (!"XS".equals(Cuadro) && !"S".equals(Cuadro) && !"M".equals(Cuadro) && !"L".equals(Cuadro) && !"XL".equals(Cuadro));
                        
                        System.out.println("Ingrese la Cantidad de Cambios");
                        Cambios = in.nextLine();
                        
                        bici = new Bicicleta(Tipo, Marca, Rodado, Cuadro, Cambios);
                        
                        System.out.println(bici.toString());
                        
                        System.out.println("Ingrese 1 para confirmar o cualquier otra tecla NUMERICA para reintentar");
                        if (in.nextInt() == 1)
                        {
                            break;
                        }
                    }
                    
                    return bici;
                    
                }
                case 2:
                {
                    Bicicleta bici;
                    
                    while(true)
                    {
                        String Tipo, Marca, Rodado, Cuadro, Cambios;
                        int Estado, Suciedad;
                        
                        do
                        {                            
                            System.out.println("Ingrese Tipo, Puede ser {MTB/Ruta/City/Utilitaria}");
                            Tipo = in.nextLine();
                        } while (!"MTB".equals(Tipo) && !"Ruta".equals(Tipo) && !"City".equals(Tipo) && !"Utilitaria".equals(Tipo));
                        
                        System.out.println("Ingrese Marca");
                        Marca = in.nextLine();
                        
                        do
                        {                            
                            System.out.println("Ingrese Rodado, Puede ser {26/27,5/29}");
                            Rodado = in.nextLine();
                        } while (!"26".equals(Rodado) && !"27,5".equals(Rodado) && !"29".equals(Rodado));
                        
                        do
                        {                            
                            System.out.println("Ingrese Tamaño del Cuadro, Puede ser {XS/S/M/L/XL}");
                            Cuadro = in.nextLine();
                        } while (!"XS".equals(Cuadro) && !"S".equals(Cuadro) && !"M".equals(Cuadro) && !"L".equals(Cuadro) && !"XL".equals(Cuadro));
                        
                        System.out.println("Ingrese la Cantidad de Cambios");
                        Cambios = in.nextLine();
                        
                        do
                        {                            
                            System.out.println("Ingrese el % de Estado, Valor entre 0 y 100");
                            Estado = in.nextInt();
                        } while (Estado < 0 || Estado > 100);
                        
                        do
                        {                            
                            System.out.println("Ingrese el % de Suciedad, Valor entre 0 y 100");
                            Suciedad = in.nextInt();
                        } while (Suciedad < 0 || Suciedad > 100);
                        
                        bici = new Bicicleta(Tipo, Marca, Rodado, Cuadro, Cambios, Estado, Suciedad);
                        
                        System.out.println(bici.toString());
                        
                        System.out.println("Ingrese 1 para confirmar o cualquier otra tecla NUMERICA para reintentar");
                        if (in.nextInt() == 1)
                        {
                            break;
                        }
                    }
                    
                    return bici;
                    
                }
                default:
                {
                    System.out.println("Valor ingresado invalido, por favor reintente");
                    break;
                }
                
            }
            
        }
            
    }
    
    public int selecListElement(Lista lista)  //Retorna 0 por defecto (No llamar con una lista vacia genera exception)
    {
        Scanner in = new Scanner(System.in);
        int cantE, select;
        
        System.out.println("Lista de Elementos:");
        cantE = lista.listar();
        
        if (cantE == 0)
        {
            return 0;
        }
        else
        {
            do
            {            
                System.out.println("Seleccione un elemento de la lista");
                select = in.nextInt();
            } while (select < 0 || select > (cantE-1));
        
            return select;
        }
        
    }
    
    public void useOrMaintance(Bicicleta bici)
    {
        Scanner in = new Scanner(System.in);
        int option;
        
        do
        {
            do
            {            
                System.out.println("Ingrese 1 para Usar la bicicleta");
                System.out.println("Ingrese 2 para realizar Mantenimiento a la bicicleta");
                System.out.println("Ingrese 3 para Limpiar la bicicleta");
            
                option = in.nextInt();
            
            } while (option < 1 || option > 3);
            
            switch(option)
            {
                case 1: bici.usar();break;
                case 2: bici.mantenimiento();break;
                case 3: bici.lavar();break;
            }
            
            System.out.println("Ingrese 1 para realizar otra tarea sobre la misma bici o ingrese otro NUMERO para volver al menu principal");
            
            option = in.nextInt();
            
        }while(option == 1);
        
    }
    
}
