package patterns.factory;

import models.Fotografia;

// La clase FotografiaFactory es una fábrica que crea servicios de tipo Fotografia
public class FotografiaFactory {
    // Método que crea y devuelve un nuevo servicio de tipo Fotografia
    public Fotografia crearFotografia() {
        return new Fotografia(); // Retornamos una nueva instancia de Fotografia
    }
}