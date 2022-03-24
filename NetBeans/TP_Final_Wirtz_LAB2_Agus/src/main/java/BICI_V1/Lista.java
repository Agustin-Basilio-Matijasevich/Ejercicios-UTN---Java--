package BICI_V1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase de diseño autogeneradora del objeto Lista
 * @version 1.0
 * @author agust
 */
public class Lista
{
    //Atributos
    private final ArrayList lista;
    private final Bicicleta bicicleta = new Bicicleta();
    private final Scanner in = new Scanner (System.in);
    
    //Constructor
    public Lista (ArrayList lista)
    {
        this.lista = lista;
    }
    
    //Metodos Basicos
    /**
     * Devuelve una copia de un objeto bicicleta de la lista
     * @param target
     * @return Bicicleta
     **/
    public Bicicleta getBicicleta(int target)
    {
        Bicicleta salida = (Bicicleta) lista.get(target);
        return salida;
    }
    
    /**
     * Modifica un objeto Bicicleta de la lista
     * @param data
     * @param posicion
     **/
    public void setBicicleta(Bicicleta data, int posicion)
    {
        lista.set(posicion, data);
    }
    
    //Metodos Complejos
    /**
     * Devuelve una copia de la lista
     * @return ArrayList
     **/
    public ArrayList getArrayList()
    {
        ArrayList salida = lista;
        return salida;
    }
    
    /**
     * Imprime en pantalla una lista de los elementos en la lista y devuelve el largo de la misma
     * @return integrer
     **/
    public int listar()  //Imprime las bicis en stock numeradas y devuelve la cantidad de bicis en stock
    {
        if (lista.isEmpty())
        {
            System.out.println("\n\nNo hay Bicicletas en la lista");
        }
        else
        {
            int i = 0;
            Iterator it = lista.iterator();
            
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
            
        }
        
        return lista.size();
    }
    
    public void añadirBicicleta()
    {
        lista.add(bicicleta.generarBicicleta());
    }
    
    public void eliminarBicicleta()
    {
        //Variables
        int cantE, select;
        
        cantE = listar();
        
        if (cantE == 0)
        {
            System.out.println("No se puede eliminar un elemento ya que no existe ninguno.");
        }
        else
        {
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
                
            } while (select < 0 || select > (cantE-1));
            
            lista.remove(select);
            
            System.out.println("Bicicleta eliminada con Exito");
            
        }
        
    }
    
    public ArrayList busquedaPorTipo (Tipo tipo)
    {
        ArrayList salida = new ArrayList();
        
        for (int i = 0; i < lista.size(); i++)
        {
            if (tipo.equals(((Bicicleta) lista.get(i)).getTipo()))
            {
                Bicicleta aux = (Bicicleta) lista.get(i);
                aux.setId(i);
                salida.add(aux);
            }
        }
        
        return salida;
        
    }
    
    //Metodos Sobreescritos
    @Override
    public String toString()
    {
        return lista.toString();
    }
    
}
