package com.mycompany.ejercitacion_prog_1_puntos_30_al_40_epc;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Punto_34
{
    public static void main(String[] args)
    {
        //Protocolo de entrada
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Punto 27");
        
        //Variables
        String fechain;
        boolean band, contrl;
        
        //Formatos de fecha
        DateTimeFormatter formatos = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy").withLocale (new Locale("es", "ES"));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("es", "ES"));
        
        do
        {
            band = true;
            
            System.out.println("Ingrese una fecha en formato dd/mm/yyyy");
        
            fechain = entrada.nextLine();
        
            try
            {
                LocalDate.parse(fechain, format);
            }
            catch(DateTimeException e)
            {
                System.out.println("Fecha invalida reintente");
                band = false;
            }
            
        } while (!band);
        
        LocalDate fecha = LocalDate.parse(fechain, format);
        
        System.out.println(fecha.format(formatos));
        
        System.out.println("Punto 28");
        
        //Variables
        LocalDate fechaact = LocalDate.now();
        long edady, edadm, edadd;
        
        do
        {
            band = true;
            contrl = true;
            
            System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yyyy");
            
            fechain = entrada.nextLine();
            
            try
            {
                LocalDate.parse(fechain, format);
            }
            catch(DateTimeException e)
            {
                System.out.println("Fecha invalida reintente");
                band = false;
                contrl = false;
            }
            
            if (contrl)
            {
                if (LocalDate.parse(fechain, format).isAfter(fechaact))
                {
                    System.out.println("Fecha invalida reintente");
                    band = false;
                }
            }
            
        } while (!band);
        
        fecha = LocalDate.parse(fechain, format);
        
        edady = ChronoUnit.YEARS.between(fecha, fechaact);
        edadm = ChronoUnit.MONTHS.between(fecha, fechaact);
        edadd = ChronoUnit.DAYS.between(fecha, fechaact);
        
        if (edady > 0)
        {
            System.out.println("Tu edad es: " + edady + " Años");
        }
        else if (edadm > 0)
        {
            System.out.println("Tu edad es: " + edadm + " Meses");
        }
        else if (edadd > 0)
        {
            System.out.println("Tu edad es: " + edadd + " Dias");
        }
        else
        {
            System.out.println("Tu edad es 0");
        }
        
    }
    
}
