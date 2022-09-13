package Entidades;

import java.util.Scanner;

public class Persona {

    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;
    public double IMC = 0;

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String Sexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona P0 = new Persona();

        System.out.print("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = leer.nextInt();

        System.out.print("Ingrese sexo--> H para hombre, M para mujer , O para otros): ");
        sexo = leer.nextLine();

        if (("H".equals(sexo) || sexo.equals("M")) || sexo.equals("O")) {
            int sexocorrecto = 0;
            sexocorrecto += 1;
        } else {
            System.out.println("INCORRECTO! Ingrese una opción correcta. Ingrese una nueva opción");
        }

        System.out.print("Ingrese el peso: ");
        peso = leer.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = leer.nextDouble();

        return P0;

    }

//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public double calcularIMC(Persona P0) {
        IMC = peso / (altura * altura);

        if (IMC < 20) {
            IMC = -1;
            System.out.println("Su IMC es de " + IMC + ". Usted está por debajo de su peso ideal");

        } else if (IMC >= 20 && IMC <= 25) {
            IMC = 0;
            System.out.println("Su IMC es de " + IMC + ". Usted está en su peso ideal");
        } else if (IMC > 25) {
            IMC = 1;
            System.out.println("Su IMC es de " + IMC + ". Usted tiene sobrepeso");
        }
        return getIMC();
    }

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    public boolean esMayorDeEdad(Persona P0) {
        if (getEdad() >= 18) {
            System.out.println("La persona es mayor de edad.");
            return true;
        } else {
            System.out.println("La persona es menor de edad.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Edad=" + edad + ", Sexo=" + sexo + ", Peso=" + peso + ", Altura=" + altura + '}';
    }

}
