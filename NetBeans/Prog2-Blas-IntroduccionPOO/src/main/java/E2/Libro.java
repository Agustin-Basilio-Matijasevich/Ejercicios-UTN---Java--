package E2;

/**
 *
 * @author agust
 */
public class Libro
{
    //Atributos
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NDP;  //Numero de paginas
    
    //Constructor
    public Libro(String ISBN, String Titulo, String Autor, int NDP)
    {
        setISBN(ISBN);
        setTitulo(Titulo);
        setAutor(Autor);
        setNDP(NDP);
    }
    
    //Metodos base
    public String getISBN()
    {
        return ISBN;
    }
    
    public String getTitulo()
    {
        return Titulo;
    }
    
    public String getAutor()
    {
        return Autor;
    }
    
    public int getNDP()
    {
        return NDP;
    }
    
    private void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    
    private void setTitulo(String Titulo)
    {
        this.Titulo = Titulo;
    }
    
    private void setAutor(String Autor)
    {
        this.Autor = Autor;
    }
    
    private void setNDP(int NDP)
    {
        this.NDP = NDP;
    }
    
    //Metodos especiales
    @Override
    public String toString()
    {
        return "El libro ''" + Titulo + "'' con ISBN ''" + ISBN + "'' creado por el autor ''" + Autor + "'' tiene " + NDP + " paginas.";
    }
    
}