//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura. La clase incluirá un método para crear el
//rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
//método para calcular la superficie del rectángulo y un método para calcular el
//perímetro del rectángulo. Por último, tendremos un método que dibujará el
//rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package pkg4_rectangulo;

import Rectangulo.Rectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo R1 = new Rectangulo();
        R1.crearRectangulo();
        R1.Superficie();
        R1.Perimetro();
        R1.dibujarRectangulo();

    }

}
