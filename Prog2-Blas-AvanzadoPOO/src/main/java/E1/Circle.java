package E1;

/**
 *
 * @author agust
 */
public class Circle
{
    //Atributos
    private double radius = 1.0;
    
    //Constructores
    public Circle ()
    {
        
    }
    
    public Circle (double radius)
    {
        this.radius = radius;
    }
    
    //Metodos
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getArea ()
    {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public double getCircumference ()
    {
        return (2 * Math.PI * radius);
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        return ("Circle[radius=" + radius + "]");
    }
    
}
