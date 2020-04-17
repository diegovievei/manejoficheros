
package manejoficheros;
import java.io.*;
import java.util.Scanner;
public class Manejoficheros {

      public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String nombreFichero = "E:\\Pandemia\\Programación\\ejemplo.txt";
        String cr = System.lineSeparator();
        String frase;
        try {
            FileWriter ficherito  = new FileWriter (nombreFichero,true);
            //FileWriter ficherito = new FileWriter(nombreFichero); // crea nuevo
            
            ficherito.write("PRUEBA DE ESCRITURA DE TEXTO" + cr);
            
          /* for (int i = 65; i < 91; i++) {

                frase = ("A" + (char) i + cr);
                ficherito.write(frase);

            }*/
           /* String nombre= teclado.next();
            ficherito.write("Hola me llamo "+nombre+cr);
            int edad= teclado.nextInt();
            ficherito.write("Tengo "+edad+cr);
            
            ficherito.write("FIN  FIN FIN  DE TEXTO" + cr);
            ficherito.close();
            System.out.print("CERRAMOS EL FICHERO");*/
           String nombre=teclado.next();
           int edad=teclado.nextInt();
           int altura=teclado.nextInt();
           
           Persona p=new Persona(nombre,edad,altura);
           ficherito.write(p.edad);
           ficherito.close();
           System.out.print("CERRAMOS EL FICHERO");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    } // fin del main

} // fin de la class y de  todo
