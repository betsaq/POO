//Crea una clase en Java donde declares una variable de tipo array de Strings que
//contenga los doce meses del año, en minúsculas. A continuación, declara una variable
//mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
//mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
//Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
//adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//¡Ha acertado!
package mes;

import java.util.Scanner;

public class meses {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String messsecreto = mes[2];
    private String mesElegido;

    public meses() {
    }

    public meses(String mesElegido) {
        this.mesElegido = mesElegido;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesssecreto() {
        return messsecreto;
    }

    public void setMesssecreto(String messsecreto) {
        this.messsecreto = messsecreto;
    }

    public String getMesElegido() {
        return mesElegido;
    }

    public void setMesElegido(String mesElegido) {
        this.mesElegido = mesElegido;
    }

    public void elegirmes() {
        Scanner leer = new Scanner(System.in);

        System.out.println("VAMOS A JUGAR UN JUEGO!. "
                + "Intenta adivinar el mes secreto. Introduzca el nombre del mes en minúsculas");
        setMesElegido(leer.nextLine());

        while (!getMesssecreto().equals(getMesElegido())) {

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            setMesElegido(leer.nextLine());
        }

        System.out.println("¡Ha acertado! ");

    }
}
