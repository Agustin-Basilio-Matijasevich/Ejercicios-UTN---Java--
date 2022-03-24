package newpackage;

/**
 *
 * @author agust
 */
public class NewMain
{
    private int x;
    
    public boolean compare(int Y)
    {
        return x == Y;
    }
    
    public static void main(String[] args)
    {
        NewMain u = new NewMain();
        
        if (u.compare(21))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
    }
    
}
