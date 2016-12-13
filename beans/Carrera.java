package beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by atempa on 12/12/16.
 */
public class Carrera {
    private int id_carrera;
    private String nombre;

    public Carrera() {
    }

    public Carrera(int id_carrera, String nombre) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
    }

    public int getIdCarrera() {
        return id_carrera;
    }

    public void setIdCarrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id_carrera=" + id_carrera +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    
     public  void Escribir() throws IOException {
        String ruta = "C:/Users/Kev/Desktop/Test-master/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El archivo ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el archivo.");
        }
        bw.close();
    }
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    } 
}
