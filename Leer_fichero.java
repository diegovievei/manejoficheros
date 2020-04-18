package manejoficheros;

import java.io.FileReader;
import java.io.*;

public class Leer_fichero {//No es el mejor nombre para la clase, lo sé
    
    public void lee(String fichero){
        try{
        FileReader entrada= new FileReader (fichero);
        int c=entrada.read();
         // System.out.println(c);//Imprime el caracter ASCII correspondiente al caracter del documento.
            char letra=(char)c;
            //System.out.println((char)c);//Tambien imprimira un 13 q corresponde al retorno de carro
           // System.out.println(letra);
         while(c!=-1){ //Metodo reader, devuelve -1 si es el ultimo caracter del documento
             System.out.print(letra);
             c=entrada.read();
             letra=(char)c;
            // System.out.print(letra);
             }
            System.out.println();
            System.out.println(c);//Para q imprima un -1 como muestra de q llego al final
        
        }catch (IOException e) {
            //ex.printStackTrace();
            System.out.println("No se ha encontrado el fichero");
        }
        }
    
    public void escribir(String nombreFichero){
        String cr = System.lineSeparator();
        try{
         FileWriter fichero= new FileWriter (nombreFichero,true);
         fichero.write("Prueba escritura"+cr);
        
                   
        for (int i = 65; i < 91; i++) {
            fichero.write("A" + (char) i + cr);
           }
            fichero.write("FIN  FIN FIN  DE TEXTO" + cr);
            fichero.close();
            System.out.print("CERRAMOS EL FICHERO"+ cr);
            
        }catch (IOException e) {
            //ex.printStackTrace();
            System.out.println("No se ha encontrado el fichero");
        }
    }
    
    public void escribir2(String nombreFichero, Persona p){
        String cr = System.lineSeparator();
        try{
            FileWriter fichero= new FileWriter (nombreFichero,true);
            fichero.write("Prueba escritura"+cr);
            fichero.write("Me llamo "+ p.nombre+cr);
            fichero.write("Tengo "+p.edad+cr);
            fichero.write("Mido "+p.altura+cr);
            fichero.write("SIguiente");
            fichero.write("Prueba escritura"+cr);
            fichero.write("Me llamo "+ p.nombre+cr);
            fichero.write("Tengo "+(char)p.edad+cr);
            fichero.write("Mido "+(char)p.altura+cr);
            fichero.close();
            System.out.print("CERRAMOS EL FICHERO"+ cr);
        
        }catch (IOException e) {
            //ex.printStackTrace();
            System.out.println("No se ha encontrado el fichero");
        }
        
    }
}
