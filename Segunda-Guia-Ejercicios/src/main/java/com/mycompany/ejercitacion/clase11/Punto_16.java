package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */

class complejo
{
    double pReal, pImag;
    
    void asignar (double x, double y)
    {
        pReal = x;
        pImag = y;
    }
    
    void sumar (double x, double y)
    {
        pReal = pReal + x;
        pImag = pImag + y;
    }
    
    void imprimir ()
    {
        System.out.println("pReal: " + pReal + "\npImag: " + pImag);
    }
}

class PruebaComplejo
{
    void main ()
    {
        complejo objeto = new complejo ();
        
        objeto.asignar(10, 20);
        objeto.imprimir();
        objeto.sumar(30, 40);
        objeto.imprimir();
    }
}

public class Punto_16
{
    public static void main(String[] args)
    {
        PruebaComplejo prueba = new PruebaComplejo ();
        
        prueba.main();
    }
    
}
