//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package matematica;

public class matematica {

    public double numero1;
    public double numero2;

    public matematica() {
    }

    public matematica(double numero1, double numero2) {
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

    //  -------------------------------
    public void devolverMayor() {

        double maximo = Math.max(getNumero1(), getNumero2());
        System.out.println("El numero mayor es: " + maximo);
    }

    public void calcularPotencia() {

        double num1 = Math.round(getNumero1());
        double num2 = Math.round(getNumero2());

        double maximo = Math.max(num2, num1);
        double minimo = Math.min(num2, num1);

        System.out.println("Potencia de " + maximo + ", elevado a " + minimo + " es: " + Math.pow(maximo, minimo) + ".");
    }

    public void calculaRaiz() {

        double minimo = Math.min(getNumero1(), getNumero2());
        System.out.println("La raiz cuadrada de: " + minimo + " es: " + Math.sqrt(Math.abs(minimo)));
    }
}
