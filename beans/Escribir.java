package beans; 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
	 public static void main(String[] args) throws IOException {
	        String ruta = "C:/Users/CLON/Desktop/Test-master/archivo.txt";
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
	    
	}
