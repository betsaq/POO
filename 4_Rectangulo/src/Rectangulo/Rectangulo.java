//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
// Se deberán además definir os métodos getters, setters y constructores correspondientes.
package Rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo crearRectangulo() {
        Rectangulo R1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = leer.nextInt();

        return R1;
    }

    public void Superficie() {
        double superficie;
        superficie = base * altura;
        System.out.println("La superficie del rectagulo es de: " + superficie);
    }

    public void Perimetro() {
        double Perimetro;
        Perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectagulo es de: " + Perimetro);
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                System.out.print("* ");            }
            System.out.println(" ");        }

    }
}
