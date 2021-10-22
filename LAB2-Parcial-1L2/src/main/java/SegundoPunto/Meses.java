package SegundoPunto;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public enum Meses
{
    //Tipos Enumerativos
    ABRIL,
    MAYO,
    JUNIO,
    JULIO,
    ENERO,
    FEBRERO,
    DICIEMBRE;
    
    //Atributos de clase
    /**
     * Bandera para entrada por consola
     **/
    private boolean flag;
    
    /**
     * Numero
     **/
    private int num;
    
    //Atributos Herramientas
    /**
     * Herramienta de entrada por consola
     **/
    static final Scanner in = new Scanner (System.in);
    
    //Constructores
    /**
     * Constructor vacio
     **/
    private Meses ()
    {
        
    }
    
    //Metodos complejos
    public void impEnums ()
    {
        do
        {
            try
            {
                flag = false;
                System.out.println("Ingrese un numero");
                num = in.nextInt();
                
            } catch (Exception InputMismatchException)  // Catch de excepcion por poner texto y no numero
            {
                in.next();
                System.out.println("Valor invalido, reintente");
                flag = true;
            }
            
        } while (flag);
        
        if (num % 2 == 0)
        {
            Meses[] array = Meses.values();
            
            for (int i = 0; i < array.length; i++)
            {
                System.out.println("/" + array[i].name() + "/");
            }
                    
        }
        else
        {
            Meses[] array = Meses.values();
            
            for (int i = array.length; i > 0; i--)
            {
                System.out.println("/" + array[i].name() + "/");
            }
        }
        
    }
    
}
