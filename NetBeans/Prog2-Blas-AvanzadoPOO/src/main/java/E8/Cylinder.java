package E8;

/**
 *
 * @author agust
 */
public class Cylinder extends Circle
{
    //Atributos
    private double height = 1.0;
    
    //Contructores
    public Cylinder()
    {
        
    }
    
    public Cylinder(double radius)
    {
        this.radius = radius;
    }
    
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color)
    {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }
    
    //Metodos Basicos
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getVolume()
    {
        return (super.getArea() * height);
    }
    
    //Metodos sobreescritos
    @Override
    public double getArea()
    {
        return ((2 * Math.PI * radius * height) + (2 * super.getArea()));
    }
    
    @Override
    public String toString()
    {
        return ("Cylinder[radius=" + radius + ",height=" + height + ",color=" + color + "]");
    }
    
}
