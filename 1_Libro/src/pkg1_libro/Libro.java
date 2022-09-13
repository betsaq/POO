package pkg1_libro;

import java.util.Scanner;

public class Libro {
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío.

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int paginas;
    
    public Libro() {
    }
    
    public Libro(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    //    Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.
    
    public Libro CrearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese ISBN del Libro");
        int ISBN = leer.nextInt();
        
        System.out.println("Ingrese título del Libro");
        String titulo = leer.next();
        
        System.out.println("Ingrese autor del Libro");
        String Autor = leer.next();
        
        System.out.println("¿Cuántas páginas tiene el libro?");
        int paginas = leer.nextInt();
        
        return new Libro(ISBN, titulo, Autor, paginas);
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Título=" + Titulo + ", Autor=" + Autor + ", Páginas=" + paginas + '}';
    }
}

    
