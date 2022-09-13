//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. 
//En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package pkg9_matematica;

import matematica.matematica;

public class Main {

    public static void main(String[] args) {
        matematica M1 = new matematica();

        M1.setNumero1(Math.random() * 10);
        System.out.println(M1.getNumero1());
        M1.setNumero2(Math.random() * 10);
        System.out.println(M1.getNumero2());

        M1.devolverMayor();
        M1.calcularPotencia();
        M1.calculaRaiz();

    }

}
