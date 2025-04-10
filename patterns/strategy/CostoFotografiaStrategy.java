package patterns.strategy;

// La clase CostoFotografiaStrategy implementa la interfaz CostoStrategy
// Define cómo se calcula el costo para el servicio de fotografía
public class CostoFotografiaStrategy implements CostoStrategy {
    // Método que calcula el costo del servicio de fotografía
    // Retorna un costo fijo por cada foto
    @Override
    public double calcularCosto() {
        return 25000.0; // Ejemplo: costo fijo por foto
    }
}