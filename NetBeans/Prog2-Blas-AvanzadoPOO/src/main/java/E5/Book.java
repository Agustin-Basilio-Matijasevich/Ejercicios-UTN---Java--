package E5;

import E3.Author;

/**
 *
 * @author agust
 */
public class Book
{
    //Atributos
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty = 0;
    
    //Constructores
    public Book(String name, Author[] authors, double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    //Metodos basicos
    public String getName()
    {
        return name;
    }
    
    public Author[] getAuthors()
    {
        return authors;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public int getQty()
    {
        return qty;
    }
    
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    
    public String getAuthorNames()
    {
        String names = new String();
        
        for (int i = 0; i < authors.length; i++)
        {
            names += authors[i].getName();
            if (i < authors.length-1)
            {
                names += ",";
            }
        }
        
        return names;
        
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        String resu = new String();
        
        resu += ("Book[name=" + name + ",authors={");
        
        for (int i = 0; i < authors.length; i++)
        {
            resu += ("Author[name=" + authors[i].getName() + ",email=" + authors[i].getEmail() + ",gender=" + authors[i].getGender() + "]");
            if (i < authors.length-1)
            {
                resu += ",";
            }
        }
        
        resu += ("},price=" + price + ",qty=" + qty + "]");
        
        return resu;
        
    }
    
}
