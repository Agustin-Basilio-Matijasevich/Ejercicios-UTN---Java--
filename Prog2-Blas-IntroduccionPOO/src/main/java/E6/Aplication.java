package E6;

/**
 *
 * @author agust
 */
public class Aplication
{
    public static void main(String[] args)
    {
        Botella botella = new Botella("Bodega San Juan");
        Botella botella2 = new Botella("Bodega Don Pepito");
        Sacacorchos sacacorchos = new Sacacorchos();
        
        sacacorchos.limpiar();
        
        System.out.println(botella.getBodega());
        sacacorchos.destapar(botella);
        System.out.println(botella.getBodega());
        sacacorchos.destapar(botella);
        
        System.out.println(botella2.getBodega());
        sacacorchos.destapar(botella2);
        sacacorchos.limpiar();
        System.out.println(botella2.getBodega());
        sacacorchos.destapar(botella2);
        
        if (botella.tieneCorcho() == false)
        {
            System.out.println(botella.getBodega() + " No tiene corcho");
        }
        
        if (botella2.tieneCorcho() == false)
        {
            System.out.println(botella2.getBodega() + " No tiene corcho");
        }
        
    }
    
}
