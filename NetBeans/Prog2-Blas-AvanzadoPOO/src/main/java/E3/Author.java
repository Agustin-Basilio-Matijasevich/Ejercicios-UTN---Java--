package E3;

/**
 *
 * @author agust
 */
public class Author
{
    //Atributos
    private final String name;
    private String email;
    private final char gender;
    
    //Constructor
    public Author (String name, String email, char gender)
    {
        if (gender == 'm' || gender == 'f')
        {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        else
        {
            System.out.println("El genero ingresado es invalido, se anulan los datos");
            this.name = null;
            this.gender = 'X';
        }
        
    }
    
    //Metodos basicos
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public char getGender()
    {
        return gender;
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        return ("Author[name=" + name + ",email=" + email + ",gender=" + gender + "]");
    }
    
}
