package E5;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        Birome birome = new Birome();
        Papel papel = new Papel();
        String texto = "Texto generico";
        
        birome.escribir(texto, papel);
        
        papel.toString();
        
    }
    
}
