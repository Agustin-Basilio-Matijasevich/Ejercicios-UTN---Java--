package E3;

/**
 *
 * @author agust
 */
public class Mi_math
{
    //Constructor sin parametros
    public Mi_math()
    {
        
    }
    
    //Metodos de la herramienta
    public int mcd (int num1, int num2)
    {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        
        int resultado = 0;
        
        do
        {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
        
        return resultado;
        
    }
    
    public int mcm (int num1, int num2)
    {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        
        int resultado = (a/mcd(num1, num2))*b;
        
        return resultado;
        
    }
    
}