package com.mycompany.ejercitacion.clase11;

/**
 *
 * @author agust
 */
public class Punto_19_20_21
{
    public static void main(String[] args)
    {
        
    }
    
}

class Empresa
{
    private final String nombre;
    private final int tamaño;
    Empleado empleados[];
    private int contador = 0;
    
    Empresa (String nombre, int tamaño)
    {
        this.nombre = nombre;
        this.tamaño = tamaño;
        empleados = new Empleado[tamaño];
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getTamaño ()
    {
        return tamaño;
    }
    
    public Empleado getEmpleado (int numero)
    {
        if (numero < this.tamaño)
        {
            return empleados[numero];
        }
        else
        {
            return null;
        }
    }
    
    public void despideEmpleado (int numero)
    {
        if (numero < this.tamaño)
        {
            empleados[numero] = null;
        }
    }
    
    public void nuevoEmpleado (String nombre, int sueldo)
    {
        this.empleados[this.contador] = new Empleado (this, nombre, sueldo, this.contador);
        this.contador++;
    }
}

class Empleado
{
    protected final Empresa empresa;
    protected final int numeroEmpleado;
    protected String nombre;
    protected int sueldo;
    
    protected Empleado (Empresa empresaaux, String nombreaux, int sueldoaux, int numeroEmpleadoaux)
    {
        this.empresa = empresaaux;
        this.nombre = nombreaux;
        this.sueldo = sueldoaux;
        this.numeroEmpleado = numeroEmpleadoaux;
    }
    
    public String getNombre ()
    {
        return this.nombre;
    }
    
    public int getSueldo ()
    {
        return this.sueldo;
    }
    
    public int getNumEmpleado ()
    {
        return this.numeroEmpleado;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setSueldo (int sueldo)
    {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString ()
    {
        return "El numero del empleado es: " + this.numeroEmpleado + "\nEl nombre del empleado es: " + this.nombre + "\nEl sueldo del empleado es: " + this.sueldo;
    }
    
    public void aumentar_sueldo (int numero)
    {
        int aux;
        
        aux = (numero * this.sueldo) / 100;
        
        this.sueldo = this.sueldo + aux;
    }
    
    public void despedir ()
    {
        empresa.despideEmpleado(this.numeroEmpleado);
    }
}