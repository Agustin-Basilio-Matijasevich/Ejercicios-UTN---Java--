package E2;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        Employee empleado = new Employee(1, "Agustin", "Basilio", 25000);
        
        System.out.println(empleado.toString());
        
        System.out.println("Salario anual=" + empleado.getAnnualSalary());
        
        System.out.println("Incremento de %50 salario queda:" + empleado.raiseSalary(50));
        
        System.out.println(empleado.toString());
        
    }
    
}
