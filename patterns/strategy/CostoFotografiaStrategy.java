package patterns.strategy;

// Estrategia para calcular el costo de fotografía
public class CostoFotografiaStrategy implements CostoStrategy {
    @Override
    public double calcularCosto() {
        return 10.0; // Costo fijo por fotografía
    }
}