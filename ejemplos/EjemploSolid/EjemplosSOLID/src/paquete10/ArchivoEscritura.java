package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoEscritura {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> peliculas;

    public ArchivoEscritura(String c) {
        nombreArchivo = c;
        establecerListaPeliculas();

        try {

            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaPeliculas().size() > 0) {
                for (int i = 0; i < obtenerListaPeliculas().size(); i++) {
                    establecerPeliculas(obtenerListaPeliculas().get(i));
                    establecerSalida();
                }
            }

        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }

    public void establecerNombreArchivo(String c) {
        nombreArchivo = c;
    }

    public void establecerPeliculas(GeneradorPeliculas c) {
        registro = c;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void establecerListaPeliculas() {
        ArchivoLectura l = new ArchivoLectura(obtenerNombreArchivo());
        l.establecerGeneradores();
        peliculas = l.obtenerGeneradores();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaPeliculas() {
        return peliculas;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }

}
