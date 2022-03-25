package BICI_V1;

import java.util.Scanner;
import java.io.Serializable;
import java.util.InputMismatchException;

/**
 * Clase de diseño autogeneradora del objeto Bicicleta
 * @version 1.0
 * @author agust
 */
public class Bicicleta implements Serializable
{
    //Atributos
    private final String nombre;
    private final Tipo tipo;
    private final String marca;
    private final Rodado rodado;
    private final Cuadro cuadro;
    private final String cambios;
    private int estado;
    private int suciedad;
    private int id;
    
    //Constructores
    public Bicicleta()  //Vacio
    {
        this.nombre = null;
        this.tipo = null;
        this.marca = null;
        this.rodado = null;
        this.cuadro = null;
        this.cambios = null;
        this.estado = 0;
        this.suciedad = 0;
        this.id = 0;
    }
    
    public Bicicleta(String nombre, Tipo tipo, String marca, Rodado rodado, Cuadro cuadro, String cambios)  //Nueva
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.rodado = rodado;
        this.cuadro = cuadro;
        this.cambios = cambios;
        this.estado = 100;
        this.suciedad = 0;
        this.id = 0;
    }
    
    public Bicicleta(String nombre, Tipo tipo, String marca, Rodado rodado, Cuadro cuadro, String cambios, int estado, int suciedad)  //Usada
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.rodado = rodado;
        this.cuadro = cuadro;
        this.cambios = cambios;
        this.estado = estado;
        this.suciedad = suciedad;
        this.id = 0;
    }
    
    //Metodos Basicos
    public String getNombre()
    {
        return nombre;
    }
    
    public Tipo getTipo()
    {
        return tipo;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public Rodado getRodado()
    {
        return rodado;
    }
    
    public Cuadro getCuadro()
    {
        return cuadro;
    }
    
    public String getCambios()
    {
        return cambios;
    }
    
    public int getEstado()
    {
        return estado;
    }
    
    public int getSuciedad()
    {
        return suciedad;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setEstado(int estado)
    {
        this.estado = estado;
    }
    
    public void setSuciedad(int suciedad)
    {
        this.suciedad = suciedad;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    //Metodos Complejos
    /**
     * Genera un objeto bicicleta con datos por usuario y lo devuelve
     * @return Objeto Bicicleta
     **/
    public Bicicleta generarBicicleta()
    {
        //Variables
        Scanner in = new Scanner (System.in);
        int opcion; //Contiene la opcion seleccionada del menu
        boolean flag = false; //Bandera para bucle menu
        Bicicleta salida = new Bicicleta(); //Objeto para salida de datos
        
        //Variables de carga
        String nombre, marca, cambios;
        Tipo tipo = Tipo.VACIO; Rodado rodado = Rodado.VACIO; Cuadro cuadro = Cuadro.VACIO;
        int estado, suciedad;
        
        //Menu
        while (true)
        {
            System.out.println("\n\nIngrese 1 para Cargar una bicicleta nueva");
            System.out.println("Ingrese 2 para Cargar una bicicleta usada");
            
            //Lectura de teclado
            try
            {
                opcion = in.nextInt();
            } catch (Exception InputMismatchException)
            {
                opcion = 0;
                in.next();
            }
            nombre = in.nextLine();  //Reparacion de bug. Su ejecucion se ve ignorada y corrije un bug del metodo nextLine
            switch (opcion)
            {
                case 1:
                {
                    //Carga nombre
                    System.out.println("Ingrese Nombre");
                    nombre = in.nextLine();
                    nombre = nombre.toUpperCase();
                    
                    //Carga tipo
                    System.out.println("\nIngrese Tipo");
                    tipo = tipo.selectTipo();
                    
                    //Carga marca
                    System.out.println("\nIngrese Marca");
                    marca = in.nextLine();
                    marca = marca.toUpperCase();
                    
                    //Carga rodado
                    System.out.println("\nIngrese Rodado");
                    rodado = rodado.selectRodado();
                    
                    //Carga cuadro
                    System.out.println("\nIngrese Cuadro");
                    cuadro = cuadro.selectCuadro();
                    
                    //Carga cambios
                    System.out.println("\nIngrese Cambios");
                    cambios = in.nextLine();
                    cambios = cambios.toUpperCase();
                    
                    salida = new Bicicleta (nombre, tipo, marca, rodado, cuadro, cambios);
                    flag = true;
                    break;
                }
                case 2:
                {
                    //Carga nombre
                    System.out.println("Ingrese Nombre");
                    nombre = in.nextLine();
                    nombre = nombre.toUpperCase();
                    
                    //Carga tipo
                    System.out.println("\nIngrese Tipo");
                    tipo = tipo.selectTipo();
                    
                    //Carga marca
                    System.out.println("\nIngrese Marca");
                    marca = in.nextLine();
                    marca = marca.toUpperCase();
                    
                    //Carga rodado
                    System.out.println("\nIngrese Rodado");
                    rodado = rodado.selectRodado();
                    
                    //Carga cuadro
                    System.out.println("\nIngrese Cuadro");
                    cuadro = cuadro.selectCuadro();
                    
                    //Carga cambios
                    System.out.println("\nIngrese Cambios");
                    cambios = in.nextLine();
                    cambios = cambios.toUpperCase();
                    
                    do
                    {
                        System.out.println("\nIngrese el % de Estado, Valor entre 0 y 100");
                        
                        try
                        {
                            estado = in.nextInt();
                        } catch (InputMismatchException ime)
                        {
                            estado = 0;
                            in.next();
                        }
                        
                    } while (estado < 0 || estado > 100);
                        
                    do
                    {
                        System.out.println("\nIngrese el % de Suciedad, Valor entre 0 y 100");
                        
                        try
                        {
                            suciedad = in.nextInt();
                        } catch (InputMismatchException ime)
                        {
                            suciedad = 0;
                            in.next();
                        }
                        
                    } while (suciedad < 0 || suciedad > 100);
                    
                    salida = new Bicicleta (nombre, tipo, marca, rodado, cuadro, cambios, estado, suciedad);
                    flag = true;
                    break;
                }
                default:
                {
                    System.out.println("Ingreso Invalido, Reintente");
                    break;
                }
            }
            
            if (flag)
            {
                break;
            }
            
        }
        
        return salida;
        
    }
    
    /**
     * Usa la bicicleta y le aplica el desgaste indicado
     **/
    public void usar()
    {
        if (estado > 0)
        {
            if (suciedad == 100)
            {
                estado -= 20;
                System.out.println("La bicicleta esta demasiado sucia, se recomienda lavar");
            }
            else
            {
                estado -= 10;
                suciedad += 25;
            }
            
            if (estado < 0)
            {
                estado = 0;
            }
            
            if (suciedad > 100)
            {
                suciedad = 100;
            }
            
            System.out.println("La bicicleta fue utilizada con exito");
        }
        else
        {
            System.out.println("La bicicleta se encuentra en muy mal estado, se recomienda realizar mantenimiento");
        }
    }
    
    /**
     * Devuelve el valor suciedad a 0
     **/
    public void lavar()
    {
        suciedad = 0;
        System.out.println("La bicicleta fue lavada con exito");
    }
    
    /**
     * Devuelve el valor estado al 100
     **/
    public void mantenimiento()
    {
        estado = 100;
        System.out.println("Se realizo mantenimiento a la bicicleta con exito");
    }
    
    @Override
    public String toString()
    {
        return "Bicicleta: {Nombre:" + nombre + "/Tipo:" + tipo + "/Marca:" + marca + "/Rodado:" + rodado + "/Cuadro:" + cuadro + "/Cantidad de cambios:" + cambios + "/Estado:%" + estado + "/Suciedad:%" + suciedad + "}";
    }
    
}
