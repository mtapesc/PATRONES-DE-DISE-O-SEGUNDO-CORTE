package patterns.decorator;

import models.Servicio;

// La clase abstracta ServicioDecorator es un decorador base para los servicios
// Hereda de la clase abstracta Servicio
public abstract class ServicioDecorator extends Servicio {
    protected Servicio servicio; // Servicio original al que se le aplicará el decorador

    // Constructor de la clase ServicioDecorator
    // Recibe un servicio al que se le aplicará el decorador
    public ServicioDecorator(Servicio servicio) {
        this.servicio = servicio; // Asignamos el servicio al atributo servicio
    }

    // Método para calcular el costo del servicio
    // Por defecto, devuelve el costo del servicio original
    @Override
    public double calcularCosto() {
        return servicio.calcularCosto();
    }
}