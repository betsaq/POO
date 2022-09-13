package Cadena;

import java.util.Scanner;

public class Cadena {

    Scanner leer = new Scanner(System.in);
    private String frase;
    private int longitud;
    private String letra;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void mostrarVocales() {
        int vocal = 0;
        for (int i = 0; i < getLongitud(); i++) {
            if ((getFrase().charAt(i) == 'a') || (getFrase().charAt(i) == 'e') || (getFrase().charAt(i) == 'i') || (getFrase().charAt(i) == 'o') || (getFrase().charAt(i) == 'u')) {
                vocal++;
            }
        }
        System.out.println("En la frase hay " + vocal + " vocales.");
    }

    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += getFrase().charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

//• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    //--------------------------------------NO REPITE LA LETRA- NO CONTABILIZA ----------------------------------------
    //--------------------------------------NO REPITE LA LETRA- NO CONTABILIZA ----------------------------------------
    //--------------------------------------NO REPITE LA LETRA- NO CONTABILIZA ----------------------------------------
    //--------------------------------------NO REPITE LA LETRA- NO CONTABILIZA ----------------------------------------
    public void vecesRepetido(String letra) {
        int repite = 0;
        for (int i = 0; i < getLongitud(); i++) {
            if (getLetra().equals(getFrase().charAt(i))){
                repite++;
             }
            
        }    System.out.println("La letra: '" + letra + "' se repite " + repite + " veces.");
    }

    public void compararLongitud(String getFrase) {
        System.out.print("Ingrese una nueva frase para comprobar su longitud: ");
        String nuevaFrase = leer.nextLine();
        int longitudNuevaFrase = nuevaFrase.length();
        if (longitudNuevaFrase == getFrase.length()) {
            System.out.println("Las frases tienen igual longitud");
        } else {
            System.out.println("Las frases NO tienen igual longitud");
        }
    }
   
    public void unirFrases(String getFrase) {
        System.out.print("Ingrese una nueva frase a unir: ");
        String nuevaFrase = leer.nextLine();
        System.out.println(nuevaFrase.concat(getFrase()));
    }

    public void reemplazar(String letra) {
        letra = "a";
        System.out.print("Ingrese un caracter para reemplazar la letra 'A': ");
        String letraRemplazo = leer.nextLine();
        System.out.println(getFrase().replaceAll(letra, letraRemplazo));
    }

    public void contiene(String letra) {
        System.out.println("Que letra desea buscar???");
        String letraBuscada = leer.nextLine();
        System.out.println(getFrase().contains(letraBuscada));

    }

}
