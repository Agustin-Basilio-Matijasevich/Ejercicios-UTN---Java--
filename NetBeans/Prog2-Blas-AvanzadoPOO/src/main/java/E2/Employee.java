package E2;

/**
 *
 * @author agust
 */
public class Employee
{
    //Atributos
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;
    
    //Constructores
    public Employee(int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    //Metodos Basicos
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getName()
    {
        return (firstName + " " + lastName);
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public int getAnnualSalary()
    {
        return (salary * 12);
    }
    
    //Metodos especiales
    public int raiseSalary (int percent)
    {
        int suma = ((percent * salary) / 100);
        
        salary += suma;
        
        return salary;
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        return ("Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]");
        
    }
    
}
