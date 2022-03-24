package GProducts;

/**
 *
 * @author agust
 */
public class NoPerecedero extends Producto
{
    //Atributos
    private String tipo;
    
    //Constructor
    public NoPerecedero(String Nombre, double Precio, String tipo)
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.tipo = tipo;
        
    }
    
    //Metodos Basicos
    public String getTipo()
    {
        return tipo;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    @Override
    public String toString()
    {
        return "Producto NO perecedero {Nombre: " + Nombre + ". Precio: $" + Precio + ". Tipo: " + tipo + "}";
    }
    
    //Metodos Complejos
    @Override
    public double calcularTotal(int cant)
    {
        double total = Precio*cant;
        
        if ("yerba".equals(tipo))
        {
            total = (total - (10*total/100));
        }
        
        return total;
        
    }
    
}
