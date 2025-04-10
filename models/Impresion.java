package models;

import patterns.strategy.CostoStrategy; // Importamos la interfaz para definir cómo se calcula el costo
import java.util.ArrayList;
import java.util.List;

// La clase Impresion representa un servicio de impresión
// Hereda de la clase abstracta Servicio
public class Impresion extends Servicio {
    // Atributos privados específicos del servicio de impresión
    private String color; // Indica si la impresión es a color o en blanco y negro
    private List<Imagen> imagenes = new ArrayList<>(); // Lista de imágenes que se van a imprimir
    private CostoStrategy costoStrategy; // Estrategia para calcular el costo del servicio

    // Método para agregar una imagen a la lista de imágenes
    public void agregarImagen(Imagen imagen) {
        imagenes.add(imagen); // Añadimos la imagen a la lista
    }

    // Método para establecer la estrategia de cálculo de costo
    public void setCostoStrategy(CostoStrategy costoStrategy) {
        this.costoStrategy = costoStrategy; // Asignamos la estrategia al atributo costoStrategy
    }

    // Método que calcula el costo total del servicio
    // Se multiplica el costo definido por la estrategia por la cantidad de imágenes
    @Override
    public double calcularCosto() {
        return costoStrategy.calcularCosto() * imagenes.size();
    }

    // Métodos "getter" y "setter" para acceder y modificar los atributos privados

    // Devuelve si la impresión es a color o en blanco y negro
    public String getColor() {
        return color;
    }

    // Permite establecer si la impresión es a color o en blanco y negro
    public void setColor(String color) {
        this.color = color;
    }

    // Devuelve la lista de imágenes que se van a imprimir
    public List<Imagen> getImagenes() {
        return imagenes;
    }
}