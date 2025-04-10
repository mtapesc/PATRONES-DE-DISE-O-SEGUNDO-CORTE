package patterns.factory;

import models.Impresion;
import patterns.strategy.CostoImpresionStrategy;

// Fábrica concreta para crear servicios de impresión
public class ImpresionFactory {
    public Impresion crearImpresion() {
        // Crear el servicio de impresión
        Impresion impresion = new Impresion();
        // Configurar la estrategia de cálculo de costos
        impresion.setCostoStrategy(new CostoImpresionStrategy());
        return impresion;
    }
}