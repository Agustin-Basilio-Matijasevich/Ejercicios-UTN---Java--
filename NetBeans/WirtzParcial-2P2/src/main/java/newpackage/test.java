package newpackage;

/**
 *
 * @author agust
 */
public class test
{
    public static void main(String[] args)
    {
        int i=1, j=1;
        try
        {
            i++;
            j--;
            if(i == j)
            {
                i++;
            }
        } catch (ArithmeticException e)
        {
            System.out.print(0);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.print(1);
        }
        catch (Exception e)
        {
            System.out.println(2);
        }
        finally
        {
            System.out.println(3);
        }
        System.out.println(",4");
    }
    
}
