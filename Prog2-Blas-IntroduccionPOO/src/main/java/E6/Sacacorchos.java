package E6;

/**
 *
 * @author agust
 */
public class Sacacorchos
{
    private boolean tieneCorcho = false;
    
    public void destapar(Botella botella)
    {
        if (botella.tieneCorcho() == false)
        {
            System.out.println("Error la botella ya esta destapada");
        }
        else
        {
            if (this.tieneCorcho == true)
            {
                System.out.println("Error el sacacorchos aun tiene un corcho en el, deberia limpiarlo");
            }
            else
            {
                botella.sacarCorcho();
                this.tieneCorcho = true;
            }
            
        }
        
    }
    
    public void limpiar()
    {
        if (this.tieneCorcho == false)
        {
            System.out.println("El sacacorchos ya esta limpio");
        }
        else
        {
            this.tieneCorcho = false;
        }
    }
    
}
