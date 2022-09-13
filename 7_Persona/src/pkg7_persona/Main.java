//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//otro atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, 
//calcular un porcentaje de esas 4
//personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//cuantos menores.
package pkg7_persona;

import Entidades.Persona;

public class Main {

    public static void main(String[] args) {
        int pesoBajo = 0;
        int pesoIdeal = 0;
        int sobrepreso = 0;

        int personaMayor = 0;
        int personaMenor = 0;

        Persona P1 = new Persona("Betsa", 34, "M", 60, 1.67);
        System.out.println(P1);

        if (P1.calcularIMC(P1) == -1) {
            pesoBajo++;
        } else if (P1.calcularIMC(P1) == 0) {
            pesoIdeal++;
        } else if (P1.calcularIMC(P1) == 1) {
            sobrepreso++;
        }

        if (P1.esMayorDeEdad(P1)
                == true) {
            personaMayor++;
        } else {
            personaMenor++;
        }

        System.out.println(
                " ");

        Persona P2 = new Persona();
        P2.nombre = "Celeste";
        P2.edad = 32;
        P2.sexo = "M";
        P2.peso = 60;
        P2.altura = 1.56;

        System.out.println(P2);

        if (P2.calcularIMC(P2)
                == -1) {
            pesoBajo++;
        } else if (P2.calcularIMC(P2)
                == 0) {
            pesoIdeal++;
        } else if (P2.calcularIMC(P2)
                == 1) {
            sobrepreso++;
        }

        if (P2.esMayorDeEdad(P2)
                == true) {
            personaMayor++;
        } else {
            personaMenor++;
        }

        System.out.println(
                " ");

        Persona P3 = new Persona();
        P3.nombre = "Pedro";
        P3.edad = 13;
        P3.sexo = "H";
        P3.peso = 35;
        P3.altura = 1.54;

        System.out.println(P3);

        if (P3.calcularIMC(P3)== -1) {
            pesoBajo++;
        } else if (P3.calcularIMC(P3)
                == 0) {
            pesoIdeal++;
        } else if (P3.calcularIMC(P3)
                == 1) {
            sobrepreso++;
        }

        if (P3.esMayorDeEdad(P3)
                == true) {
            personaMayor++;
        } else {
            personaMenor++;
        }

        System.out.println(
                " ");

        Persona P4 = new Persona();
        P4.nombre = "Ramiro";
        P4.edad = 21;
        P4.sexo = "O";
        P4.peso = 65;
        P4.altura = 1.52;

        System.out.println(P4);

        if (P4.calcularIMC(P4)== -1) {
            pesoBajo++;
        } else if (P4.calcularIMC(P4)== 0) {
            pesoIdeal++;
        } else if (P4.calcularIMC(P4)== 1) {
            sobrepreso++;
        }

        if (P4.esMayorDeEdad(P4)
                == true) {
            personaMayor++;
        } else {
            personaMenor++;
        }

        System.out.println(
                "");


        int porcentajepesoBajo = pesoBajo * 100 / 4;
        int porcentajepesoIdeal = pesoIdeal * 100 / 4;
        int porcentajeSobrepreso = sobrepreso * 100 / 4;

        System.out.println(
                "Personas con bajo peso: " + pesoBajo + ". Personas con peso ideal: " + pesoIdeal + ". Personas con sobrepeso: " + sobrepreso + ".");
        System.out.println(
                "Porcentaje con bajo peso: " + porcentajepesoBajo + " %. Porcentaje con peso ideal: " + porcentajepesoIdeal + "%. Porcentaje con sobrepeso: " + porcentajeSobrepreso + "%.");

        int porcentajeMayor = personaMayor * 100 / 4;
        int porcentajeMenor = personaMenor * 100 / 4;

        System.out.println(
                "Mayores: " + personaMayor + ". Menores:  " + personaMenor + ".");
        System.out.println(
                "Porcentaje de mayores: " + porcentajeMayor + "%. Porcentaje menores: " + porcentajeMenor + "%.");
    }
}

//            
//            System.out.println("Su IMC es de " + IMC + ". Usted está por debajo de su peso ideal");
//        } else if (IMC >= 20 && IMC <= 25) {
//            IMC = 0;
//            System.out.println("Su IMC es de " + IMC + ". Usted está en su peso ideal");
//        } else if (IMC > 25) {
//            IMC = 1;
//            System.out.println("Su IMC es de " + IMC + ". Usted tiene sobrepeso");
//        }
