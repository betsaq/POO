package Persona;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;
    private Date fechaActual;

    private int edad;
    private boolean P1;

    public Persona() {
        fechaDeNacimiento = new Date();
        fechaActual = new Date();
    }

    public Persona(String nombre, Date fechaDeNacimiento, int edad) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void crearPersona() {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();

        fechaDeNacimiento.setDate(dia); // Seteamos el dia
        fechaDeNacimiento.setMonth(mes-1); // Seteamos el mes
        fechaDeNacimiento.setYear(anio-1900);

        System.out.println("Fecha de nacimiento ingresada es: " + fechaDeNacimiento.toLocaleString());
    }

    public void calcularEdad() {

        edad = fechaActual.getYear() - (fechaDeNacimiento.getYear());

        System.out.println("La edad de la persona es de: " + edad);

    }

    public void menorQue(int edad) {

        if (getEdad() < edad) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    //• Metodo mostrarPersona(): este método muestra la persona creada en el método
    //anterior.

    public void mostrarPersona(Persona P1) {

        System.out.println("Nombre: " + P1.getNombre()
                + ". Fecha de Nacimiento: " + P1.getFechaDeNacimiento()
                + ". Edad: " + P1.getEdad() +".");

    }
    
     public void conocerPersona(Persona P1){
        
        System.out.println("la persona se llama: "+ P1.getNombre());
        
    }

}
