package patterns.strategy;

// La clase CostoImpresionStrategy implementa la interfaz CostoStrategy
// Define cómo se calcula el costo para el servicio de impresión
public class CostoImpresionStrategy implements CostoStrategy {
    // Método que calcula el costo del servicio de impresión
    // Retorna un costo fijo por cada imagen
    @Override
    public double calcularCosto() {
        return 5.0; // Ejemplo: costo fijo por imagen
    }
}