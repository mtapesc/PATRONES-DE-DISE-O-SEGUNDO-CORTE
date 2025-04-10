package patterns.factory;

import models.Impresion;
import models.Servicio;

// La clase ImpresionFactory es una fábrica que crea servicios de tipo Impresion
// Hereda de la clase abstracta ServicioFactory
public class ImpresionFactory extends ServicioFactory {
    // Método que crea y devuelve un nuevo servicio de tipo Impresion
    @Override
    public Servicio crearServicio() {
        return new Impresion(); // Retornamos una nueva instancia de Impresion
    }
}