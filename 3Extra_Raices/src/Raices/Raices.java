package Raices;

import java.util.Scanner;

public class Raices {

    private double a = 3;
    private double b = 2;
    private double c = 1;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Scanner leer = new Scanner(System.in);

//• Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public void getDiscriminante() {

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        System.out.println("El discriminante es: " + discriminante);

    }

//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public void tieneRaices() {

        boolean tiene;

        tiene = (Math.pow(b, 2) - 4 * a * c) >= 0;
        System.out.println("Tiene 2 soluciones?: " + tiene);

    }

//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
//para que esto ocurra, el discriminante debe ser igual que 0.
    public void tieneRaiz() {

        boolean tieneUno;
        
        tieneUno = (Math.pow(b, 2) - 4 * a * c) == 0;
        
        System.out.println("Tiene una única solución?: " + tieneUno);

    }

//• Método obtenerRaices(): llama a tieneRaices() y si devolvió́true, imprime las 2
//posibles soluciones.
    public void obtenerRaices(){
     
       
        if (this.tieneRaices()){
            
            System.out.println((Math.pow(b, 2) - 4 * a * c));
        } else {
            System.out.println("No tiene 2 soluciones");
        }
        
        System.out.println("");
        
    }
       
    
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz(){
        this.tieneRaiz();
        
        if (tieneRaiz()==true){
            
            System.out.println("La raiz cuadrada es: " + (Math.pow(b, 2) - 4 * a * c));
        } else {
            System.out.println("No tiene solución");
        }
        
    }
    
    
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
//caso de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b 
    
    public void calcular(){
        
        
        
        System.out.println("");
        
    }
    
    
    
    
    
}
