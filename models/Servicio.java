package models;

// La clase abstracta Servicio representa la base para todos los servicios
// No se puede instanciar directamente, pero sirve como plantilla para las clases concretas (como Impresion y Fotografia)
public abstract class Servicio {
    // Atributo protegido que almacena un número identificador del servicio
    protected int numero;

    // Método abstracto para calcular el costo del servicio
    // Las clases que hereden de Servicio deben implementar este método
    public abstract double calcularCosto();

    // Métodos "getter" y "setter" para acceder y modificar el atributo protegido

    // Devuelve el número identificador del servicio
    public int getNumero() {
        return numero;
    }

    // Permite establecer el número identificador del servicio
    public void setNumero(int numero) {
        this.numero = numero;
    }
}