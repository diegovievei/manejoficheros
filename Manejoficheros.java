
package manejoficheros;
import java.io.*;
import java.util.Scanner;
public class Manejoficheros {

      public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
        String ficheroescritura = "E:\\Pandemia\\Programación\\ejemplo.txt";
        String ficherolectura = "E:/Pandemia/Programación/ejemplo3.txt";
//          System.out.println("nombre");
//        String nombre=teclado.next();
//          System.out.println("Edad");
       // int edad=teclado.nextInt();
         // System.out.println("Altura");
        //int altura=teclado.nextInt();
        //Persona p=new Persona(nombre,edad,altura);
        Persona p2=new Persona("Maria",27,178);
        Leer_fichero insertarpersona= new Leer_fichero();
        insertarpersona.escribir2(ficheroescritura, p2);
        
     /* Leer_fichero escribir= new Leer_fichero();
        escribir.escribir(ficheroescritura);*/
       
        Leer_fichero accediendo= new Leer_fichero();
        accediendo.lee(ficherolectura);        
         // System.out.println("a");
       

    } // fin del main

} // fin de la class y de  todo


