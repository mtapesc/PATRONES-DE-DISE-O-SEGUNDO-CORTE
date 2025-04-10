package patterns.factory;

import models.Fotografia;
import patterns.strategy.CostoFotografiaStrategy;

// Fábrica concreta para crear servicios de fotografía
public class FotografiaFactory {
    public Fotografia crearServicio() {
        Fotografia fotografia = new Fotografia();
        fotografia.setCostoStrategy(new CostoFotografiaStrategy());
        return fotografia;
    }
}