package E4;

/**
 *
 * @author agust
 */
public class Account
{
    //Atributos
    private final String id;
    private final String name;
    private int balance = 0;
    
    //Constructores
    public Account (String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public Account (String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    //Metodos basicos
    public String getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    //Metodos especiales
    public int credit(int amount)
    {
        balance += amount;
        return balance;
    }
    
    public int debit(int amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        
        return balance;
    }
    
    //Metodos complejos
    public int transferTo(Account another, int amount)
    {
        if (amount <= balance)
        {
            debit(amount);
            another.credit(amount);
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        
        return balance;
    }
    
    //Metodos sobreescritos
    @Override
    public String toString()
    {
        return ("Account[id=" + id + ",name=" + name + ",balance=" + balance + "]");
    }
    
}
