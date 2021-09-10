package E5;

import E3.Author;

/**
 *
 * @author agust
 */
public class Main
{
    public static void main(String[] args)
    {
        Author[] autores = new Author[3];
        autores[0] = new Author("Agustin", "agustin@gmail.com", 'm');
        autores[1] = new Author("Basilio", "basilio@gmail.com", 'f');
        autores[2] = new Author("Luciano", "luciano@gmail.com", 'r');
        
        Book libro = new Book("El valle de los pirineos", autores, 2350.45, 10);
        
        System.out.println(libro.getAuthorNames());
        System.out.println(libro.toString());
        
    }
    
}
