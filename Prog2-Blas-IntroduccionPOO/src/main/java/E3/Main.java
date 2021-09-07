package E3;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        Fraccion a = new Fraccion(6,3);
        Fraccion b = new Fraccion(5,5);
        
        System.out.println(a.sumar(b).toString());
        System.out.println(a.multiplicar(b).toString());
        
    }
    
}
