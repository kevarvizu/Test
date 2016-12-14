public class Main {

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
public static void main(String[] args)throws IOException{
		    
      BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
      Alumno[] emp=new Alumno[20];
      Carrera obj=new Carrera();
      int x=0,op;
      String r="n";
     
      do{
      System.out.println("\t\tMENU:\n\n");
      System.out.println("\t1.Registrar\n");
      System.out.println("\t2.Consulta general\n");
      System.out.println("\t3.Bajas\n");
      System.out.println("\t4.Modificaciones\n");
      System.out.println("\t5.Salir\n");
      System.out.println("Elige tu opcion: ");
      op=Integer.parseInt(in.readLine());
      switch(op){
          case 1:
             do{
              obj.registrar(emp, x);
              x++;
              System.out.println("\n\n\n\tdesea continuar s/n");
              r=in.readLine();
              }while(!r.equalsIgnoreCase("n"));
              break;
          case 2:
              obj.muestraContenido("C:/Users/Kev/Desktop/Test-master/archivo.txt");
              break;
          case 3:
              obj.bajas(empZ, x);
              break;
          case 4:
              obj.modificaciones(emp, x);
              break;
          case 5:
              break;
      
     while(op!=5);
   }
}
}
