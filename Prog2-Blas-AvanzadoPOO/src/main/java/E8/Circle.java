package E8;

/**
 *
 * @author agust
 */
public class Circle
{
    //Atributos
    protected double radius = 1.0;
    protected String color = "red";
    
    //Constructores
    public Circle()
    {
        
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
    
    //Metodos basicos
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public double getArea()
    {
        return (2 * Math.PI * radius);
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        return ("Circle[radius=" + radius + ",color=" + color + "]");
    }
    
}
