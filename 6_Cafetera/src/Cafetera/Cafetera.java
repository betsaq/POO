package Cafetera;

import java.util.Scanner;

public class Cafetera {

    Scanner leer = new Scanner(System.in);
    private int capacidadMaxima = 1000;// capacidad maxima de la cafetera 1000 ml/Litros
    private int cantidadActual = 0;
    private int taza;
    private int cantidadCafe;

    public Cafetera() {
       
    }

    public Cafetera(int taza, int cantidadCafe, int cantidadActual, int capacidadMaxima) {
        this.taza = taza;
        this.cantidadCafe = cantidadCafe;
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;

    }
        
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getTaza() {
        return taza;
    }

    public void setTaza(int taza) {
        this.taza = taza;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

        
    /*• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.*/
    public Cafetera llenarCafetera() {
        Cafetera Cafe1 = new Cafetera();
        cantidadActual += capacidadMaxima;
        System.out.println("La Cantidad actual es de " + cantidadActual + " ml.");
        return Cafe1;
        
        
    }
    //• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.     

    public void servirTaza(int taza) {

        System.out.print("¿De que tamaño es la taza vacia??: ");
        taza = leer.nextInt();
        System.out.println("La taza a rellenar es de: " + taza + " ml.");
        if (taza > cantidadActual) {
            System.out.println("No alcanza para una taza. Recarga la cafetera!");
        } else {
            cantidadActual -= taza;
            System.out.println("En la cafetera quedan "+cantidadActual+ " ml.");
        }

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera se ha vaciado, limite actual: " + cantidadActual);

    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cantidadCafe) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Que cantidad de cafe desea agregar???: ");
        cantidadCafe = leer.nextInt();

        cantidadActual += cantidadCafe;
        System.out.println("La cantidad de cafe a agregar es de: " + cantidadCafe);
        // si se excede, dejar en el maximo
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
        System.out.println("La capacidad Actual en la cafetera es de: "+ cantidadActual);
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + ", taza=" + taza + ", cantidadCafe=" + cantidadCafe + '}';
    }
}
