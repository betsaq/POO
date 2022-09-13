//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main.
package Operacion;

import java.util.Scanner;

public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Operacion crearOperacion() {

        Operacion O1 = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos nùmeros para operar");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
        return O1;

    }

    public void sumar() {
        double suma = numero1 + numero2;
        System.out.println("La suma de los numeros es: " + suma);
    }

    public void restar() {
        double resta = numero1 - numero2;
        System.out.println("La resta de los numeros es: " + resta);
    }

    public void multiplicar() {

        if (numero1 != 0 && numero2 != 0) {
            double multiplicacion = numero1 * numero2;
            System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

        } else {
            System.out.println("El resultado es 0, debera ingresar numeros distintos a 0");
        }
    }

    public void dividir() {

        if (numero1 != 0 && numero2 != 0) {
            double division = numero1 / numero2;
            System.out.println("La division de los numeros es: " + division);
        } else {
            System.out.println("El resultado es 0, debera ingresar numeros distintos a 0");

        }

    }
}
