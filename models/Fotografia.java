package models;

import patterns.strategy.CostoStrategy;

// La clase Fotografia representa un servicio de fotografía
public class Fotografia extends Servicio {
    private String tipoFotografia; // Tipo de fotografía (por ejemplo, retrato, paisaje, etc.)
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

    public String getTipoFotografia() {
        return tipoFotografia;
    }

    public void setTipoFotografia(String tipoFotografia) {
        this.tipoFotografia = tipoFotografia;
    }

    public int getCantidadFotos() {
        return cantidadFotos;
    }

    public void setCantidadFotos(int cantidadFotos) {
        this.cantidadFotos = cantidadFotos;
    }
}