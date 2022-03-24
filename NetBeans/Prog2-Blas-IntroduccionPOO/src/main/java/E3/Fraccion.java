package E3;

/**
 *
 * @author agust
 */
public class Fraccion
{
    //Atributos
    private final int dividendo, divisor;
    
    //Constructor
    public Fraccion(int dividendo, int divisor)
    {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    //Metodos basicos
    public int getDividendo()
    {
        return dividendo;
    }
    
    public int getDivisor()
    {
        return divisor;
    }
    
    //Metodos especiales
    public Fraccion sumar(Fraccion sumando)
    {
        Fraccion resultado = new Fraccion(((this.dividendo*sumando.getDivisor())+(sumando.getDividendo()*this.divisor)), (this.divisor*sumando.getDivisor()));
        return reducir(resultado);
        
    }
    
    public Fraccion multiplicar (Fraccion producto)
    {
        Fraccion resultado = new Fraccion(this.dividendo*producto.getDividendo(), this.divisor*producto.divisor);
        return reducir(resultado);
        
    }
    
    public Fraccion reducir (Fraccion fraccion)
    {
        Mi_math mi_math = new Mi_math();
        int mcd;
        
        mcd = mi_math.mcd(fraccion.getDividendo(), fraccion.getDivisor());
        
        return new Fraccion(fraccion.getDividendo()/mcd, fraccion.getDivisor()/mcd);
        
    }
    
    //Metodos override
    @Override
    public String toString()
    {
        return (dividendo + "/" + divisor);
    }
    
}
