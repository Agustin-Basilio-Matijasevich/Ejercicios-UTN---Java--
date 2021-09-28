package GProducts;

/**
 *
 * @author agust
 */
public class Perecedero extends Producto
{
    //Atributos
    private int dias_a_caducar;
    
    //Constructor
    public Perecedero(String Nombre, double Precio, int dias_a_caducar)
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.dias_a_caducar = dias_a_caducar;
        
    }
    
    //Metodos Basicos
    public int getDias_a_caducar()
    {
        return dias_a_caducar;
    }
    
    public void setDias_a_caducar(int dias_a_caducar)
    {
        this.dias_a_caducar = dias_a_caducar;
    }
    
    @Override
    public String toString()
    {
        return "Producto perecedero {Nombre: " + Nombre + ". Precio: $" + Precio + ". Dias a Caducar: " + dias_a_caducar + "}";
    }
    
    //Metodos Complejos
    @Override
    public double calcularTotal(int cant)
    {
        double total = Precio*cant;
        
        switch(dias_a_caducar)
        {
            case 1:
            {
                total = (total - (50*total/100));
                break;
            }
            
            case 2:
            {
                total = (total - (40*total/100));
                break;
            }
            
            case 3:
            {
                total = (total -(30*total/100));
                break;
            }
            
            default:
            {
                
            }
            
        }
        
        return total;
        
    }
    
}
