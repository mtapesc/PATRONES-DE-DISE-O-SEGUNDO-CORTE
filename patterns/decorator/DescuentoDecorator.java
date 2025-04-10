package patterns.decorator;

import models.Servicio;

// La clase DescuentoDecorator es un decorador que aplica un descuento a un servicio
// Hereda de la clase abstracta ServicioDecorator
public class DescuentoDecorator extends ServicioDecorator {
    private double descuento; // Monto del descuento que se aplicará al servicio

    // Constructor de la clase DescuentoDecorator
    // Recibe un servicio al que se le aplicará el descuento y el monto del descuento
    public DescuentoDecorator(Servicio servicio, double descuento) {
        super(servicio); // Llamamos al constructor de la clase base (ServicioDecorator)
        this.descuento = descuento; // Asignamos el descuento al atributo descuento
    }

    // Método para calcular el costo total del servicio
    // Resta el monto del descuento al costo original del servicio
    @Override
    public double calcularCosto() {
        return super.calcularCosto() - descuento;
    }
}