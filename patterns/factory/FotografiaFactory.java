package patterns.factory;

import models.Fotografia;
import patterns.strategy.CostoFotografiaStrategy;

// Fábrica concreta para crear servicios de fotografía
public class FotografiaFactory implements ServicioFactory {
    @Override
    public Fotografia crearServicio() {
        Fotografia fotografia = new Fotografia();
        fotografia.setCostoStrategy(new CostoFotografiaStrategy());
        return fotografia;
    }
}