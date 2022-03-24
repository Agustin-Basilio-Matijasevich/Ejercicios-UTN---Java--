package Pruebas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author agust
 */
public class NewMain
{
    public static void main(String[] args) throws IOException
    {
        File f = new File ("texto.txt");
        f.createNewFile();
    }
    
}
