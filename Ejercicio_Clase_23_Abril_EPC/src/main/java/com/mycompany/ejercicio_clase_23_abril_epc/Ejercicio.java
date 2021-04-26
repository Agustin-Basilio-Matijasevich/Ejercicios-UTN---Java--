package com.mycompany.ejercicio_clase_23_abril_epc;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio
{
    public static void main(String[] args)
    {
        //Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        //Variables
        int TmCompetidores[] = new int[161];
        boolean banderaCP = true;
        int opcion;
        
        while (banderaCP)  //Ciclo Menu principal de sistema
        {
            //Menu
            System.out.println("Seleccione que desea hacer:");
            System.out.println("Opcion 1: Cargar el tiempo de un competidor");
            System.out.println("Opcion 2: Mostrar los tiempos almacenados");
            System.out.println("Opcion 3: Salir");
            try
            {
                opcion = entrada.nextInt();
            }
            catch (InputMismatchException ime)
            {
                opcion = 0;
                entrada.next();
            }
            
            switch (opcion)
            {
                case 1: //Algoritmo de carga de tiempo
                {
                    int competidor, tiempo;
                    
                    do
                    {
                        System.out.println("Ingrese el identificador del competidor (Entre 1 y 160)");
                        
                        try
                        {
                            competidor = entrada.nextInt();
                            
                        }
                        catch (InputMismatchException ime)
                        {
                            competidor = 0;
                            entrada.next();
                            
                        }
                        
                        if (competidor < 1 || competidor > 160)
                        {
                            System.out.println("Identificador invalido, Por favor reintente.");
                            
                        }
                        
                    } while (competidor < 1 || competidor > 160);
                    
                    do
                    {
                        System.out.println("Ingrese el tiempo que desea cargar (En Minutos)");
                        
                        try
                        {
                            tiempo = entrada.nextInt();
                        }
                        catch (InputMismatchException ime)
                        {
                            tiempo = 0;
                            entrada.next();
                        }
                        
                        if (tiempo < 1)
                        {
                            System.out.println("Las letras y simbolos no son validas, el tiempo debe ser mayor a 0, Por favor reintente.");
                        }
                        
                    } while (tiempo <1);
                    
                    System.out.println("Cargando...");
                    TmCompetidores[competidor] = tiempo;
                    
                    System.out.println("Operacion completada\n");
                    break;
                    
                }
                case 2:  //Algortimo de ordenamiento e impresion
                {
                    int TmCompetidoresCopia[] = TmCompetidores.clone();
                    int contcompetidores = 0;
                    int identificadorcompetidor = 0;
                    boolean existenjugadores = false;
                    
                    System.out.println("Calculando...\n");
                    
                    Arrays.sort(TmCompetidoresCopia);
                    
                    for (int i = 1; i < TmCompetidoresCopia.length; i++)
                    {
                        if (TmCompetidoresCopia[i] != 0)
                        {
                            if (existenjugadores == false)
                            {
                                existenjugadores = true;
                                
                            }
                            
                            contcompetidores++;
                            
                            for (int j = 1; j < TmCompetidores.length; j++)  //De quien es el tiempo
                            {
                                if (TmCompetidores[j] == TmCompetidoresCopia[i])
                                {
                                    identificadorcompetidor = j;
                                }
                            }
                            
                            switch (contcompetidores)
                            {
                                case 1:
                                {
                                    System.out.println("PODIO:");
                                    
                                    System.out.println("Ganador: Competidor: " + identificadorcompetidor + " Tiempo (minutos): " + TmCompetidoresCopia[i]);
                                    
                                    break;
                                    
                                }
                                case 2:
                                {
                                    System.out.println("Segundo Lugar: Competidor: " + identificadorcompetidor + " Tiempo (minutos): " + TmCompetidoresCopia[i]);
                                    
                                    break;
                                    
                                }
                                case 3:
                                {
                                    System.out.println("Tercer Lugar: Competidor: " + identificadorcompetidor + " Tiempo (minutos): " + TmCompetidoresCopia[i]);
                                    
                                    System.out.println("Fin Podio");
                                    
                                    break;
                                    
                                }
                                default:
                                {
                                    System.out.println("Posicion: " + contcompetidores + " Competidor: " + identificadorcompetidor + " Tiempo (minutos): " + TmCompetidoresCopia[i]);
                                    
                                    break;
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                    if (existenjugadores == false)
                    {
                        System.out.println("No se cargo el tiempo de ningun jugador\n");
                        
                    }
                    else
                    {
                        System.out.print("\n");
                    }
                    
                    break;
                    
                }
                case 3:  //Salida del sistema
                {
                    System.out.println("Saliendo...\n");
                    banderaCP = false;
                    break;
                    
                }
                default: // En caso de opcion de menu invalida
                {
                    System.out.println("Opcion invalida, por favor reintente.\n");
                    break;
                    
                }
                
            }
            
        }
        
    }
    
}
