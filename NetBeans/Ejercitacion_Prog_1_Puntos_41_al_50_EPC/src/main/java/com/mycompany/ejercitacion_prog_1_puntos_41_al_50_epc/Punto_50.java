package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */

class Jugador
{
    final private String nombre, apellido, club;
    final private int DNI;
    private int estado = 0;  //  valor 0 no destaca, valor 1 es mejor anotador, valor 2 es mejor rebotero
    private int puntos[] = new int [4];  //  Las fechas se ven representadas en las posiciones de estos arrays
    private int faltas[] = new int [4];  // Posicion 0 es fecha 1, posicion 1 es fecha 2...
    private int rebotes[] = new int [4];
    
    public Jugador (String nuevonombre, String nuevoapellido, String nuevoclub, int nuevodni)
    {
        nombre = nuevonombre;
        apellido = nuevoapellido;
        club = nuevoclub;
        DNI = nuevodni;
    }
    
    public int getdni ()
    {
        return DNI;
    }
    
    public String getnombre ()
    {
        return nombre;
    }
    
    public String getapellido ()
    {
        return apellido;
    }
    
    public String getclub ()
    {
        return club;
    }
    
    public int[] getpuntos ()
    {
        return puntos;
    }
    
    public int[] getfaltas ()
    {
        return faltas;
    }
    
    public int[] getrebotes ()
    {
        return rebotes;
    }
    
    public void setpuntos (int nuevospuntos[])
    {
        puntos = nuevospuntos;
    }
    
    public void setfaltas (int nuevasfaltas[])
    {
        faltas = nuevasfaltas;
    }
    
    public void setrebotes (int nuevosrebotes[])
    {
        rebotes = nuevosrebotes;
    }
    
    public void setestado (int nuevoestado)
    {
        estado = nuevoestado;
    }
    
    public int getestado ()
    {
        return estado;
    }
    
}

public class Punto_50
{
    
    private static void setearestados (ArrayList <Jugador> jugadores)
    {
        int IDA = 0, TA = 0, IDR = 0, TR = 0;
        int puntosT, rebotesT;
        
        for (int i = 0; i < jugadores.size(); i++)
        {
            puntosT = 0;
            rebotesT = 0;
            
            for (int j = 0; j < 4; j++)
            {
                puntosT += jugadores.get(i).getpuntos()[j];
                rebotesT += jugadores.get(i).getrebotes()[j];
            }
            
            if (puntosT > TA)
            {
                TA = puntosT;
                IDA = i;
            }
            
            if (rebotesT > TR)
            {
                TR = rebotesT;
                IDR = i;
            }
            
        }
        
        jugadores.get(IDA).setestado(1);
        jugadores.get(IDR).setestado(2);
        
    }
    
    private static int buscar_persona (ArrayList <Jugador> jugadores, int DNI)  //Recibe la lista de estudiantes y un dni para buscar, devuelve el ID de lista del estudiante, en caso de que no exista devuelve -1
    {
        // Variable local
        int ID = -1;
        
        for (int i = 0; i < jugadores.size(); i++)  // Busqueda lineal
        {
            if (jugadores.get(i).getdni() == DNI)
            {
                ID = i;
                break;
            }
        }
        
        return ID;
        
    }
    
    private static void listar_jugadores (ArrayList <Jugador> jugadores)
    {
        setearestados (jugadores);
        
        System.out.println("\n");
        
        for (int i = 0; i < jugadores.size(); i++)
        {
            if (jugadores.get(i).getestado() == 1)
            {
                System.out.println("MEJOR ANOTADOR FELICIDADES");
            }
            
            if (jugadores.get(i).getestado() == 2)
            {
                System.out.println("MEJOR REBOTERO");
            }
            
            System.out.println("Nombre: " + jugadores.get(i).getnombre());
            System.out.println("Apellido: " + jugadores.get(i).getapellido());
            System.out.println("DNI: " + jugadores.get(i).getdni());
            System.out.println("Club: " + jugadores.get(i).getclub());
            System.out.println("Puntos fechas del 1 al 4: " + Arrays.toString(jugadores.get(i).getpuntos()));
            System.out.println("Rebotes fechas del 1 al 4: " + Arrays.toString(jugadores.get(i).getrebotes()));
            System.out.println("Faltas fechas del 1 al 4: " + Arrays.toString(jugadores.get(i).getfaltas()));
            System.out.println("\n");
            
        }
        
    }
    
