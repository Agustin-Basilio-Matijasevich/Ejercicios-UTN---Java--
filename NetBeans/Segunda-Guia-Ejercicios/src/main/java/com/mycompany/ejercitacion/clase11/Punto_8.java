package com.mycompany.ejercitacion.clase11;
/**
 *
 * @author agust
 */
public class Punto_8
{
    public static void main(String[] args)
    {
        String agenda[][] = new String[25][8];  //Elementos de la agenda del 1 al 24 y del 1 al 7 respectivamente
        
        inicializar(agenda);
        
        System.out.println("***Agenda limpia***\n\n");
        imprimir(agenda);
        
        cargar(agenda);
        
        System.out.println("***Agenda cargada***\n\n");
        imprimir(agenda);
        
    }
    
    private static void inicializar (String agenda[][])
    {
        agenda[0][0] = "null";
        for (int i = 1; i < 25; i++)
        {
            agenda[i][0] = Integer.toString(i) + "H";
        }
        agenda[0][1] = "Lunes";
        agenda[0][2] = "Martes";
        agenda[0][3] = "Miercoles";
        agenda[0][4] = "Jueves";
        agenda[0][5] = "Viernes";
        agenda[0][6] = "Sabado";
        agenda[0][7] = "Domingo";
        
        for (int i = 1; i < 25; i++)
        {
            for (int j = 1; j < 8; j++)
            {
                agenda[i][j] = "No tengo planes";
            }
        }
    }
    
    private static void imprimir (String agenda[][])
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.print(agenda[0][i] + "            ");
        }
        
        System.out.println();
        
        for (int i = 1; i < 25; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (agenda[i][j].length() == 2)
                {
                    System.out.print(" " + agenda[i][j] + "   ");
                }
                else if (agenda[i][j].length() == 3)
                {
                    System.out.print(agenda[i][j] + "   ");
                }
                else
                {
                    System.out.print(agenda[i][j] + "    ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    
    private static void cargar (String agenda[][])
    {
        agenda[14][1] = "SIST. de PROC. de DATOS";
        agenda[15][1] = "SIST. de PROC. de DATOS";
        agenda[16][1] = "SIST. de PROC. de DATOS";
        agenda[17][1] = "LAB. de COMPUTACION 1";
        agenda[18][1] = "LAB. de COMPUTACION 1";
        agenda[19][1] = "LAB. de COMPUTACION 1";
        agenda[14][2] = "MATEMATICA";
        agenda[15][2] = "MATEMATICA";
        agenda[16][2] = "MATEMATICA";
        agenda[17][2] = "PROGRAMACION 1";
        agenda[18][2] = "PROGRAMACION 1";
        agenda[19][2] = "PROGRAMACION 1";
        agenda[14][3] = "SIST. de PROC. de DATOS";
        agenda[15][3] = "SIST. de PROC. de DATOS";
        agenda[16][3] = "SIST. de PROC. de DATOS";
        agenda[17][3] = "LAB. de COMPUTACION 1";
        agenda[18][3] = "LAB. de COMPUTACION 1";
        agenda[19][3] = "LAB. de COMPUTACION 1";
        agenda[14][4] = "INGLES";
        agenda[15][4] = "INGLES";
        agenda[16][4] = "INGLES";
        agenda[17][4] = "MATEMATICA";
        agenda[18][4] = "MATEMATICA";
        agenda[19][4] = "MATEMATICA";
        agenda[14][5] = "MATEMATICA";
        agenda[15][5] = "MATEMATICA";
        agenda[16][5] = "MATEMATICA";
        agenda[17][5] = "PROGRAMACION 1";
        agenda[18][5] = "PROGRAMACION 1";
        agenda[19][5] = "PROGRAMACION 1";
        
    }
    
}
