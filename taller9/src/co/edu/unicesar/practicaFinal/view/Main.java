package co.edu.unicesar.practicaFinal.view;

import co.edu.unicesar.practicaFinal.data.ArchivoDeObjetos;
import co.edu.unicesar.practicaFinal.data.ArchivoDeTexto;
import co.edu.unicesar.practicaFinal.data.IAccesoDatos;
import co.edu.unicesar.practicaFinal.dominio.Libro;
import co.edu.unicesar.practicaFinal.negocio.RegistroPublicacion;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new VistaConsola().ejecutarMenus();
    }

}