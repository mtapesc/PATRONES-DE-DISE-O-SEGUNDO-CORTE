package patterns.factory;

import models.Impresion;

// La clase ImpresionFactory es una fábrica que crea servicios de tipo Impresion
public class ImpresionFactory {
    // Método que crea y devuelve un nuevo servicio de tipo Impresion
    public Impresion crearImpresion() {
        return new Impresion(); // Retornamos una nueva instancia de Impresion
    }
}