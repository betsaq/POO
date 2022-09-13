package Service;

import java.util.Date;

public class Servicio {

    private Date fecha;
    private Date fechaActual;

    public Servicio() {
        fecha = new Date();
        fechaActual = new Date();
    }

    public Servicio(Date fecha, Date fechaActual) {
        this.fecha = fecha;
        this.fechaActual = fechaActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void llenarFecha(Date fecha) {

        this.fecha = fecha; // Lo guardamos en el atributo

    }

    public void mostrarFecha(Date fecha) {

        System.out.println("Dia:" + fecha.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fecha.getMonth() // Mostramos el mes 
                + " Año:" + fecha.getYear()); // Mostramos el año

    }

    @Override
    public String toString() {
        return "Servicio{" + "fecha=" + fecha + ", fechaActual=" + fechaActual + '}';
    }

}
