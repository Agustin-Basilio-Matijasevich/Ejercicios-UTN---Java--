package StockBicis;

/**
 *
 * @author agust
 */
public class Bicicleta
{
    //Atributos
    private final String Tipo;
    private final String Marca;
    private final String Rodado;
    private final String Cuadro;
    private final String Cambios;
    private int Estado;
    private int Suciedad;
    
    //Constructores
    public Bicicleta()  //Vacio
    {
        this.Tipo = null;
        this.Marca = null;
        this.Rodado = null;
        this.Cuadro = null;
        this.Cambios = null;
        this.Estado = 0;
        this.Suciedad = 0;
    }
    
    public Bicicleta(String Tipo, String Marca, String Rodado, String Cuadro, String Cambios)  //Nueva
    {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Rodado = Rodado;
        this.Cuadro = Cuadro;
        this.Cambios = Cambios;
        this.Estado = 100;
        this.Suciedad = 0;
    }
    
    public Bicicleta(String Tipo, String Marca, String Rodado, String Cuadro, String Cambios, int Estado, int Suciedad)  //Usada
    {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Rodado = Rodado;
        this.Cuadro = Cuadro;
        this.Cambios = Cambios;
        this.Estado = Estado;
        this.Suciedad = Suciedad;
    }
    
    //Metodos Basicos
    public String getTipo()
    {
        return Tipo;
    }
    
    public String getMarca()
    {
        return Marca;
    }
    
    public String getRodado()
    {
        return Rodado;
    }
    
    public String getCuadro()
    {
        return Cuadro;
    }
    
    public String getCambios()
    {
        return Cambios;
    }
    
    public int getEstado()
    {
        return Estado;
    }
    
    public int getSuciedad()
    {
        return Suciedad;
    }
    
    //Metodos Complejos
    public void usar()
    {
        if (Estado > 0)
        {
            if (Suciedad == 100)
            {
                Estado -= 20;
                System.out.println("La bicicleta esta demasiado sucia, se recomienda lavar");
            }
            else
            {
                Estado -= 10;
                Suciedad += 25;
            }
            
            if (Estado < 0)
            {
                Estado = 0;
            }
            
            System.out.println("La bicicleta fue utilizada con exito");
        }
        else
        {
            System.out.println("La bicicleta se encuentra en muy mal estado, se recomienda realizar mantenimiento");
        }
    }
    
    public void lavar()
    {
        Suciedad = 0;
        System.out.println("La bicicleta fue lavada con exito");
    }
    
    public void mantenimiento()
    {
        Estado = 100;
        System.out.println("Se realizo mantenimiento a la bicicleta con exito");
    }
    
    @Override
    public String toString()
    {
        return "Bicicleta: {Tipo:" + Tipo + "/Marca:" + Marca + "/Rodado:" + Rodado + "/Cuadro:" + Cuadro + "/Cantidad de cambios:" + Cambios + "/Estado:%" + Estado + "/Suciedad:%" + Suciedad + "}";
    }
    
}
