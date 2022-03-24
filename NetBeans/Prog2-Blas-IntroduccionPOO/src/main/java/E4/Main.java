package E4;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> vector = new ArrayList<>();
        
        vector.add(1.0);
        vector.add(5.3);
        vector.add(9.7);
        
        Vector mivector = new Vector(vector);
        
        vector.clear();
        
        vector.add(2.0);
        vector.add(2.0);
        vector.add(2.0);
        vector.add(2.0);
        
        Vector mivector2 = new Vector(vector);
        
        System.out.println(mivector.toString());
        
        System.out.println(mivector.multiplicar(2).toString());
        
        System.out.println(mivector.sumar(mivector2).toString());
        
    }
    
}
