package Codigo_Galo;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;
//a esa clase le quedo el nombre "stock", se tendria que llamar "metodos", pero no afecta al funcionamiento.

/**
 *
 * @author Galo
 */
public class Stock
{
    private static final long serialVersionUID = -1L;
    Scanner sc = new Scanner(System.in);
    Scanner teclado = new Scanner(System.in);
    String Tipo;
    String Marca;
    double Rodado;
    String TipoDeFrenos;
    String Frame;
    Bici aux;
    Bici aux1;
    Vector vector = new Vector();
    Vector vector1 = new Vector();
    ObjectOutputStream oos;
    ObjectInputStream ois;
    File Archivo = new File("C:\\ficheros\\data.txt");

    public void cargarDatos() {
        System.out.println("\n----Cargar----\n");
        int c = 1;
        int o = 1;
        while (c == 1) {
            System.out.println("Tipo: \n1- MTB\n2- Road\n3- Urbana\n4- Infantil\n");
            int t = sc.nextInt();
            switch (t) {
                case 1:
                    Tipo = "MTB";
                    break;
                case 2:
                    Tipo = "Road";
                    break;
                case 3:
                    Tipo = "Urbana";
                    break;
                case 4:
                    Tipo = "Infantil";
                    break;
                default:
                    System.out.println("\n-----------------------------\nLas opciones son del 1 al 4.\n-----------------------------");
                    break;
            }
            System.out.println("Marca: ");
            String m = teclado.nextLine();
            Marca = m;
            System.out.println("Rodado (en pulgadas y sin comillas): ");
            double r = sc.nextDouble();
            Rodado = r;
            System.out.println("Tipo De Frenos: \n1- Hidraulicos\n2- Mecanicos\n");
            int f = sc.nextInt();
            switch (f) {
                case 1:
                    TipoDeFrenos = "Hidraulicos";
                    break;
                case 2:
                    TipoDeFrenos = "Mecanicos";
                    break;
                default:
                    System.out.println("\n-----------------------------\nLas opciones son del 1 al 2.\n-----------------------------");
                    break;
            }
            System.out.println("Talle del Frame: \n1- S (16'')\n2- M (17.5'')\n3- L (19'')\n4- XL (+20'')\n");
            int tf = sc.nextInt();
            switch (tf) {
                case 1:
                    Frame = "S";
                    break;
                case 2:
                    Frame = "M";
                    break;
                case 3:
                    Frame = "L";
                    break;
                case 4:
                    Frame = "XL";
                    break;
                default:
                    System.out.println("\n-----------------------------\nLas opciones son del 1 al 4.\n-----------------------------");
                    break;
            }
            Bici bike = new Bici(Tipo, Marca, Rodado, TipoDeFrenos, Frame);
            System.out.println("-Datos cargados-" + "\nTipo: " + bike.getTipo() + "\nMarca: " + bike.getMarca() + "\nRodado: " + bike.getRodado() + "''\nTipo de frenos: " + bike.getTipoDeFrenos() + "\nTalle del frame: " + bike.getFrame());
            vector.add(bike);
            try {
                oos = new ObjectOutputStream(new FileOutputStream(Archivo));
                oos.writeObject(vector);
                oos.close();
            } catch (IOException E) {
            }

            System.out.println("\n¿Desea cargar mas?\n1- SI\n2- NO\n");
            c = sc.nextInt();
        }
    }

    public void mostrarStock() {
        try {
            ois = new ObjectInputStream(new FileInputStream(Archivo));
            vector = (Vector) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            try {
                oos = new ObjectOutputStream(new FileOutputStream(Archivo));
                oos.writeObject(vector);
                oos.close();

            } catch (IOException E) {
            } System.out.println("//////////////////////////////////////////////////////////////////\nNo se encontro el archivo o se encuentra vacio, cargue un elemento\n//////////////////////////////////////////////////////////////////");
        }
        int st = vector.size();
        System.out.println("---------------------\nARTICULOS EN STOCK: " + st + "\n---------------------");
        for (int i = 0; i < st; i++) {
            aux = (Bici) vector.get(i);
            System.out.println("||Tipo: "+aux.getTipo() + "   ||Marca: "+aux.getMarca() +"   ||Rodado: "+aux.getRodado()+"''   ||Talle del Frame: "+aux.getFrame() + "   ||Tipo de frenos: "+aux.getTipoDeFrenos());
        }
    }

    public void buscarArticulo() {
        boolean salir = false;
        while (!salir) {
            System.out.println("----------------------\n¿Criterio de busqueda?\n----------------------\n1- Marca\n2- Rodado\n3- Talle del Frame\n4- Salir al Menu Principal");
            int b = sc.nextInt();
            switch (b) {
                case 1:
                    buscarMarcas();
                    break;
                case 2:
                    buscarRodados();
                    break;
                case 3:
                    buscarTalledelframe();
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("\n-----------------------------\nLas opciones son del 1 al 4.\n-----------------------------");
                    break;
            }
        }

    }

