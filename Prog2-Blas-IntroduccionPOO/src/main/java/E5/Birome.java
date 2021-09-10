package E5;

/**
 *
 * @author agust
 */
public class Birome
{
    int cant_tinta;
    
    public Birome()
    {
        cant_tinta = 14;
    }
    
    public void escribir (String texto, Papel papel)
    {
        if (cant_tinta >= texto.length())
        {
            cant_tinta -= texto.length();
            papel.escribir(texto);
        }
        else
        {
            System.out.println("Error, la tinta disponible es insuficiente para escribir el texto");
        }
        
    }
    
}