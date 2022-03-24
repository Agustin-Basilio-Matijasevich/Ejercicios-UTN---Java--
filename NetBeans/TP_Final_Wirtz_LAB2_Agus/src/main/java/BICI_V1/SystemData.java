package BICI_V1;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase contenedora del archivo de datos del sistema
 * @version 1.0
 * @author agust
 */
public class SystemData
{
    private final File SystemData = new File ("SystemData.txt");
    
    public ArrayList leer() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if (SystemData.length() == 0)
        {
            return new ArrayList();
        }
        
        try
        {
            return (new ArrayList ((ArrayList) (new ObjectInputStream (new FileInputStream (SystemData))).readObject()));
        } catch (StreamCorruptedException e)
        {
            System.out.println("\n\nAVISO: La base de datos esta corrupta\n\n");
            System.out.println("Reparando Base de Datos...");
            escribir(new ArrayList());
            System.out.println("Base de Datos Reparada!!\n\n");
            return new ArrayList();
        }
        
    }
    
    public void escribir (ArrayList newData) throws FileNotFoundException, IOException
    {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream (SystemData));
        out.writeObject(newData);
        out.close();
    }
    
}
