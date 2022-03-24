package E1;

/**
 *
 * @author agust
 */

public class Cuenta
{
    //Atributos
    private String titular;
    private double cantidad = 0;
    
    //Constructores
    public Cuenta(String titular)
    {
        setTitular(titular);
    }
    
    public Cuenta(String titular, double cantidad)
    {
        setTitular(titular);
        setCantidad(cantidad);
    }
    
    //Metodos base
    private void setTitular(String titular)
    {
        this.titular = titular;
    }
    
    private void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public String getTitular()
    {
        return titular;
    }
    
    public double getCantidad()
    {
        return cantidad;
    }
    
    //Metodos especiales
    public boolean ingresar(double cantidad)  //Retorno: false operacion fallida, true operacion exitosa
    {
        if (cantidad <= 0)
        {
            return false;
        }
        else
        {
            cantidad += this.cantidad;
            setCantidad(cantidad);
            return true;
        }
    }
    
    public double retirar(double cantidad)
    {
        cantidad = this.cantidad - cantidad;
        
        if (cantidad < 0)
        {
            setCantidad(0);
            return getCantidad();
        }
        else
        {
            setCantidad(cantidad);
            return getCantidad();
        }
    }
    
}
