package GProducts;

/**
 *
 * @author agust
 */
public abstract class Producto
{
    //Atributos
    String Nombre;
    double Precio;
    
    //Metodos Basicos
    public String getNombre()
    {
        return Nombre;
    }
    
    public double getPrecio()
    {
        return Precio;
    }
    
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }
    
    public void setPrecio(double Precio)
    {
        this.Precio = Precio;
    }
    
    @Override
    public String toString()
    {
        return "Producto{" + "Nombre=" + Nombre + ", Precio=" + Precio + '}';
    }
    
    //Metodos Complejos
    public double calcularTotal(int cant)
    {
        return Precio*cant;
    }
    
}
