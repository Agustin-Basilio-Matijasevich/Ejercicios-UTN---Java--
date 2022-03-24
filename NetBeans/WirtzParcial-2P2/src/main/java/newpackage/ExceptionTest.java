package newpackage;

/**
 *
 * @author agust
 */
public class ExceptionTest
{
    class TestException extends Exception {}
    public void runTest() throws TestException {}
    public void test() throws TestException
    {
        runTest();
    }
}
