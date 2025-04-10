package patterns.factory;

import models.Fotografia;
import models.Servicio;

// La clase FotografiaFactory es una fábrica que crea servicios de tipo Fotografia
// Hereda de la clase abstracta ServicioFactory
public class FotografiaFactory extends ServicioFactory {
    // Método que crea y devuelve un nuevo servicio de tipo Fotografia
    @Override
    public Servicio crearServicio() {
        return new Fotografia(); // Retornamos una nueva instancia de Fotografia
    }
}