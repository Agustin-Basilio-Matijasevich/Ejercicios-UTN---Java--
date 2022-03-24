package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

/**
 *
 * @author agust
 */
public class Punto_43
{
    public static void ordenar_padron (int dni[], String nombres [], String apellidos[], int telefonos[])
    {
        int mayor;
        int aux1, aux2;
        String aux3, aux4;
        
        for (int i = 0; i < dni.length; i++)
        {
            mayor = dni[i];
            
            for (int j = i+1; j < dni.length; j++)
            {
                if (mayor < dni[j])
                {
                    mayor = dni[j];
                    
                    aux1 = dni[j];
                    aux2 = telefonos[j];
                    aux3 = nombres[j];
                    aux4 = apellidos[j];
                    
                    dni[j] = dni[i];
                    telefonos[j] = telefonos[i];
                    nombres[j] = nombres[i];
                    apellidos[j] = apellidos[i];
                    
                    dni[i] = aux1;
                    telefonos[i] = aux2;
                    nombres[i] = aux3;
                    apellidos[i] = aux4;
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args)
    {
        int lista[] = {43146475, 48146475, 41146475, 50146475, 90146475};
        int telefono[] = {163568, 518040, 102013, 456897, 123548};
        String apellido[] = {"Basilio", "Matijasevich", "Gonzales", "Fernandez", "Pintos"};
        String nombres[] = {"Agustin", "Lucas", "Evangelina", "Roberto", "Matias"};
        
        ordenar_padron (lista, nombres, apellido, telefono);
        
        for (int i = 0; i < lista.length; i++)
        {
            System.out.println("\nDNI: " + lista[i]);
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Apellido: " + apellido[i]);
            System.out.println("Telefono: " + telefono[i] + "\n");
            
        }
        
    }
    
}
