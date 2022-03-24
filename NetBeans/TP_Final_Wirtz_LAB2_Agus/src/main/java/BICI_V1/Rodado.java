package BICI_V1;

import java.util.Scanner;

/**
 * Tipo enumerativo que contiene los Rodados disponibles y un metodo de seleccion
 * @version 1.0
 * @author agust
 */
public enum Rodado
{
    //Tipos Enumerativos
    VACIO ("NO ESPECIFICA"),
    CHICO ("26"),
    MEDIANO ("27.5"),
    GRANDE ("29");
    
    //Atributos
    /**
     * Nombre del tipo enumerativo a ser mostrado por pantalla
     **/
    private final String screenName;
    
    //Metodos
    //Constructores
    /**
     * Constructor completo
     **/
    private Rodado (String screenName)
    {
        this.screenName = screenName;
    }
    
    //Metodos Basicos
    /**
     * Getter del nombre de pantalla del Tipo (Privado)
     * Para imprimir el nombre del Tipo fuera de la clase se recomienda tostring()
     **/
    private String getScreenName ()
    {
        return screenName;
    }
    
    //Metodos Complejos
    /**
     * Metodo que permite al usuario seleccionar un Tipo por consola y devuelve dicho Tipo
     * @return Tipo Devuelve un Tipo seleccionado por el usuario
     **/
    public Rodado selectRodado ()
    {
        //Variables
        Scanner in = new Scanner (System.in);
        Rodado[] array = Rodado.values();
        int opcion;
        
        //Logica
        System.out.println(""); //Salto de linea
        System.out.println("Seleccione una opcion:"); //Mensaje de apertura
        
        for (int i = 0; i < array.length; i++) //Imprime una lista de los tipos numericos disponibles
        {
            System.out.println((i + 1) + ") " + array[i].getScreenName());
        }
        
        //Entrada por consola VALIDADA
        while (true)
        {
            System.out.println("Su opcion: ");
            
            try
            {
                opcion = in.nextInt();
            } catch (Exception InputMismatchException) //Control para asegurarse que se ingreso un entero
            {
                in.next();
                opcion = 0;
            }
            
            if (opcion >= 1 && opcion <= array.length)
            {
                break;
            }
            else
            {
                System.out.println("Valor ingresado invalido, por favor REINTENTE");
            }
            
        }
        
        System.out.println(""); //Salto de linea
        
        return array[opcion-1]; //Devolucion del Tipo seleccionado
        
    }
    
    /**
     * Convierte un Tipo en texto devolviendo el texto determinado segun el Tipo para mostrar entre comillas
     * @return String Retorna el nombre del Tipo determinado para mostrar entre comillas
     **/
    @Override
    public String toString()
    {
        return ( "\"" + screenName + "\"");
    }
}
