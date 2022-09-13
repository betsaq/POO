//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
package pkg11_date;

import Service.Servicio;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Servicio fecha1 = new Servicio();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt(); //calendario.get(Calendar.MONTH);
        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt(); //calendario.get(Calendar.YEAR);

        Date fecha = new Date(dia, mes, anio);
        Date fechaActual = new Date();

        fecha.setDate(dia);
        fecha.setMonth(mes-1);
        fecha.setYear(anio-1900);

        fecha1.mostrarFecha(fecha);

        //ingrese la fecha 26/01/1988 = 26 para el dia, 0 para el mes y 88 para el año
        System.out.println("La fecha ingresada es: " + fecha.toLocaleString());
        System.out.println("La fecha actual es: " + fechaActual.toLocaleString());

        //DIFERENCIA DE AÑOS
        int anios = fechaActual.getYear() - fecha.getYear();
        System.out.println("la diferencia entre la fecha ingresada y la actual es de: " + anios + " años. ");

    }

//   - Un año “y” se representa por el entero y – 1.900. Por ejemplo el año 1982 se representaría por el entero 1982 – 1900 = 82. 
//De este modo, 82 representa 1982 y 92 representa 1992.
//- Los meses son representados desde 0 hasta 11, así Enero es 0 y Diciembre es 11.
//- Los días son normalmente representados desde 1 al 31.
//- Las horas desde 0 a 23.
//- Los minutos van desde 0 a 59.
//- Los segundos normalmente van desde 0 hasta 59. (Excepcionalmente pueden existir los segundos 60 y 61 para los años bisiestos).
}
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=618:clase-date-del-api-java-metodos-before-after-tolocalestring-togmtstring-y-gettime-ejemplos-cu00924c&catid=58&Itemid=180
