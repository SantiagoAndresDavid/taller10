package co.edu.unicesar.practicaFinal.negocio;


import co.edu.unicesar.practicaFinal.data.ArchivoDeObjetos;
import co.edu.unicesar.practicaFinal.data.ArchivoDeTexto;
import co.edu.unicesar.practicaFinal.data.ArrayAccesoDatos;
import co.edu.unicesar.practicaFinal.data.IAccesoDatos;
import co.edu.unicesar.practicaFinal.dominio.Publicacion;
import co.edu.unicesar.practicaFinal.view.Menus;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class RegistroPublicacion {
    private ArchivoDeTexto archivoDeTexto;
    private ArrayAccesoDatos arrayAccesoDatos;
    private ArchivoDeObjetos archivoDeObjetos;
    private IAccesoDatos datos;
    private final static RegistroPublicacion instance = new RegistroPublicacion();

    public static RegistroPublicacion getInstance() {
        return instance;
    }

    public RegistroPublicacion() {
        this.archivoDeObjetos = new ArchivoDeObjetos();
        this.archivoDeTexto = new ArchivoDeTexto();
        this.arrayAccesoDatos = new ArrayAccesoDatos();
        this.datos = new ArchivoDeTexto();
    }

    public void insertar() throws IOException {
        Menus menus = new Menus();
        Publicacion publicacion = menus.llerar();
        datos.insertarPublicacion(publicacion);
    }

    public List<Publicacion> leer() {
        try {
            return datos.leerPublicaciones();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Publicacion buscarPor(String buscar) {
        try {
            return datos.buscarPublicacion(buscar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void  eliminar(String buscar){
        try {
            datos.eliminarPublicacion(buscar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
