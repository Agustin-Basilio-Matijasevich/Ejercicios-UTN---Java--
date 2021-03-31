package com.mycompany.experimentos.a;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Experimentos
{
    Scanner entrada = new Scanner (System.in);

    public static void main(String[] args)
    {
       verdatoslocale (Locale.getDefault());
       
       Locale locale = new Locale("en", "US");
       
       verdatoslocale (locale);
    }
 
    public static void verdatoslocale (Locale locale)
    {
        System.out.println("Region: " + locale.getDisplayName());
        
        DateFormat df = DateFormat.getDateInstance();
        NumberFormat nf = NumberFormat.getInstance();
        
        System.out.println("Fecha: " + df.format(new Date()));
        System.out.println("Hora: " + nf.format(985.6426));
        
    }
    
}