    private static void cargar_indicadores (ArrayList <Jugador> jugadores)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        // Variables locales
        int ID, DNI, fecha;
        int puntos[] = new int [4];  //  Las fechas se ven representadas en las posiciones de estos arrays
        int faltas[] = new int [4];  // Posicion 0 es fecha 1, posicion 1 es fecha 2...
        int rebotes[] = new int [4];
        
        do
        {
            System.out.println("Ingrese el DNI del Jugador: ");
            
            try
            {
                DNI = entrada.nextInt();
            }
            catch (InputMismatchException ime)
            {
                entrada.next();
                DNI = -1;
            }
            
            if (DNI == -1)
            {
                ID = -1;
                System.out.println("El DNI tiene un formato invalido");
            }
            else
            {
                ID = buscar_persona (jugadores, DNI);
            }
            
            if (ID == -1)
            {
                System.out.println("El DNI no pertenece a ningun jugador cargado");
            }
            
        } while (DNI == -1 || ID == -1);
        
        
        for (int i = 0; i < 4; i++)
        {
            fecha = i+1;
            System.out.println("Ingrese los puntos del jugador: " + jugadores.get(ID).getapellido() + " De la fecha: " + fecha);
            puntos[i] = entrada.nextInt();
        }
        
        jugadores.get(ID).setpuntos(puntos);
        
        for (int i = 0; i < 4; i++)
        {
            fecha = i+1;
            System.out.println("Ingrese los rebotes del jugador: " + jugadores.get(ID).getapellido() + " De la fecha: " + fecha);
            rebotes[i] = entrada.nextInt();
        }
        
        jugadores.get(ID).setrebotes(rebotes);
        
        for (int i = 0; i < 4; i++)
        {
            fecha = i+1;
            System.out.println("Ingrese las faltas del jugador: " + jugadores.get(ID).getapellido() + " De la fecha: " + fecha);
            faltas[i] = entrada.nextInt();
        }
        
        jugadores.get(ID).setfaltas(faltas);
        
    }
    
    private static void cargar_jugador (ArrayList <Jugador> jugadores)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        // Variables locales
        int DNI;
        String nombre, apellido, club;
        
        System.out.println("Ingrese Nombre del nuevo jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese Apellido del nuevo jugador");
        apellido = entrada.nextLine();
        System.out.println("Ingrese Club del nuevo jugador");
        club = entrada.nextLine();
        System.out.println("Ingrese DNI del nuevo jugador");
        DNI = entrada.nextInt();
        
        jugadores.add(new Jugador (nombre, apellido, club, DNI));
        
    }
    
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        // Lista de jugadores
        ArrayList <Jugador> jugadores = new ArrayList ();
        // Variables
        int opcionMP; //  Contiene la opcion seleccionada en el menu principal
        
        do
        {
            System.out.println("\n\n");
            System.out.println("Seleccione que desea hacer ingresando el numero de la opcion");
            System.out.println("Opcion 1: Cargar Jugador");
            System.out.println("Opcion 2: Asignar Indicadores");
            System.out.println("Opcion 3: Listar Jugadores");
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
                case 1:
                {
                    cargar_jugador (jugadores);
                    break;
                    
                }
                case 2:
                {
                    cargar_indicadores (jugadores);
                    break;
                    
                }
                case 3:
                {
                    listar_jugadores (jugadores);
                    break;
                    
                }
                case 4:
                {
                    break;
                    
                }
                default:
                {
                    System.out.println("Opcion invalida, por favor reintente.");
                    break;
                    
                }
                
            }
            
        } while (opcionMP != 4);
    }
    
}
