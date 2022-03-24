package BICI_V1;

import java.io.File;
import java.io.IOException;

/**
 * Clase inicializadora del archivo de datos del sistema
 * @version 1.0
 * @author agust
 */
public class InicSystemArch
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Inicializando sistema de archivos...");
        
        File f = new File ("SystemData.txt");
        boolean createNewFile;
        
        if (f.exists())
        {
            createNewFile = true;
        }
        else
        {
            createNewFile = f.createNewFile();
        }
        
        if (createNewFile && f.canRead() && f.canWrite())
        {
            System.out.println("Sistema de archivos Inicializado.");
        }
        else
        {
            System.out.println("Error al inicializar el sistema de archivos.");
            System.out.println("Puede seguir usando el programa pero sus acciones probablemente no seran guardadas en disco.");
        }
        
    }
    
}
