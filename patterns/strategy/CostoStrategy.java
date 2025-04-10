package patterns.strategy;

// La interfaz CostoStrategy define una estrategia para calcular el costo de un servicio
// Las clases que implementen esta interfaz deben proporcionar su propia lógica para calcular el costo
public interface CostoStrategy {
    // Método que calcula el costo del servicio
    // Cada implementación definirá cómo se calcula el costo
    double calcularCosto();
}