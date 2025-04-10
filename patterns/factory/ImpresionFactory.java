package patterns.factory;

import models.Impresion;
import patterns.strategy.CostoImpresionStrategy;

// Fábrica concreta para crear servicios de impresión
public class ImpresionFactory {
    public Impresion crearServicio() {
        Impresion impresion = new Impresion();
        impresion.setCostoStrategy(new CostoImpresionStrategy());
        return impresion;
    }
}