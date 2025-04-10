package models;

// Importamos la interfaz CostoStrategy para definir cómo se calcula el costo
import patterns.strategy.CostoStrategy;

// La clase Fotografia representa un servicio de fotografía
// Hereda de la clase abstracta Servicio
public class Fotografia extends Servicio {
    // Atributos privados específicos del servicio de fotografía
    private String tipoFotografia; // Tipo de fotografía (por ejemplo, arte, etc.)
    private int cantidadFotos; // Cantidad de fotos solicitadas
    private CostoStrategy costoStrategy; // Estrategia para calcular el costo del servicio

    // Método para establecer la estrategia de cálculo de costo
    public void setCostoStrategy(CostoStrategy costoStrategy) {
        this.costoStrategy = costoStrategy; // Asignamos la estrategia al atributo costoStrategy
    }

    // Método que calcula el costo total del servicio
    // Se multiplica el costo definido por la estrategia por la cantidad de fotos
    @Override
    public double calcularCosto() {
        return costoStrategy.calcularCosto() * cantidadFotos;
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos privados

    // Devuelve el tipo de fotografía
    public String getTipoFotografia() {
        return tipoFotografia;
    }

    // Permite establecer el tipo de fotografía
    public void setTipoFotografia(String tipoFotografia) {
        this.tipoFotografia = tipoFotografia;
    }

    // Devuelve la cantidad de fotos solicitadas
    public int getCantidadFotos() {
        return cantidadFotos;
    }

    // Permite establecer la cantidad de fotos solicitadas
    public void setCantidadFotos(int cantidadFotos) {
        this.cantidadFotos = cantidadFotos;
    }
}