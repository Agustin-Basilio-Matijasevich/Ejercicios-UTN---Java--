package E6;

/**
 *
 * @author agust
 */
public class Botella
{
    final private Corcho corcho;
    
    public Botella (String bodega)
    {
        corcho = new Corcho (bodega);
    }
    
    public String getBodega ()
    {
        return corcho.getBodega();
    }
    
    public boolean tieneCorcho ()
    {
        return corcho.isEnBotella();
    }
    
    public void sacarCorcho ()
    {
        corcho.quitaCorcho();
    }
    
}
