package beans;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    int p=0, pos=-1;
    
    public void registrar(Alumno[] em , int x)throws IOException{
   	 
       BufferedReader i= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("\n\n\nId del alumno: ");
       int id=Integer.parseInt(i.readLine()); 
       System.out.println("\nNombre del alumno:  ");
       String no=i.readLine();
       System.out.println("\nApellido Paterno: ");
       String ap=i.readLine();
       System.out.println("\nApellido Materno: ");
       String am=i.readLine();
       System.out.println("Numero de control: ");
       String con =i.readLine();
       System.out.println("Carrera: ");
       String car=i.readLine();
  
       em[x]= new Alumno(id,no,ap,am,con,car);
    
       p=x;
    }
    
    public int bajas(Alumno[] empZ, int x) throws IOException{
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        int h = 0;
        System.out.println("Introduzca el nombre:");
        String baja = k.readLine();
        for(int y=0;y<x;y++){
            String nomb = empZ[y].getNombre();
            if(nomb.equalsIgnoreCase(baja)){
                h = y;
                System.out.println(empZ[h].getNombre());
                System.out.println("Desea darlo de baja? (si/no):");
                String r = k.readLine();
                if(r.equalsIgnoreCase("si"))
                    for(int a=h;a<x;a++)
                        empZ[a]=empZ[a+1];
                x--;
                p--;
                y=x;
                if(r.equalsIgnoreCase("no"))
                    System.out.println("No se eliminara");
            }
        }
        return x;
    }
    public void modificaciones(Alumno[] e6, int x)throws IOException{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));   
        int ll=0;
        String desc="NULL";
              System.out.println("\nIngresa nuevo nombre: ");
              String busca= in.readLine();
              for(int i=0;i<x;i++){
                 desc=e6[i].getNombre();
                  if(desc.equalsIgnoreCase(busca)){
                         ll=i;
                  }
              }
              System.out.println("Ingresa nuevo apellido paterno: ");
              String busca2= in.readLine();
              for(int i=0;i<x;i++){
                 desc=e6[i].getNombre();
                  if(desc.equalsIgnoreCase(busca2)){
                         ll=i;
}
   }
              System.out.println("Ingresa nuevo apellido materno: ");
              String busca3= in.readLine();
              for(int i=0;i<x;i++){
                 desc=e6[i].getNombre();
                  if(desc.equalsIgnoreCase(busca3)){
                         ll=i;
}
}
              System.out.println("Ingresa nuevo numero de control: ");
              String busca4= in.readLine();
              for(int i=0;i<x;i++){
                 desc=e6[i].getNombre();
                  if(desc.equalsIgnoreCase(busca4)){
                         ll=i;
}
}
              System.out.println("Ingresa nueva carrera: ");
              String busca5= in.readLine();
              for(int i=0;i<x;i++){
                 desc=e6[i].getNombre();
                  if(desc.equalsIgnoreCase(busca5)){
                         ll=i;
}
}
    }
}
