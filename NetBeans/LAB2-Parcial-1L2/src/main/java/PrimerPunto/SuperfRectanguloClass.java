package PrimerPunto;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class SuperfRectanguloClass
{
    //Atributos
    private static final Scanner in = new Scanner (System.in);  //Objeto/Herramienta para entrada por consola
    private double alto = 0, ancho = 0;  //Alto y ancho del rectangulo
    private boolean flag = false;  //Bandera de control para ingreso por consola
    
    //Constructor vacio
    public SuperfRectanguloClass ()
    {
        do
        {
            try
            {
                flag = false;
                System.out.println("Ingrese el ALTO del Rectangulo en CENTIMETROS");  //Solicitud de alto del rectangulo
                alto = in.nextDouble();
                
            } catch (Exception InputMismatchException)  //Catch de excepcion por poner texto y no numero
            {
                in.next();
                System.out.println("Valor invalido, reintente");
                flag = true;
                
            }
            
        } while (flag);
        
        do
        {
            try
            {
                flag = false;
                System.out.println("Ingrese el ANCHO del Rectangulo en CENTIMETROS");  //Solicitud de ancho del rectangulo
                ancho = in.nextDouble();
                
            } catch (Exception InputMismatchException)  // Catch de excepcion por poner texto y no numero
            {
                in.next();
                System.out.println("Valor invalido, reintente");
                flag = true;
            }
            
        } while (flag);
        
        System.out.println("La superficie del rectangulo es igual a: " + (alto*ancho) + "cm²");
    }
    
    //Constructor JavaBean
    public SuperfRectanguloClass (double alto, double ancho, boolean flag)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.flag = flag;
    }
    
    //Getters y Setters
    public static Scanner getIn()
    {
        return in;
    }
    
    public double getAlto()
    {
        return alto;
    }
    
    public double getAncho()
    {
        return ancho;
    }
    
    public boolean getFlag()
    {
        return flag;
    }
    
    public void setAlto(double alto)
    {
        this.alto = alto;
    }
    
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
    
}
