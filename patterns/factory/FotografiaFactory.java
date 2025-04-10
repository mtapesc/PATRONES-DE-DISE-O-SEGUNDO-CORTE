package patterns.factory;

import models.Fotografia;
import patterns.strategy.CostoFotografiaStrategy;

// Fábrica concreta para crear servicios de fotografía
public class FotografiaFactory {
    public Fotografia crearFotografia() {
        // Crear el servicio de fotografía
        Fotografia fotografia = new Fotografia();
        // Configurar la estrategia de cálculo de costos
        fotografia.setCostoStrategy(new CostoFotografiaStrategy());
        return fotografia;
    }
}