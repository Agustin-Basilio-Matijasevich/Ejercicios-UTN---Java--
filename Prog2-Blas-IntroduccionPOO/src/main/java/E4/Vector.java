package E4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author agust
 */
public class Vector
{
    //Atributos
    private final ArrayList<Double> coordenadas;
    
    //Constructor
    public Vector (ArrayList<Double> coordenadas)
    {
        this.coordenadas = (ArrayList) coordenadas.clone();
    }
    
    //Metodos especiales
    public Vector multiplicar (double numero)
    {
        ArrayList<Double> resultado = new ArrayList<>();
        Iterator<Double> iterador = coordenadas.iterator();
        
        while (iterador.hasNext())
        {
            resultado.add(numero * iterador.next());
        }
        
        return new Vector(resultado);
        
    }
    
    public Vector sumar (Vector plus)
    {
        if (coordenadas.size() == plus.lenght())
        {
            ArrayList<Double> resultado = new ArrayList<>();
            
            for (int i = 0; i < coordenadas.size(); i++)
            {
                resultado.add(coordenadas.get(i) + plus.getcoordenada(i));
            }
            
            return new Vector(resultado);
            
        }
        else
        {
            System.out.println("Error al intentar sumar los vectores, sus tamaños son diferentes");
            return plus;
            
        }
        
    }
    
    //Metodos auxiliares
    private int lenght ()
    {
        return coordenadas.size();
    }
    
    private double getcoordenada (int id)
    {
        return coordenadas.get(id);
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        String resultado = new String();
        Iterator<Double> iterador = coordenadas.iterator();
        
        resultado += "[";
        
        while (iterador.hasNext())
        {
            resultado += iterador.next();
            
            if (iterador.hasNext())
            {
                resultado += ",";
            }
            
        }
        
        resultado += "]";
        
        return resultado;
        
    }
    
}
