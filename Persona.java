/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoficheros;

/**
 *
 * @author usuario
 */
public class Persona {
     String nombre;
    int edad;
    int altura;    
    public Persona (String nombre, int edad, int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
        }
     /*public int comparaedad(Persona a ){
               if(altura <a.altura){
               int aux=a.altura;
                 altura=a.altura;
                 a.altura=aux;
                 
             }
             
         }*/
         
     
     
    public void mostraDatos(){
        System.out.println ("El nombre es : "+ nombre);
        System.out.println ("La edad es : "+ edad);
        System.out.println ("La altura es : "+ altura);
    }
}
