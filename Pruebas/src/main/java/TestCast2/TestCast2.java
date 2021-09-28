package TestCast2;

/**
 *
 * @author agust
 */

class Animal
{
    void makeNoise()
    {
        System.out.println("generic noise");
    }
}

class Dog extends Animal
{
    @Override
    void makeNoise()
    {
        System.out.println("bark");
    }
    
    void playDead()
    {
        System.out.println("roll over");
    }
}

public class TestCast2
{
    public static void main(String[] args)
    {
        Animal [] a = {new Animal(), new Dog(), new Animal()};
        
        for (Animal animal : a)
        {
            animal.makeNoise();
            if (animal instanceof Dog)
            {
                ((Dog) animal).playDead();
            }
        }
    }
    
}