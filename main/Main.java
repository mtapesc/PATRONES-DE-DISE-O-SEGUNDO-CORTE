package main;

import models.*;
import patterns.factory.*;
import patterns.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        // Creamos un cliente con su cédula y nombre
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear servicio de impresión
        // Usamos la fábrica de impresión para crear un servicio de tipo Impresion
        ImpresionFactory impresionFactory = new ImpresionFactory();
        Impresion impresion = impresionFactory.crearImpresion();

        // Configuramos el color de la impresión
        impresion.setColor("Color");

        // Agregamos imágenes al servicio de impresión
        impresion.agregarImagen(new Imagen("imagen1.jpg"));
        impresion.agregarImagen(new Imagen("imagen2.jpg"));

        // Configuramos la estrategia de cálculo de costo para el servicio de impresión
        impresion.setCostoStrategy(new CostoImpresionStrategy());

        // Mostrar detalles del servicio de impresión
        System.out.println("=== Servicio de Impresión ===");
        System.out.println("Color: " + impresion.getColor());
        System.out.println("Cantidad de imágenes: " + impresion.getImagenes().size());
        System.out.println("Costo total: " + impresion.calcularCosto());
        System.out.println("---------------------------");

        // Crear servicio de fotografía
        // Usamos la fábrica de fotografía para crear un servicio de tipo Fotografia
        FotografiaFactory fotografiaFactory = new FotografiaFactory();
        Fotografia fotografia = fotografiaFactory.crearFotografia();

        // Configuramos el tipo de fotografía
        fotografia.setTipoFotografia("Retrato");

        // Configuramos la cantidad de fotos
        fotografia.setCantidadFotos(3);

        // Configuramos la estrategia de cálculo de costo para el servicio de fotografía
        fotografia.setCostoStrategy(new CostoFotografiaStrategy());

        // Mostrar detalles del servicio de fotografía
        System.out.println("=== Servicio de Fotografía ===");
        System.out.println("Tipo de fotografía: " + fotografia.getTipoFotografia());
        System.out.println("Cantidad de fotos: " + fotografia.getCantidadFotos());
        System.out.println("Costo total: " + fotografia.calcularCosto());
        System.out.println("---------------------------");

        // Calcular y mostrar el total del pedido
        double totalPedido = impresion.calcularCosto() + fotografia.calcularCosto();
        System.out.println("=== Resumen del Pedido ===");
        System.out.println("Cliente: " + cliente.getNombre() + " (Cédula: " + cliente.getCedula() + ")");
        System.out.println("Total del pedido: " + totalPedido);
    }
}