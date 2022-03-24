package E6;

/**
 *
 * @author agust
 */
public class Corcho
{
    private final String bodega;
    private boolean enBotella;
    
    public Corcho (String bodega)
    {
        this.bodega = bodega;
        enBotella = true;
    }
    
    public String getBodega()
    {
        return bodega;
    }
    
    public boolean isEnBotella()
    {
        return enBotella;
    }
    
    public void quitaCorcho ()
    {
        enBotella = false;
    }
    
}
