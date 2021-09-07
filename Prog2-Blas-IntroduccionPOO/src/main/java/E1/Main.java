package E1;

/**
 *
 * @author agust
 */

public class Main
{
    public static void main(String[] args)
    {
        Cuenta cuenta1 = new Cuenta("Agustin", 5000);
        Cuenta cuenta2 = new Cuenta("Nacho");
        
        System.out.println(cuenta1.getTitular() + " $" + cuenta1.getCantidad());
        System.out.println(cuenta2.getTitular() + " $" + cuenta2.getCantidad());
        
        cuenta1.retirar(2000);
        cuenta2.ingresar(5000);
        
        System.out.println(cuenta1.getTitular() + " $" + cuenta1.getCantidad());
        System.out.println(cuenta2.getTitular() + " $" + cuenta2.getCantidad());
        
        cuenta1.retirar(10000);
        
        System.out.println(cuenta1.getTitular() + " $" + cuenta1.getCantidad());
        System.out.println(cuenta2.getTitular() + " $" + cuenta2.getCantidad());
        
    }
    
}
