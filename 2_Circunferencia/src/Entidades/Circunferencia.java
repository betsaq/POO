//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package Entidades;

import java.util.Scanner;

public class Circunferencia {

    public double radio;
    public double perimetro;
    public double area;
    public double pi = 3.14;
    
     
    public Circunferencia() {
    }

    public Circunferencia(double radio, double perimetro, double area, double pi) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    // ----------------METODO CREAR CIRCUNFERENCIA --------------
    //pedir radio y guardarlo en el atributo del objeto 
    public Circunferencia crearCircunferencia() {
        //Insto objeto
        Circunferencia C1 = new Circunferencia();

        //lleno los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
        return C1;
    }


    public void crearArea() {
        area = Math.PI * radio;
        System.out.println("El area de la circunferencia es " + area);
      
    }

    
    public void crearPerimetro() {
        perimetro = 2 * pi * radio;
        System.out.println("El perímetro de la circunferenia es " + perimetro);
    }

}