    public void buscarMarcas() {
        try {
            ois = new ObjectInputStream(new FileInputStream(Archivo));
            vector = (Vector) ois.readObject();
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int st = vector.size();
        System.out.println("Marcas: // (Tipo, Rodado, Talle del Frame y Tipo de Frenos)");
        for (int i = 0; i < st; i++) {
            aux = (Bici) vector.get(i);
            System.out.println(aux.getMarca() + " ----------> " + aux.getTipo() + ", " + aux.getRodado() + "'', " + aux.getFrame() + ", " + aux.getTipoDeFrenos());
        }
        int c = 0;
        int n = 0;
        System.out.println("\n¿Desea buscar una Marca de forma manual?\n1- SI\n2- NO\n");
        c = sc.nextInt();
        if (c == 1) {
            String bm;
            System.out.println("Ingrese la Marca a buscar: \n");
            bm = teclado.nextLine();
            for (int i = 0; i < st; i++) {
                aux = (Bici) vector.get(i);
                if (aux.getMarca().equals(bm)) {
                    n++;
                    if (n==1) {System.out.println("Marcas: // (Tipo, Rodado, Talle del Frame y Tipo de Frenos)");}
                    System.out.println(aux.getMarca() + " ----------> " + aux.getTipo() + ", " + aux.getRodado() + "'', " + aux.getFrame() + ", " + aux.getTipoDeFrenos());
                }
            } if  (n==0) {
                System.out.println("No se encontraron coincidencias");
            }
        }
    }

    public void buscarRodados() {
        try {
            ois = new ObjectInputStream(new FileInputStream(Archivo));
            vector = (Vector) ois.readObject();
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int st = vector.size();
        System.out.println("Rodados: // (Tipo, Marca, Talle del Frame y Tipo de Frenos)");
        for (int i = 0; i < st; i++) {
            aux = (Bici) vector.get(i);
            System.out.println(aux.getRodado()+"'' ----------> "+aux.getTipo() + ", " + aux.getMarca() + ", " + aux.getFrame() + ", " + aux.getTipoDeFrenos());
        }
        int c = 0;
        int n = 0;
        System.out.println("\n¿Desea buscar una Rodado de forma manual?\n1- SI\n2- NO\n");
        c = sc.nextInt();
        if (c == 1) {
            double bm;
            System.out.println("Ingrese el tamaño del Rodado a buscar: \n");
            bm = sc.nextDouble();
            for (int i = 0; i < st; i++) {
                aux = (Bici) vector.get(i);
                if (aux.getRodado()==bm) {
                    n++;
                    if (n==1) {System.out.println("Rodados: // (Tipo, Marca, Talle del Frame y Tipo de Frenos)");}
                    System.out.println(aux.getRodado()+"'' ----------> "+aux.getTipo() + ", " + aux.getMarca() + ", " + aux.getFrame() + ", " + aux.getTipoDeFrenos());
                }
            } if  (n==0) {
                System.out.println("No se encontraron coincidencias");
            }
        }
    }

    public void buscarTalledelframe() {
        try {
            ois = new ObjectInputStream(new FileInputStream(Archivo));
            vector = (Vector) ois.readObject();
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int st = vector.size();
        System.out.println("Talles del frame: // (Tipo, Marca, Rodado y Tipo de Frenos)");
        for (int i = 0; i < st; i++) {
            aux = (Bici) vector.get(i);
            System.out.println(aux.getFrame()+" ----------> "+aux.getTipo() + ", " + aux.getMarca() + ", " + aux.getRodado() + "'', " + aux.getTipoDeFrenos());
        }
        int c = 0;
        int n = 0;
        System.out.println("\n¿Desea buscar un Talle de Frame de forma manual?\n1- SI\n2- NO\n");
        c = sc.nextInt();
        if (c == 1) {
            String bm;
            System.out.println("Ingrese el Talle de Frame a buscar: \n");
            bm = teclado.nextLine();
            for (int i = 0; i < st; i++) {
                aux = (Bici) vector.get(i);
                if (aux.getFrame().equals(bm)) {
                    n++;
                    if (n==1) {System.out.println("Talles del frame: // (Tipo, Marca, Rodado y Tipo de Frenos)");}
                    System.out.println(aux.getFrame()+" ----------> "+aux.getTipo() + ", " + aux.getMarca() + ", " + aux.getRodado() + "'', " + aux.getTipoDeFrenos());
                }
            } if  (n==0) {
                System.out.println("No se encontraron coincidencias");
            }
        }
    }

    public void preStock() {
        Bici b1 = new Bici("MTB","Specialized", 26, "Hidraulicos", "M");
        Bici b2 = new Bici("MTB","Specialized", 24, "Hidraulicos", "L");
        Bici b3 = new Bici("Road","Scott", 26, "Mecanicos", "L");
        Bici b4 = new Bici("Road","Scott", 26, "Hidraulicos", "M");
        Bici b5 = new Bici("Urbana","Trek", 24, "Hidraulicos", "L");
        Bici b6 = new Bici("Urbana","Trek", 20, "Mecanicos", "XL");
        Bici b7 = new Bici("Urbana","Giant", 20, "Mecanicos", "XL");
        Bici b8 = new Bici("Infantil","Giant", 14, "Mecanicos", "S");
        Bici b9 = new Bici("Infantil","Giant", 12, "Mecanicos", "S");
        Bici b10 = new Bici("Infantil","Trek", 12, "Mecanicos", "S");
        vector.add(b1);
        vector.add(b2);
        vector.add(b3);
        vector.add(b4);
        vector.add(b5);
        vector.add(b6);
        vector.add(b7);
        vector.add(b8);
        vector.add(b9);
        vector.add(b10);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(Archivo));
            oos.writeObject(vector);
            oos.close();
        } catch (IOException E) {
        }
    }
}
