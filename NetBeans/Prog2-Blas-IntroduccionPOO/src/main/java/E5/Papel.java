package E5;

/**
 *
 * @author agust
 */
public class Papel
{
    //Atributos
    private String texto;
    
    //Constructores
    public Papel ()
    {
        texto = new String();
    }
    
    //Metodos especiales
    public void escribir (String texto)
    {
        this.texto += texto;
    }
    
    @Override
    public String toString()
    {
        System.out.println(texto);
        return "Impresion completa";
    }
    
}