package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class Estudiante  //Bajo objetos basados en esta clase vamos a almacenar a los estudiantes
{
    //Si o si el objeto tiene dni nombre y apellido y no se puede cambiar
    private final int DNI;
    private int parcial_1;
    private int recu_1;
    private int parcial_2;
    private int recu_2;
    private final String nombre;
    private final String apellido;
    private String estado;
    private int ordenar;
    
    public Estudiante(int nuevodni, String nuevonombre, String nuevoapellido, int novoparcial1, int novoparcial2, int novorecu1, int novorecu2, String nuevoestado, int novordenar)  //Constructor
    {
        DNI = nuevodni;
        nombre = nuevonombre;
        apellido = nuevoapellido;
        parcial_1= novoparcial1;
        recu_1 = novorecu1;
        parcial_2 = novoparcial2;
        recu_2 = novorecu2;   
        estado = nuevoestado;
        ordenar = novordenar;
    }
    
    public int getdni()  //Devuelve el dni
    {
        return DNI;
    }
    
    public String getnombre ()  //Devuelve el nombre
    {
        return nombre;        
    }
    
    public String getapellido ()  //Devuelve el apellido
    {
        return apellido;       
    }
    
    public String getestado ()
    {
        return estado;
    }
    
    public void setestado (String nuevoestado)
    { 
        estado = nuevoestado;
    }
    
    public int getordenar ()
    {
        return ordenar;
    }
    
    public void setordenar (int novordenar)
    {
        ordenar = novordenar;
    }
    
    public int getparcial1 ()  //Devuelve parcial 1
    {
        return parcial_1;      
    }
    
    public int getrecuperatorio1 ()  //Devuelve recu 1
    {
        return recu_1;       
    }
    
    public int getparcial2 ()  //Devuelve parcial 2
    {
        return parcial_2;        
    }
    
    public int getrecuperatorio2 ()  //Devuelve recu 2
    {
        return recu_2;       
    }
    
    public void setparcial1 (int nuevanota)  //Recibe un valor y lo carga en parcial 1
    {
        this.parcial_1 = nuevanota;       
    }
    
    public void setrecuperatorio1 (int nuevanota)  //Recibe un valor y lo carga en recu 1
    {
        this.recu_1 = nuevanota;        
    }
    
    public void setparcial2 (int nuevanota)  //Recibe un valor y lo carga en parcial 2
    {
        this.parcial_2 = nuevanota;       
    }
    
    public void setrecuperatorio2 (int nuevanota)  //Recibe un valor y lo carga en recu 2
    {
        this.recu_2 = nuevanota;       
    }
}

public class Punto_49
{
    private static Estudiante estudiante;
    private static String nombre, apellido, estado;
    public static int ID,DNI, parcial_1, parcial_2, recu_1, recu_2, ordenar;
    public static final ArrayList <Estudiante> estudiantes = new ArrayList (); // Lista de estudiantes
    public static final ArrayList<Estudiante> listaCopia = new ArrayList<Estudiante>(estudiantes);
    
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        // Variables
        int opcionMP; //  Contiene la opcion seleccionada en el menu principal
        
