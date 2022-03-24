package com.mycompany.ejercitacion_prog_1_puntos_30_al_40_epc;

//Maneja instantes de tiempo sin zona horaria 
import java.time.Instant;
//Maneja fechas 
import java.time.LocalDate;
//Maneja fecha y tiempo combinado
import java.time.LocalDateTime;
//Maneja tiempo
import java.time.LocalTime;
//Maneja fecha y tiempo combinado teniendo en cuenta zona horaria
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author agust
 */
public class Punto_33
{
    public static void main(String[] args)
    {
        //Crea un formato personalizado para impresion y lectura
        DateTimeFormatter esformat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        
        //Impresiones con formato predeterminado
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println( "La hora actual es: " + LocalTime.now() );
        System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
        System.out.println( "El instante actual es: " + Instant.now() );
        System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );
        
        //impresiones con formato personalizado
        
        System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now().format(esformat) );
        
        /*
        Hay que tener en cuenta que el formato personalizado entiende que todo lo que se encuentre en su esquema de formato debe leerse o imprimirse
        si nosotros formateamos para fecha y hora y queremos imprimir solo fecha por ejemplo se genera un exepcion
        */
        
    }
    
}
