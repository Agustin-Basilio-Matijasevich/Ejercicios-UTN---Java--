package StockBicis;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author agust
 */
public class Lista  //Lista de Bicicletas
{
    //Atributos
    private final ArrayList lista = new ArrayList();
    
    //Metodos Complejos
    public void añadirBici(Bicicleta bici)
    {
        lista.add(bici);
    }
    
    public void eliminarBici(int target)
    {
        try
        {
            lista.remove(target);
        } catch (Exception IndexOutOfBoundsException)
        {
            System.out.println("Error al intentar eliminar elemento de la Lista");
        }
    }
    
    public Bicicleta getBici(int target)
    {
        return ((Bicicleta) lista.get(target));
    }
    
    public void setBici(int target, Bicicleta bici)
    {
        lista.set(target, bici);
    }
    
    public int getSize()
    {
        return lista.size();
    }
    
    public int listar()  //Imprime las bicis en stock numeradas y devuelve la cantidad de bicis en stock
    {
        if (lista.isEmpty())
        {
            System.out.println("No hay Bicicletas en la lista");
        }
        else
        {
            int i = 0;
            Iterator it = lista.iterator();
        
            while (it.hasNext())
            {
                System.out.println("Elemento " + i + " " + it.next().toString());
                i++;
            }
        }
        
        return lista.size();
    }
    
}