        do
        {
            System.out.println("\n\n");
            System.out.println("Seleccione que desea hacer ingresando el numero de la opcion");
            System.out.println("Opcion 1: Cargar Estudiante");
            System.out.println("Opcion 2: Asignar notas");
            System.out.println("Opcion 3: Mostrar todos los estudiantes");
            System.out.println("Opcion 4: Salir");
           
            try
            {
                opcionMP = entrada.nextInt();
                
            }
            catch (InputMismatchException ime)
            {
                opcionMP = 0;
                entrada.next();
                
            }
            
            switch (opcionMP)
            {
                case 1 -> /*Cargar datos de estudiantes*/
                {
                    cargar_estudiante(estudiantes);

                }
                
                case 2 -> /*Cargar notas y asignar estado de la materia*/
                {
                    asignar_notas(estudiantes); 
                    estado(estudiantes);
                }

                
                case 3 -> /*Mostrar lista de estudiantes, con notas y estado de la materia*/
                {
                    ordenar(estudiantes);
                    mostrar_estudiantes(estudiantes);    
                }
                
                case 4 -> /*Salir*/
                {
                }
                
                default -> /*Datos invalidos*/
                {
                    System.out.println("Opcion invalida, por favor reintente.");
                }
                
            }
            
        } while (opcionMP != 4);
        
    }
    
    private static void cargar_estudiante (ArrayList <Estudiante> estudiantes)
    {
        Scanner entrada = new Scanner (System.in);    
        System.out.println("Ingrese el Nombre del alumno: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido del alumno: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        
        /*Cargar datos en la lista*/
        estudiante = new Estudiante(DNI, nombre, apellido, parcial_1, parcial_2, recu_1, recu_2, estado, ordenar);
        estudiantes.add(estudiante);
    }
    
    private static int buscar_persona (ArrayList <Estudiante> estudiantes, int DNI)  //Recibe la lista de estudiantes y un dni para buscar, devuelve el ID de lista del estudiante
    {
        ID = -1;
        
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante p = estudiantes.get(i);
            if (p.getdni()== DNI) 
            {
                ID = i;
                break; 	
            }	
        }	
        
        return ID; 
    }
    
    private static void asignar_notas (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);  

        do
        {
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        ID = buscar_persona(estudiantes,DNI);
        if (ID == -1)
        {
            System.out.println("El DNI ingresado es incorrecto, intentelo nuevamente.");
        }
        }
        while (ID == -1);
        
        System.out.println("Ingrese la nota del primer parcial: ");
        estudiantes.get(ID).setparcial1(entrada.nextInt());   
        System.out.println("Ingrese la nota del segundo parcial: ");
        estudiantes.get(ID).setparcial2(entrada.nextInt());
        
        if (estudiantes.get(ID).getparcial1() < 6)
        {
            System.out.println("Ingrese la nota del recuperatorio del primer parcial: ");
            estudiantes.get(ID).setrecuperatorio1( entrada.nextInt());
        }
        if (estudiantes.get(ID).getparcial2() < 6)
        {
            System.out.println("Ingrese la nota del recuperatorio del seguno parcial: ");
            estudiantes.get(ID).setrecuperatorio2(entrada.nextInt());
        }
        
        ordenar = estudiantes.get(ID).getparcial1() + estudiantes.get(ID).getparcial2();
        estudiantes.get(ID).setordenar(ordenar);
    }
    
    private static void estado (ArrayList <Estudiante> estudiantes)
    {
        
         
        for (int i = 0; i < estudiantes.size(); i++) 
        {
          if (estudiantes.get(i).getparcial1() >= 8 && estudiantes.get(i).getparcial2() >= 8)
          {
            estudiantes.get(i).setestado("promocional");
          }else if (estudiantes.get(i).getparcial1()>= 6 && estudiantes.get(i).getparcial2() >= 6 || estudiantes.get(i).getrecuperatorio1() >= 6 && estudiantes.get(i).getparcial2() >= 6 || 
                    estudiantes.get(i).getrecuperatorio2() >= 6 && estudiantes.get(i).getparcial1() >= 6 || estudiantes.get(i).getrecuperatorio1() >= 6 && estudiantes.get(i).getrecuperatorio2()>= 6)
          {
            estudiantes.get(i).setestado("regular");
          }else 
          {
            estudiantes.get(i).setestado("reprobado");
          }
        }
        
    }   
    
    public static void ordenar (ArrayList<Estudiante>  estudiantes)
    {
        estudiantes.sort(Comparator.comparing(Estudiante::getordenar).reversed()); 
    }
    
    private static void mostrar_estudiantes (ArrayList<Estudiante> estudiantes)
    {
        for (int i = 0; i < estudiantes.size(); i++) {
        /*Se imprimen datos y notas del estudiante*/
        if (i == 0)
        {
            System.out.println("\n\n**EL MEJOR ALUMNO**");
        }else
        {
            System.out.println("\n\n**ALUMNO**");
        }
       
        System.out.println("DNI: " + estudiantes.get(i).getdni());
        System.out.println("Nombre: " + estudiantes.get(i).getnombre());
        System.out.println("Apellido: " + estudiantes.get(i).getapellido());
        System.out.println("Estado: " + estudiantes.get(i).getestado());
        System.out.println("Nota 1er Parcial : " + estudiantes.get(i).getparcial1());
        System.out.println("Nota 2do Parcial : " + estudiantes.get(i).getparcial2());
       
        /*Se imprimen las notas de los recuperatorios solo si el estudiante los realizo*/
        if (estudiantes.get(i).getparcial1()< 6)
        { 
        System.out.println("Nota Recuperatorio 1er Parcial: " + estudiantes.get(i).getrecuperatorio1());
        }
        if (estudiantes.get(i).getparcial2() < 6)
        {
        System.out.println("Nota Recuperatorio 2do Parcial: " + estudiantes.get(i).getrecuperatorio2());
        } 
        }
        
        
    }
    
}
