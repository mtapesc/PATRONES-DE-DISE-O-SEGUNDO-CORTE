package models;

// La clase Imagen representa una imagen que puede ser utilizada en el servicio de impresión
public class Imagen {
    // Atributo privado que almacena el nombre o ruta del fichero de la imagen
    private String fichero;

    // Constructor de la clase Imagen
    // Este método se llama cuando se crea una nueva imagen y se le asigna un fichero
    public Imagen(String fichero) {
        this.fichero = fichero; // Asignamos el nombre o ruta del fichero al atributo fichero
    }

    // Método para imprimir la imagen
    // Muestra un mensaje en la consola indicando que se está imprimiendo la imagen
    public void print() {
        System.out.println("Imprimiendo imagen: " + fichero);
    }

    // Métodos "getter" y "setter" para acceder y modificar el atributo privado

    // Devuelve el nombre o ruta del fichero de la imagen
    public String getFichero() {
        return fichero;
    }

    // Permite cambiar el nombre o ruta del fichero de la imagen
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
}