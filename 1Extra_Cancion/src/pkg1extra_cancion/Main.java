//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes.
package pkg1extra_cancion;

import EntidadesCancion.Cancion;
import ServicioCancion.Servicio;

public class Main {

    public static void main(String[] args) {

        Servicio SC = new Servicio();

        Cancion C1 = SC.cargarCancion();

        System.out.println(C1.toString());

    }

}
