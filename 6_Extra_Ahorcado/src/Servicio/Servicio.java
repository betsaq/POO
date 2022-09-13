package Servicio;

import Entidades.ahorcado;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);
    ahorcado AH = new ahorcado();

    //• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0.
    public ahorcado crearjuego(String[] palabra) {
        System.out.println("INGRESE UNA PALABRA. Usted dispone de 10 jugadas máximas");
        palabra = leer.nextLine();
        AH.setPalabra(palabra);

        
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        int longitudpalabra = 0;
        palabra.length() = longitudpalabra;
        return null;

        
        
        
    }



//• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.

 public ahorcado longitud(){




}


//• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

 public ahorcado buscar(String letra){




}




//• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.


 
 public ahorcado encontradas(String letra){




}
 
 
 

//• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

public ahorcado intentos(){



}



//• Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
//package pkg6_extra_ahorcado;

public ahorcado juego(){
    
    
    
    
    
    
}



}