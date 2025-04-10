package patterns.strategy;

// Estrategia para calcular el costo de impresión
public class CostoImpresionStrategy implements CostoStrategy {
    @Override
    public double calcularCosto() {
        return 5.0; // Costo fijo por imagen
    }
}