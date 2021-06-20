package co.edu.unicesar.practicaFinal.view;

import co.edu.unicesar.practicaFinal.dominio.AudioLibro;
import co.edu.unicesar.practicaFinal.dominio.Libro;
import co.edu.unicesar.practicaFinal.dominio.Publicacion;
import co.edu.unicesar.practicaFinal.negocio.RegistroPublicacion;

import java.io.IOException;
import java.util.Scanner;

public class VistaConsola {
    private final Menus menus = new Menus();
    Scanner scanner = new Scanner(System.in);
    private final RegistroPublicacion registroPublicacion = new RegistroPublicacion();

    public void ejecutarMenus() {
        switch (menus.opcionesPublicaciones()) {
            case 1:
                try {
                    registroPublicacion.insertar();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ejecutarMenus();
                break;
            case 2:
                menus.mostrarProcesos(registroPublicacion.buscarPor(menus.ingresarBuscar()));
                ejecutarMenus();
                break;
            case 3:
                System.out.println(registroPublicacion.leer());
                ejecutarMenus();
                break;
            case 4:
                registroPublicacion.eliminar(menus.ingresarBuscar());
                ejecutarMenus();
                break;
            default:
                System.out.println("error opcion ");
        }
    }


    public Publicacion llerar() {
        switch (menus.opcionRegistro()) {
            case 1:
                Libro libro = new Libro();
                System.out.println("Ingrese el ISBN");
                libro.setISBN(scanner.nextLine());
                System.out.println("Ingrese el titulo");
                libro.setTitulo(scanner.nextLine());
                System.out.println("Ingrese el Año de publicacion");
                libro.setAño(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Ingrese el Autor");
                libro.setAutor(scanner.nextLine());
                System.out.println("Ingrese el costo");
                libro.setCosto(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Ingrese el numero de paginas");
                libro.setnPaginas(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Ingrese la edicion");
                libro.setEdicion(scanner.nextInt());
                scanner.nextLine();
                return libro;
            case 2:
                AudioLibro audioLibro = new AudioLibro();
                System.out.println("Ingrese el ISBN");
                audioLibro.setISBN(scanner.nextLine());
                System.out.println("Ingrese el titulo");
                audioLibro.setTitulo(scanner.nextLine());
                System.out.println("Ingrese el año de publicacion");
                audioLibro.setAño(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Ingrese el autor ");
                audioLibro.setAutor(scanner.nextLine());
                scanner.nextLine();
                System.out.println("Ingrese el costo");
                audioLibro.setCosto(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Ingrese la duracion");
                audioLibro.setDuracion(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Ingrese el formato");
                audioLibro.setFormato(scanner.nextLine());
                System.out.println("Ingrese el peso");
                audioLibro.setPeso(scanner.nextDouble());
                return audioLibro;
            case 3:
                ejecutarMenus();
            default:
                System.out.println("Opcion incorrecta");
        }
        return null;
    }
}