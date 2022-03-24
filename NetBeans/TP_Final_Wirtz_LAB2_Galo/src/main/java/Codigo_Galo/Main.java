package Codigo_Galo;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Galo
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stock archivo = new Stock();
        boolean salir = false;
        Stock cargar = new Stock();
        Stock stock = new Stock();
        Stock buscar = new Stock();
        File Archivo = new File("C:\\ficheros\\data.txt");
        Stock pre = new Stock();



        System.out.println("\n##############\n# Bienvenido #\n##############");
        pre.preStock();
        while (!salir){
            System.out.println("--------------\nMENU PRINCIPAL\n--------------\n¿Que desea realizar?\n1- Cargar\n2- Buscar\n3- Mostrar Stock\n4- Salir");
            int d = sc.nextInt();

            switch (d) {
                case 1:
                    int c = 0;
                    System.out.println("\nADVERTENCIA: \nLa carga de datos borra el pre stock cargado en el archivo (reincie el programa para recargar el pre stock).\n¿Desea continuar?\n1- SI\n2- NO\n");
                    c = sc.nextInt();
                    if (c == 1) {
                    cargar.cargarDatos();
                    }
                    break;
                case 2:
                    buscar.buscarArticulo();
                    break;
                case 3:
                    stock.mostrarStock();
                    break;
                case 4:
                    int e = 0;
                    System.out.println("\n¿Esta seguro que desea salir?\n1- SI\n2- NO\n");
                    e = sc.nextInt();
                    if (e==1) {
                        System.out.println("\nSaliendo...\n");
                        salir = true;
                    } break;
                default:
                    System.out.println("\n-----------------------------\nLas opciones son del 1 al 4.\n-----------------------------");
                    break;
            }
            
        }
            
    }
    
}