package ServicioCancion;

import EntidadesCancion.Cancion;
import java.util.Scanner;

public class Servicio {

    public Cancion cargarCancion() {

        System.out.println("Ingrese el titulo de la cancion: ");
        Scanner leer = new Scanner(System.in);
        String titulo = leer.nextLine();

        System.out.println("Ingrese autor de la cancion: ");
        String autor = leer.nextLine();

        return new Cancion(titulo, autor);

    }

}
