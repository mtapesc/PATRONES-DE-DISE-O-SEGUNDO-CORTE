package patterns.decorator;

import models.Servicio;

// La clase CostoExtraDecorator es un decorador que agrega un costo extra a un servicio
// Hereda de la clase abstracta ServicioDecorator
public class CostoExtraDecorator extends ServicioDecorator {
    private double costoExtra; // Monto del costo extra que se agregará al servicio

    // Constructor de la clase CostoExtraDecorator
    // Recibe un servicio al que se le aplicará el costo extra y el monto del costo extra
    public CostoExtraDecorator(Servicio servicio, double costoExtra) {
        super(servicio); // Llamamos al constructor de la clase base (ServicioDecorator)
        this.costoExtra = costoExtra; // Asignamos el costo extra al atributo costoExtra
    }

    // Método para calcular el costo total del servicio
    // Suma el costo original del servicio al costo extra
    @Override
    public double calcularCosto() {
        return super.calcularCosto() + costoExtra;
    }
}