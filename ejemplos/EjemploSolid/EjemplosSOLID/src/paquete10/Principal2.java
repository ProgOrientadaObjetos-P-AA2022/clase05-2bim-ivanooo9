/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

public class Principal2 {

    public static void main(String[] args) {

        String nombreArchivo = "Generadores.data";

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println("NETFLIX\n");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println("AMAZON MOVIE \n");

        System.out.println(gp2.obtenerUrl());

        System.out.println("---------------------------");

        APiDirectvGO api3 = new APiDirectvGO();
        api3.establecerApiKey("110022");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println("DIRECTV GO\n");

        System.out.println(gp3.obtenerUrl());

        System.out.println("---------------------------");

        APiStarPlus api4 = new APiStarPlus();
        api4.establecerApiKey("178595");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println("STAR PLUS\n");
        System.out.println(gp4.obtenerUrl());

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerPeliculas(gp);
        archivo.establecerSalida();
        archivo.establecerPeliculas(gp2);
        archivo.establecerSalida();
        archivo.establecerPeliculas(gp3);
        archivo.establecerSalida();
        archivo.establecerPeliculas(gp4);
        archivo.establecerSalida();

    }
}
