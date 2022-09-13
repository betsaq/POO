//Implemente la clase Persona. Una persona tiene un nombre y una fecha de
//nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
//siguientes métodos:
//Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package pkg12_persona;

import Persona.Persona;


public class Main {

    public static void main(String[] args) {
       
        Persona P1= new Persona();
        Persona P2= new Persona();
        
        P1.setNombre("Betsa");
        P2.setNombre(P1.getNombre());
        
        
        
        
        System.out.println(P1.equals(P2));
        System.out.println(P1.getNombre().equals(P2.getNombre()));
//        P1.crearPersona();
//        P1.calcularEdad();
//        P1.menorQue(50);
//        P1.mostrarPersona(P1);
        

        P1.conocerPersona(P1);
    }
    
   
    
}
