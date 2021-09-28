package GProducts;

/**
 *
 * @author agust
 */
public class Ejecutable
{
    public static void main(String[] args)
    {
        //Atributos
        Producto productos [] = {new Perecedero("Leche", 60, 1), new Perecedero("Palmito", 45, 3), 
        new NoPerecedero("Yerba", 200, "yerba"), new NoPerecedero("Cartuchera", 625, "Utiles"), new Perecedero("Yogurt", 84, 2)};
        
        //Logica
        for (Producto producto : productos)
        {
            double total = 0;
            
            if (producto instanceof Perecedero)
            {
                total = ((Perecedero) producto).calcularTotal(5);
            }
            else if (producto instanceof NoPerecedero)
            {
                total = ((NoPerecedero) producto).calcularTotal(5);
            }
            
            System.out.println("El precio de comprar 5 " + producto.getNombre() + " es: $" + total);
            
        }
        
    }
    
}
